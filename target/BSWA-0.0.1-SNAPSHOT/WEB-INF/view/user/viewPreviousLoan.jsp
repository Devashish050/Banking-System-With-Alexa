
<!DOCTYPE html>
<html lang="en">
<head>
<title>BSWA | View Previous Loan</title>
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
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/userResources/css/upload.css" />
<link rel="icon" type="image/png"
	href="<%=request.getContextPath()%>/userResources/image/favicon.png">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
<!-- <style type="text/css">
.rounded-lg {
	border-radius: 1rem;
}

.custom-file-label.rounded-pill {
	border-radius: 50rem;
}

.custom-file-label.rounded-pill::after {
	border-radius: 0 50rem 50rem 0;
}
</style>
 -->
</head>

<body class="bg_right">



	<jsp:include page="header.jsp"></jsp:include>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

	<section class="pagebanner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="bannerTitle text-left">
						<h2>BSWA | View Previous Loan</h2>
						<table id="example" class="table table-striped table-bordered"
							style="width: 100%">
							<thead>
								<tr>
									<th>No</th>
									<th>Loan Type</th>
									<th>Loan Rate</th>
									<th>IdProof File</th>
									<th>ResidentProof File</th>
									<th>Loan Status</th>

								</tr>
							</thead>
							<tbody>
								<c:forEach items="${userLoanList}" var="i" varStatus="j">
									<tr>
										<td>${j.count}</td>
										<td>${i.loanTypeVO.loanType}</td>
										<td>${i.manageLoanRateVO.loanRate}</td>
										<td><a
											href="<%=request.getContextPath()%>/documents/applyloandocs/${i.loginVO.username}/${i.idProofFileName}"
											target="_blank">View</a></td>
										<td><a
											href="<%=request.getContextPath()%>/documents/applyloandocs/${i.loginVO.username}/${i.residentProofFileName}"
											target="_blank">View</a></td>
										<td><span class="badge badge-info badge-pill" style="font-size:20px">${i.docStatus}</span></td>

									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</section>





	<jsp:include page="footer.jsp"></jsp:include>



	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script data-cfasync="false"
		src="<%=request.getContextPath()%>/userResources/js/email-decode.min.js"></script>
	<script src="<%=request.getContextPath()%>/userResources/js/jquery.js"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/bootstrap.min.js"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/jquery.themepunch.revolution.min.js"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/jquery.themepunch.tools.min.js"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/jquery-ui.js"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script src="<%=request.getContextPath()%>/userResources/js/shuffle.js"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script src="<%=request.getContextPath()%>/userResources/js/slick.js"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script src="<%=request.getContextPath()%>/userResources/js/gmaps.js"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script
		src="https://maps.google.com/maps/api/js?key=AIzaSyCysDHE3s4Qw3nTh9o58-2mJcqvR6HV8Kk"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/userResources/js/owl.carousel.js"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script src="<%=request.getContextPath()%>/userResources/js/theme.js"
		type="b9638b17cf084e999fffe6de-text/javascript"></script>
	<script
		src="https://ajax.cloudflare.com/cdn-cgi/scripts/7089c43e/cloudflare-static/rocket-loader.min.js"
		data-cf-settings="b9638b17cf084e999fffe6de-|49" defer=""></script>
	<script type="text/javascript"
		src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function() {
	    $('#example').DataTable();
	} );
	</script>

</body>
</html>