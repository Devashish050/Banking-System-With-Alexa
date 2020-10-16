<nav class="sidebar sidebar-offcanvas" id="sidebar">
	<ul class="nav">
		<li class="nav-item"><a class="nav-link" href="index.html"> <i
				class="mdi mdi mdi-home menu-icon" style="font-size:20px"></i> <span class="menu-title">Home</span>
		</a></li>
		
		 <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#manageuser" aria-expanded="false" aria-controls="ui-basic">
              <i class="mdi mdi-account-circle" style="font-size:20px"></i>&nbsp&nbsp&nbsp
              <span class="menu-title">Manage User</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="manageuser">
              <ul class="nav flex-column sub-menu">
               <li class="nav-item"> <a class="nav-link" href="searchUser">View User</a></li>
               </ul>
            </div>
          </li> 
         
        
         <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#manageuserloan" aria-expanded="false" aria-controls="charts">
              <i class="mdi mdi-slack" style="font-size:20px"></i>&nbsp&nbsp
              <span class="menu-title">Manage User Loan</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="manageuserloan">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="viewUserLoan">View User Loan</a></li>
               </ul>
            </div>
          </li> 
		 
		<li class="nav-item"><a class="nav-link" data-toggle="collapse"
			href="#manageloantype" aria-expanded="false"
			aria-controls="ui-advanced"> <i
				class="mdi mdi-cash-multiple menu-icon"style="font-size:20px"></i>
				 <span class="menu-title">Manage Loan Type</span> <i class="menu-arrow"></i>
		</a>
			<div class="collapse" id="manageloantype">
				<ul class="nav flex-column sub-menu">
					<li class="nav-item"><a class="nav-link" href="loadLoanType">Add
							Loan Type</a></li>
					<li class="nav-item"><a class="nav-link" href="searchLoanType">View
							Loan Type</a></li>
				</ul>
			</div></li>
		<li class="nav-item"><a class="nav-link" data-toggle="collapse"
			href="#manageloanrate" aria-expanded="false"
			aria-controls="form-elements"> <i
				class="mdi mdi-percent menu-icon" style="font-size:20px"></i>
				 <span class="menu-title">Manage
					Loan Rate</span> <i class="menu-arrow"></i>
		</a>
			<div class="collapse" id="manageloanrate">
				<ul class="nav flex-column sub-menu">
					<li class="nav-item"><a class="nav-link" href="loadLoanRate">Add
							Loan Rate</a></li>
					<li class="nav-item"><a class="nav-link" href="searchLoanRate">View
							Loan Rate</a></li>
				</ul>
			</div></li>
		<li class="nav-item"><a class="nav-link" data-toggle="collapse"
			href="#manageactype" aria-expanded="false" aria-controls="editors">
				<i class="mdi mdi-account-card-details menu-icon" style="font-size:20px"></i> 
				<span class="menu-title">Manage A/c Type</span> <i class="menu-arrow"></i>
		</a>
			<div class="collapse" id="manageactype">
				<ul class="nav flex-column sub-menu">
					<li class="nav-item"><a class="nav-link"
						href="loadAccountType">Add A/c Type</a></li>
					<li class="nav-item"><a class="nav-link"
						href="searchAccountType">View A/c Type</a></li>
				</ul>
			</div></li>
		
		<li class="nav-item"><a class="nav-link" data-toggle="collapse"
			href="#managedocs" aria-expanded="false" aria-controls="icons"> <i
				class="mdi mdi-file-document-box menu-icon" style="font-size:20px"></i> 
				<span class="menu-title">Manage Docs</span> <i class="menu-arrow"></i>
		</a>
			<div class="collapse" id="managedocs">
				<ul class="nav flex-column sub-menu">
					<li class="nav-item"><a class="nav-link"
						href="loadRequiredDocs">Add Required Docs</a></li>
					<li class="nav-item"><a class="nav-link"
						href="searchRequiredDocs">View Required Docs</a></li>
				</ul>
			</div></li>

		<li class="nav-item"><a class="nav-link" data-toggle="collapse"
			href="#requiredddocuments" aria-expanded="false"
			aria-controls="charts"> <i
				class="mdi mdi-file-document menu-icon" style="font-size:20px"></i>
				 <span class="menu-title">Required Docs</span> <i class="menu-arrow"></i>
		</a>
			<div class="collapse" id="requiredddocuments">
				<ul class="nav flex-column sub-menu">
					<li class="nav-item"><a class="nav-link" href="loadLoanDocs">Add
							Loan Documents</a></li>
					<li class="nav-item"><a class="nav-link" href="searchLoanDocs">View
							Loan Documents</a></li>
					<li class="nav-item"><a class="nav-link"
						href="loadAccountDocs">Add A/c Documents</a></li>
					<li class="nav-item"><a class="nav-link"
						href="searchAccountDocs">View A/c Documents</a></li>
				</ul>
			</div></li>
	
		
		<li class="nav-item"><a class="nav-link" data-toggle="collapse"
			href="#auth" aria-expanded="false" aria-controls="auth"> <i
				class="mdi mdi-message-text-outline" style="font-size:20px"></i> &nbsp&nbsp
				<span class="menu-title">Manage Complain</span> <i class="menu-arrow"></i>
		</a>
			<div class="collapse" id="auth">
				<ul class="nav flex-column sub-menu">
					<!-- <li class="nav-item"> <a class="nav-link" href="">Add Feedback</a></li> -->
					<li class="nav-item"><a class="nav-link" href="adminViewComplaint">View
							Complain</a></li>
				</ul>
			</div></li>
			
		<li class="nav-item"><a class="nav-link" data-toggle="collapse"
			href="#maps" aria-expanded="false" aria-controls="maps"> 
			<i class="mdi mdi-star-face" style="font-size:20px">
			</i>&nbsp&nbsp <span class="menu-title">Manage
					Feedback</span> <i class="menu-arrow"></i>
		</a>
			<div class="collapse" id="maps">
				<ul class="nav flex-column sub-menu">
					<!--                 -->
					<li class="nav-item"><a class="nav-link"
						href="viewFeedback">View Feedback</a></li>
				</ul>
			</div></li>
		
		<!-- <li class="nav-item"><a class="nav-link" data-toggle="collapse"
			href="#maps" aria-expanded="false" aria-controls="maps"> <i
				class="mdi mdi-star-face" style="font-size:20px"></i>&nbsp&nbsp
				 <span class="menu-title">Manage Feedback</span> <i class="menu-arrow"></i>
		</a>
			<div class="collapse" id="auth">
				<ul class="nav flex-column sub-menu">
					<li class="nav-item"> <a class="nav-link" href="">Add Feedback</a></li>
					<li class="nav-item"><a class="nav-link" href="viewFeedback">View
							Feedback</a></li>
				</ul>
			</div></li>
		 --><li class="nav-item"><a class="nav-link" href="/logout"> <i
				class="mdi mdi-logout" style="font-size:20px"></i> &nbsp&nbsp
				<span class="menu-title">Logout</span>
		</a></li>

		</ul>
</nav>
