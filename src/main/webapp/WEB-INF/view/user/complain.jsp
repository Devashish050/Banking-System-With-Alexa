
<!DOCTYPE html>
<html lang="en">
<head>
<title>BSWA | Add Complain</title>
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
						<h2>Add Complain</h2>
					</div>
				</div>
			</div>
		</div>
	</section>




	<section class="commonSection contactPage">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="formArea">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<%@taglib prefix="f"
									uri="http://www.springframework.org/tags/form"%>

								<f:form action="/user/addcomplaint" modelAttribute="ComplainVO"
									method="post" class="contactFrom row"
									enctype="multipart/form-data">
									<div class="col-md-12">
										<f:input path="complainSubject" class="required"
											placeholder="Complain Subject" required="required" />

									</div>
									<div class="col-md-12">
										<f:textarea class="required" rows="3" cols="3"
											path="complainDescription" placeholder="Complain Subject"
											required="required"></f:textarea>
									</div>
									<div class="custom-file overflow-hidden rounded-pill mb-5">
										<input id="customFile" type="file"
											class="custom-file-input rounded-pill" name="file"> <label
											for="customFile" class="custom-file-label rounded-pill">Choose
											file</label>
									</div>

									<div class="col-md-12">
										<button name="submit" type="submit" id="con_submit"
											class="common_btn">Submit</button>
									</div>
								</f:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="commonSection testimonialSec">
		<div class="container">

			<c:forEach items="${complaintList}" var="i">


				<div class="row">
					<div class="col-lg-6 col-md-6">
						<div class="singleTestimoinal_2 pdRight">

							<div class="testiDetail">
								<img
									src="<%=request.getContextPath()%>/userResources/image/account.png"
									alt="" />

								<p>${i.complainSubject}</p>
								<p>${i.complainDescription}</p>
								<p>${i.reply}</p>

							</div>
							<div class="col-lg-6 col-md-6"></div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>

		<jsp:include page="footer.jsp"></jsp:include>

	


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
</body>
</html>