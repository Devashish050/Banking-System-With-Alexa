<header class="header_1" id="header">
	<div class="container">
		<div class="row align-items-center">
			<div class="col-lg-3 col-md-3">
				<div class="logo">
					<a href="index.html"><img src="<%=request.getContextPath()%>/userResources/image/logo.png"
						alt=""></a>
				</div>
			</div>
			<div class="col-lg-7 col-md-7">
				<nav class="mainmenu MenuInRight text-right">
					<a href="javascript:void(0);"
						class="mobilemenu d-md-none d-lg-none d-xl-none"> <span></span>
						<span></span> <span></span>
					</a>
					<ul>
						<li class="menu-item-has-children"><a href="index.html">home</a>
							</li>
						<!-- <li class="menu-item-has-children"><a href="#">Services</a>
							<ul class="sub-menu">
								<li><a href="services.html">Service 01</a></li>
								<li><a href="services2.html">Service 02</a></li>
								<li><a href="service_details.html">Service Details</a></li>
							</ul></li>-->
						 <li class="menu-item-has-children"><a href="#">Complain</a>
							<ul class="sub-menu">
								<li><a href="loadComplaint">Add Complain</a></li>
								</ul>
								<li class="menu-item-has-children"><a href="#">Feedback</a>
							<ul class="sub-menu">
								<li><a href="loadFeedback">Add Feedback</a></li>	
							</ul>
							</li>
							<li class="menu-item-has-children"><a href="#">Previous Loan</a>
								<ul class="sub-menu">
									<li><a href="viewPreviousUserLoan">View Previous Loan</a></li>	
								</ul>
							
							</li>
							
					<li class="menu-item-has-children"><a href="/logout">Logout</a>
							</li>
						
					</ul>
				</nav>	
			</div>
			<div class="col-lg-2 col-md-2 hidden-xs">
				<div class="navigator_btn btn_bg text-right">
					<a class="common_btn" href="loadLoanApply">Apply For Loan</a>
				</div>
			</div>
		</div>
	</div>
</header>