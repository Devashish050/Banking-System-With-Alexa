
<!DOCTYPE html>
<html lang="en">
<head>
<title>BSWA | Apply For Loan</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/payloan-icon.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/icofont.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/animate.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/settings.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/slick.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/owl.theme.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/owl.carousel.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/preset.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/theme.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/responsive.css" />

<link rel="icon" type="image/png"
	href="<%=request.getContextPath()%>/userResources/image/favicon.png">

<style type="text/css">
.tblebel {
	font-weight: bold;
	font-family: inherit;
	color: #8180e0;
	font-size: 1.2em;
}

.tebdesidn {
	width: 100%;
	border: 2px solid #8180e0;
	box-shadow: 0 8px 1px #CCCCCC;
	font-family: sans-serif;
	font-size: 16px;
}
</style>

<script type="text/javascript">
	function fn2() {

		var loanTypeId = document.getElementById("loanType");
		var loanRateId = document.getElementById("loanRate");

		var htp = new XMLHttpRequest();

		loanRateId.innerHTML = "";
		var loanID = '';
		htp.onreadystatechange = function() {
			if (htp.readyState == 4) {

				console.log(htp.responseText);
				var jsn = JSON.parse(htp.responseText);
				console.log(jsn);

				console.log('loan rate id:: ', jsn.id)
				console.log('loan raate :::', jsn.loanRate)
				console.log('loan type id :::', jsn.loanTypeVO.id)

				var opt = document.createElement("option");
				opt.value = jsn.id;
				opt.text = jsn.loanRate;
				loanRateId.options.add(opt);
				loanID = jsn.loanTypeVO.id;
				console.log('loanId :::', loanID);

				console.log('loanId before function calling:::', loanID);
				getLoanDocument(loanID);

			}
		}

		htp.open("get", "ajaxLoanRateSearch?loanTypeId=" + loanTypeId.value,
				true);
		htp.send();

	}

	function getLoanDocument(x) {

		//alert("in function2");
		console.log('function2');
		console.log('loanId', x)

		var tableData = document.getElementById("idProofData");
		var tableData1 = document.getElementById("residenceProofData");

		var lid = document.getElementById("lid");
		var lid1 = document.getElementById("lid1");

		var htp = new XMLHttpRequest();

		htp.onreadystatechange = function() {

			if (htp.readyState == 4) {

				tableData.innerHTML = "";

				var jsn = JSON.parse(htp.responseText);
				console.log(jsn);
				console.log(jsn.length);

				if (jsn.length > 0) {

					var data = "";
					var data1 = "";
					var count = 1;
					var count1 = 1;

					for (var i = 0; i < jsn.length; i++) {

						var responseData = jsn[i];

						if (responseData.documentType === 'IdProof') {
							data = data + '<tr>' + '<td>' + count + '</td>'
									+ '<td>' + responseData.docsVO.docsName
									+ '</td>' + '</tr>';
							count++;

						}

						if (responseData.documentType === 'ResidentProof') {
							data1 = data1 + '<tr>' + '<td>' + count1 + '</td>'
									+ '<td>' + responseData.docsVO.docsName
									+ '</td>' + '</tr>';
							count1++;
						}

					}

					lid.style.display = "";
					lid1.style.display = "";

					tableData.style.display = "";
					tableData.innerHTML = data;

					tableData1.style.display = "";
					tableData1.innerHTML = data1;
				}
			}
		}
		htp.open("get", "ajaxLoanDocs?loanTypeId=" + x, true);
		htp.send();
	}
