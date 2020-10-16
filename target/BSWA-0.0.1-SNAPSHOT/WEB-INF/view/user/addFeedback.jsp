
<!DOCTYPE html>
<html lang="en">
<head>
<title>BSWA | Feedback</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link rel="stylesheet" href="<%=request.getContextPath()%>/userResources/css/style.css">
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

.rating {
    float:left;
}

/* :not(:checked) is a filter, so that browsers that don’t support :checked don’t 
   follow these rules. Every browser that supports :checked also supports :not(), so
   it doesn’t make the test unnecessarily selective */
.rating:not(:checked) > input {
    position:absolute;
    top:-9999px;
    clip:rect(0,0,0,0);
}

.rating:not(:checked) > label {
    float:right;
    width:1.5em;
    padding:0 .1em;
    overflow:hidden;
    white-space:nowrap;
    cursor:pointer;
    font-size:200%;
    line-height:1.2;
    color:#ddd;
    text-shadow:1px 1px #bbb, 2px 2px #666, .1em .1em .2em rgba(0,0,0,.5);
}

.rating:not(:checked) > label:before {
    content: ' ';
}

.rating > input:checked ~ label {
    color: #f70;
    text-shadow:1px 1px #c60, 2px 2px #940, .1em .1em .2em rgba(0,0,0,.5);
}

.rating:not(:checked) > label:hover,
.rating:not(:checked) > label:hover ~ label {
    color: gold;
    text-shadow:1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em rgba(0,0,0,.5);
}

.rating > input:checked + label:hover,
.rating > input:checked + label:hover ~ label,
.rating > input:checked ~ label:hover,
.rating > input:checked ~ label:hover ~ label,
.rating > label:hover ~ input:checked ~ label {
    color: #ea0;
    text-shadow:1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em rgba(0,0,0,.5);
}

.rating > label:active {
    position:relative;
    top:2px;
    left:2px;
}

</style>

</head>
<body class="bg_right">



	<jsp:include page="header.jsp"></jsp:include>

	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

	<section class="pagebanner">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="bannerTitle text-left">
						<h2>Add Feedback</h2>
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

								<f:form action="insertRaiting" modelAttribute="FeedbackVO"
									method="post" class="contactFrom fo row">

									<div class="rating">
  						<h4> <span class="flaticon-house-key"></span>Rating</h4>
    						<f:radiobutton id="star5" path="rating" value="5" /><label for="star5" title="Rocks!"><span class="fa fa-star checked"></span></label>
    						<f:radiobutton id="star4" path="rating" value="4" /><label for="star4" title="Pretty good"><span class="fa fa-star checked"></span></label>
							<f:radiobutton id="star3" path="rating" value="3" /><label for="star3" title="Meh"><span class="fa fa-star checked"></span></label>
							<f:radiobutton id="star2" path="rating" value="2" /><label for="star2" title="Kinda bad"><span class="fa fa-star checked"></span></label>
							<f:radiobutton id="star1" path="rating" value="1" /><label for="star1" title="Sucks big time"><span class="fa fa-star checked"></span></label>
						</div>
									<div class="col-lg-12 col-md-12">
										<f:textarea  rows="3" cols="2" path="feedBack"
											placeholder="Feedback Text here...." required="required"></f:textarea>
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
			<c:forEach items="${feedbackList}" var="i" varStatus="j">

				<div class="row">
					<div class="col-lg-6 col-md-6">
						<div class="singleTestimoinal_2 pdRight">
							<p></p>
							<div class="testiDetail">
								<img
									src="<%=request.getContextPath()%>/userResources/image/account.png"
									alt="" />
								<h5></h5>
								<p>${i.feedBack}</p>
								<p><c:forEach begin="1" end="${i.rating}">
																	<div class="rating">
																		<label for="star5" title="Rocks!"
																			style="color: yellow"><span
																			class="fa fa-star checked"></span></label>
																	</div>
																</c:forEach>
															</p>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>



	<%-- <jsp:include page="footer.jsp"></jsp:include>
 --%>


	
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