</script>
</head>
<body class="bg_right">



	<jsp:include page="header.jsp"></jsp:include>

	<section class="pagebanner">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="bannerTitle text-left">
						<h2>Loan Application Form</h2>
						<p>
							We are here to help you when you need your<br>financial
							support, then we are help you.
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>


	<section class="commonSection applicationPage">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<div class="formArea appareaBG">
						<%@taglib prefix="f"
							uri="http://www.springframework.org/tags/form"%>
						<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

						<f:form action="insertLoanApply" method="post"
							modelAttribute="ApplyForLoanVO" class="applicationForm row"
							enctype="multipart/form-data">

							<f:hidden path="id" />


							<div class="col-lg-6 col-md-4">

								<label class="label">LoanType</label>

								<f:select class="form-control mb-5" path="loanTypeVO.id"
									onchange="fn2()" id="loanType" required="required"
									select="selected">
									<c:forEach items="${loanTypeList}" var="i">
										<f:option value="${i.id}">${i.loanType}</f:option>
									</c:forEach>
								</f:select>

							</div>


							<div class="col-lg-6 col-md-4">
								<label class="label">LoanRate</label>
								<f:select path="manageLoanRateVO.id" class="form-control mb-5"
									id="loanRate" required="required">
									<option value=""></option>
								</f:select>
							</div>


							<div class="col-lg-6 col-md-4" id="idProofDiv">
								<div class="custom-file overflow-hidden rounded-pill mb-5">

									<input type="file" name="idProofFile"
										class="custom-file-input rounded-pill"> <label
										for="idProofFile" class="custom-file-label rounded-pill">Id
										Proof Document </label>


								</div>
							</div>



							<div class="col-lg-6 col-md-4" id="residentProofDiv">
								<div class="custom-file overflow-hidden rounded-pill mb-5">

									<input type="file" name="residentProofFile"
										class="custom-file-input rounded-pill"> <label
										for="residentProofFile" class="custom-file-label rounded-pill">Resident
										Proof Document </label>

								</div>
							</div>




							<div class="col-lg-6 col-md-4" id="lid" style="display: none">
								<label class="label tblebel">Required IdProof Documents
									For Loan</label>
								<table id="idProofData" class="tebdesidn" border="1px solid black"></table>
							</div>

							<div class="col-lg-6 col-md-4" id="lid1" style="display: none">
								<label class="label tblebel">Required Resident Documents
									For Loan</label>
								<table id="residenceProofData" class="tebdesidn" border="1px solid black"></table>
							</div>


							<f:hidden path="loginVO.id" />
							<input type="hidden" name="docStatus" value="pending">

							<div class="col-lg-12  col-md-12">
								<button type="submit" value="submit" class="common_btn">Apply
									Now</button>
							</div>

						</f:form>
					</div>
				</div>
			</div>
		</div>
	</section>


	<jsp:include page="footer.jsp"></jsp:include>


	<script data-cfasync="false"
		src="<%=request.getContextPath()%>/userResources/js/email-decode.min.js"></script>
	<script src="<%=request.getContextPath()%>/userResources/js/jquery.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/bootstrap.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/jquery.themepunch.revolution.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/jquery.themepunch.tools.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>

	<script
		src="<%=request.getContextPath()%>/userResources/js/revolution.extension.actions.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/revolution.extension.carousel.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/revolution.extension.kenburn.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/revolution.extension.migration.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/revolution.extension.parallax.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/revolution.extension.slideanims.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/revolution.extension.layeranimation.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/revolution.extension.navigation.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/revolution.extension.video.min.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>

	<script
		src="<%=request.getContextPath()%>/userResources/js/jquery-ui.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script src="<%=request.getContextPath()%>/userResources/js/shuffle.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script src="<%=request.getContextPath()%>/userResources/js/slick.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script src="<%=request.getContextPath()%>/userResources/js/gmaps.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="https://maps.google.com/maps/api/js?key=AIzaSyCysDHE3s4Qw3nTh9o58-2mJcqvR6HV8Kk"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/owl.carousel.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<script src="<%=request.getContextPath()%>/userResources/js/theme.js"
		type="612c723b94355c386d4fdf37-text/javascript"></script>
	<!-- <script
		src="https://ajax.cloudflare.com/cdn-cgi/scripts/7089c43e/cloudflare-static/rocket-loader.min.js"
		data-cf-settings="612c723b94355c386d4fdf37-|49" defer=""></script> -->


</body>
</html>