
<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>BSWA | Index</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/adminResources/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/adminResources/css/vendor.bundle.base.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/adminResources/css/vendor.bundle.addons.css">
  <!-- endinject -->
  <!-- plugin css for this page
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/adminResources/css/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="<%=request.getContextPath()%>/adminResources/image/favicon.png" />
</head>
<body>
  <div class="container-scroller">
    <!-- partial:partials/_navbar.html -->


	<jsp:include page="header.jsp"></jsp:include>



    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      <!-- partial:partials/_settings-panel.html -->
      <!-- <div class="theme-setting-wrapper">
        <div id="settings-trigger"><i class="mdi mdi-settings"></i></div>
        <div id="theme-settings" class="settings-panel">
          <i class="settings-close mdi mdi-close"></i>
          <p class="settings-heading">SIDEBAR SKINS</p>
          <div class="sidebar-bg-options selected" id="sidebar-light-theme"><div class="img-ss rounded-circle bg-light border mr-3"></div>Light</div>
          <div class="sidebar-bg-options" id="sidebar-dark-theme"><div class="img-ss rounded-circle bg-dark border mr-3"></div>Dark</div>
          <p class="settings-heading mt-2">HEADER SKINS</p>
          <div class="color-tiles mx-0 px-4">
            <div class="tiles success"></div>
            <div class="tiles warning"></div>
            <div class="tiles danger"></div>
            <div class="tiles light"></div>
            <div class="tiles info"></div>
            <div class="tiles dark"></div>
            <div class="tiles primary default"></div>
          </div>
        </div>
      </div> -->
      <div id="right-sidebar" class="settings-panel">
        <i class="settings-close mdi mdi-close"></i>
        <ul class="nav nav-tabs" id="setting-panel" role="tablist">
          <li class="nav-item">
            <a class="nav-link active" id="todo-tab" data-toggle="tab" href="#todo-section" role="tab" aria-controls="todo-section" aria-expanded="true">TO DO LIST</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" id="chats-tab" data-toggle="tab" href="#chats-section" role="tab" aria-controls="chats-section">CHATS</a>
          </li>
        </ul>
        <div class="tab-content" id="setting-content">
          <div class="tab-pane fade show active scroll-wrapper" id="todo-section" role="tabpanel" aria-labelledby="todo-section">
            <div class="add-items d-flex px-3 mb-0">
              <form class="form w-100">
                <div class="form-group d-flex">
                  <input type="text" class="form-control todo-list-input" placeholder="Add To-do">
                  <button type="submit" class="add btn btn-primary todo-list-add-btn" id="add-task">Add</button>
                </div>
              </form>
            </div>
            <div class="list-wrapper px-3">
              <ul class="d-flex flex-column-reverse todo-list">
                <li>
                  <div class="form-check">
                    <label class="form-check-label">
                      <input class="checkbox" type="checkbox">
                      Team review meeting at 3.00 PM
                    </label>
                  </div>
                  <i class="remove mdi mdi-close-circle-outline"></i>
                </li>
                <li>
                  <div class="form-check">
                    <label class="form-check-label">
                      <input class="checkbox" type="checkbox">
                      Prepare for presentation
                    </label>
                  </div>
                  <i class="remove mdi mdi-close-circle-outline"></i>
                </li>
                <li>
                  <div class="form-check">
                    <label class="form-check-label">
                      <input class="checkbox" type="checkbox">
                      Resolve all the low priority tickets due today
                    </label>
                  </div>
                  <i class="remove mdi mdi-close-circle-outline"></i>
                </li>
                <li class="completed">
                  <div class="form-check">
                    <label class="form-check-label">
                      <input class="checkbox" type="checkbox" checked>
                      Schedule meeting for next week
                    </label>
                  </div>
                  <i class="remove mdi mdi-close-circle-outline"></i>
                </li>
                <li class="completed">
                  <div class="form-check">
                    <label class="form-check-label">
                      <input class="checkbox" type="checkbox" checked>
                      Project review
                    </label>
                  </div>
                  <i class="remove mdi mdi-close-circle-outline"></i>
                </li>
              </ul>
            </div>
            <div class="events py-4 border-bottom px-3">
              <div class="wrapper d-flex mb-2">
                <i class="mdi mdi-circle-outline text-primary mr-2"></i>
                <span>Feb 11 2018</span>
              </div>
              <p class="mb-0 font-weight-thin text-gray">Creating component page</p>
              <p class="text-gray mb-0">build a js based app</p>
            </div>
            <div class="events pt-4 px-3">
              <div class="wrapper d-flex mb-2">
                <i class="mdi mdi-circle-outline text-primary mr-2"></i>
                <span>Feb 7 2018</span>
              </div>
              <p class="mb-0 font-weight-thin text-gray">Meeting with Alisa</p>
              <p class="text-gray mb-0 ">Call Sarah Graves</p>
            </div>
          </div>
          <!-- To do section tab ends -->
          <div class="tab-pane fade" id="chats-section" role="tabpanel" aria-labelledby="chats-section">
            <div class="d-flex align-items-center justify-content-between border-bottom">
              <p class="settings-heading border-top-0 mb-3 pl-3 pt-0 border-bottom-0 pb-0">Friends</p>
              <small class="settings-heading border-top-0 mb-3 pt-0 border-bottom-0 pb-0 pr-3 font-weight-normal">See All</small>
            </div>
            <ul class="chat-list">
              <li class="list active">
                <div class="profile"><img src="<%=request.getContextPath()%>/adminResources/image/face1.jpg" alt="image"><span class="online"></span></div>
                <div class="info">
                  <p>Thomas Douglas</p>
                  <p>Available</p>
                </div>
                <small class="text-muted my-auto">19 min</small>
              </li>
              <li class="list">
                <div class="profile"><img src="<%=request.getContextPath()%>/adminResources/image/face2.jpg" alt="image"><span class="offline"></span></div>
                <div class="info">
                  <div class="wrapper d-flex">
                    <p>Catherine</p>
                  </div>
                  <p>Away</p>
                </div>
                <div class="badge badge-success badge-pill my-auto mx-2">4</div>
                <small class="text-muted my-auto">23 min</small>
              </li>
              <li class="list">
                <div class="profile"><img src="<%=request.getContextPath()%>/adminResources/image/face3.jpg" alt="image"><span class="online"></span></div>
                <div class="info">
                  <p>Daniel Russell</p>
                  <p>Available</p>
                </div>
                <small class="text-muted my-auto">14 min</small>
              </li>
              <li class="list">
                <div class="profile"><img src="<%=request.getContextPath()%>/adminResources/image/face4.jpg" alt="image"><span class="offline"></span></div>
                <div class="info">
                  <p>James Richardson</p>
                  <p>Away</p>
                </div>
                <small class="text-muted my-auto">2 min</small>
              </li>
              <li class="list">
                <div class="profile"><img src="<%=request.getContextPath()%>/adminResources/image/face5.jpg" alt="image"><span class="online"></span></div>
                <div class="info">
                  <p>Madeline Kennedy</p>
                  <p>Available</p>
                </div>
                <small class="text-muted my-auto">5 min</small>
              </li>
              <li class="list">
                <div class="profile"><img src="<%=request.getContextPath()%>/adminResources/image/face6.jpg" alt="image"><span class="online"></span></div>
                <div class="info">
                  <p>Sarah Graves</p>
                  <p>Available</p>
                </div>
                <small class="text-muted my-auto">47 min</small>
              </li>
            </ul>
          </div>
          <!-- chat tab ends -->
        </div>
      </div>
      <!-- partial -->
      <!-- partial:partials/_sidebar.html -->



		<jsp:include page="menu.jsp"></jsp:include>



     <div class="main-panel">
				<div class="content-wrapper">
				<div class="row">
            <div class="col-lg-3 col-md-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <div class="d-flex justify-content-between flex-wrap align-items-center">
                    <div class="img-sm bg-primary rounded-md d-flex align-items-center justify-content-center text-white">
                      <i class="mdi mdi-message-draw"></i>
                    </div>
                    <div class="text-right text-md-center text-lg-left ml-lg-4">
                      <h1 class="font-weight-bold mb-0">${data.totalComplainList}</h1>
                      <p class="mb-0">Total Complain</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <div class="d-flex justify-content-between flex-wrap align-items-center">
                    <div class="img-sm bg-danger rounded-md d-flex align-items-center justify-content-center text-white">
                      <i class="mdi mdi-message-alert-outline"></i>
                    </div>
                    <div class="text-right text-md-center text-lg-left ml-lg-4">
                      <h1 class="font-weight-bold mb-0">${data.pendingComplaintList}</h1>
                      <p class="mb-0">Pending</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <div class="d-flex justify-content-between flex-wrap align-items-center">
                    <div class="img-sm bg-warning rounded-md d-flex align-items-center justify-content-center text-white">
                      <i class="mdi mdi-message-settings-variant"></i>
                    </div>
                    <div class="text-right text-md-center text-lg-left ml-lg-4">
                      <h1 class="font-weight-bold mb-0">${data.resolvedComplainList}</h1>
                      <p class="mb-0">Resolve</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-3 col-md-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <div class="d-flex justify-content-between flex-wrap align-items-center">
                    <div class="img-sm bg-success rounded-md d-flex align-items-center justify-content-center text-white">
                      <i class="mdi mdi-star-circle"></i>
                    </div>
                    <div class="text-right text-md-center text-lg-left ml-lg-4">
                      <h1 class="font-weight-bold mb-0">${data.feedbackList}</h1>
                      <p class="mb-0">Feedback</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          
          
          
          <!--************************************  LOAN GRAPH CODE  *********************************************-->
          
          <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
         
          <div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

								<c:forEach items="${loanList}" var="i">
												<c:forEach items="${i}" var="k" varStatus="j">
													<c:if test="${j.count eq 1 }">
														<input type="hidden" name="yvalue" value="${k}" />
													</c:if>
													<c:if test="${j.count eq 2 }">
														<input type="hidden" name="xvalue" value="${k}" />
													</c:if>
												</c:forEach>
											</c:forEach>
		
			
			  <!--************************************ MAXIMUM LOAN GRAPH CODE  *********************************************-->
        	
			 <div id="container1" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

								<c:forEach items="${loanList1}" var="i">
												<c:forEach items="${i}" var="k" varStatus="j">
													<c:if test="${j.count eq 1 }">
														<input type="hidden" name="y1value" value="${k}" />
													</c:if>
													<c:if test="${j.count eq 2 }">
														<input type="hidden" name="x1value" value="${k}" />
													</c:if>
												</c:forEach>
											</c:forEach>
			
       		
           <!--************************************ End GRAPH CODE  *********************************************-->
          
                 <%--   <div class="row">
            <div class="col-lg-4 grid-margin stretch-card">
              <div class="card">
                <div class="card-body d-flex flex-column justify-content-between">
                  <h4 class="card-title mb-lg-0">Overview</h4>
                  <div class="w-50 mx-auto">
                    <canvas id="traffic-chart" width="100" height="100"></canvas>
                  </div>
                  <div id="traffic-chart-legend" class="chartjs-legend traffic-chart-legend"></div>
                </div>
              </div>
            </div>
            <div class="col-lg-4 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <div class="d-flex justify-content-between">
                    <h6 class="card-title">Activity</h6>
                  </div>
                  <div class="list d-flex pb-3">
                    <img class="img-sm rounded-md" src="<%=request.getContextPath()%>/adminResources/image/face8.jpg" alt="">
                    <div class="wrapper w-100 ml-3">
                      <p><b>Dobrick </b>published an article</p>
                      <small class="text-primary font-weight-medium">2 hours ago</small>
                    </div>
                  </div>
                  <div class="list d-flex py-3">
                    <img class="img-sm rounded-md" src="<%=request.getContextPath()%>/adminResources/image/face5.jpg" alt="">
                    <div class="wrapper w-100 ml-3">
                      <p><b>Stella </b>created an event</p>
                      <small class="text-primary font-weight-medium">3 hours ago</small>                      
                    </div>
                  </div>
                  <div class="list d-flex py-3">
                    <img class="img-sm rounded-md" src="<%=request.getContextPath()%>/adminResources/image/face7.jpg" alt="">
                    <div class="wrapper w-100 ml-3">
                      <p><b>Peter </b>submitted the reports</p>
                      <small class="text-primary font-weight-medium">1 hours ago</small>                      
                    </div>
                  </div>
                  <div class="list d-flex pt-3">
                    <img class="img-sm rounded-md" src="<%=request.getContextPath()%>/adminResources/image/face6.jpg" alt="">
                    <div class="wrapper w-100 ml-3">
                      <p><b>Nateila </b>updated the docs</p>
                      <small class="text-primary font-weight-medium">1 hours ago</small>                      
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-4 grid-margin stretch-card">
              <div class="card">
                <div class="card-body d-flex flex-column justify-content-between">
                  <h4 class="card-title">Sales</h4>
                  <canvas id="analysis-chart"></canvas>
                  <div class="d-lg-flex justify-content-around mt-3">
                    <div class="text-center mb-3 mb-lg-0">
                      <h3 class="font-weight-normal text-primary">+40%</h3>
                      <p class="text-primary font-weight-medium mb-0">Growth</p>
                    </div>
                    <div class="text-center mb-3 mb-lg-0">
                      <h3 class="font-weight-normal text-danger">2%</h3>
                      <p class="text-danger font-weight-medium mb-0">Refund</p>
                    </div>
                    <div class="text-center">
                      <h3 class="font-weight-normal text-success">+23%</h3>
                      <p class="text-success font-weight-medium mb-0">Online</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-lg-4 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">News feed</h4>
                  <ul class="bullet-line-list">
					<li>
											<p class="text-muted mb-2">24 May 2018</p>
											<p>Vacation Home Rental Success</p>
                    </li>
                    <li>
											<p class="text-muted mb-2">25 May 2018</p>
											<p>Online Games How To Play To Win</p>
                    </li>
                    <li>
											<p class="text-muted mb-2">26 May 2018</p>
											<p>Big Savings On Gas</p>
                    </li>
                    <li>
											<p class="text-muted mb-2">27 May 2018</p>
											<p class="mb-0">A Time Travel Postcard</p>
										</li>
									</ul>
                </div>
              </div>
            </div>
            <div class="col-lg-8 grid-margin stretch-card">
              <div class="card">
                <div class="card-body d-flex flex-column justify-content-between">
                  <h4 class="card-title">Revenue</h4>
                  <canvas id="statistics-chart"></canvas>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-lg-7 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Product sales</h4>
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                        <tr>
                          <th>
                            #
                          </th>
                          <th>
                            Products
                          </th>
                          <th>
                            Product ID
                          </th>
                          <th>
                            Sales
                          </th>
                          <th>
                            Remarks
                          </th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>
                            1
                          </td>
                          <td>
                            La Dolce Vita
                          </td>
                          <td>
                            874-872-3351
                          </td>
                          <td>
                            44479
                          </td>
                          <td>
                            <label class="badge badge-success">High</label>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            2
                          </td>
                          <td>
                            Party Jokes
                          </td>
                          <td>
                            874-872-3352
                          </td>
                          <td>
                            44479
                          </td>
                          <td>
                            <label class="badge badge-danger">Low</label>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            3
                          </td>
                          <td>
                            Tremblant In Canada
                          </td>
                          <td>
                            874-872-3353
                          </td>
                          <td>
                            44479
                          </td>
                          <td>
                            <label class="badge badge-success">High</label>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            4
                          </td>
                          <td>
                            Copper Canyon
                          </td>
                          <td>
                            874-872-3354
                          </td>
                          <td>
                            44479
                          </td>
                          <td>
                            <label class="badge badge-warning">Medium</label>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            5
                          </td>
                          <td>
                            La Dolce Vita
                          </td>
                          <td>
                            874-872-3355
                          </td>
                          <td>
                            44479
                          </td>
                          <td>
                            <label class="badge badge-danger">Low</label>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            6
                          </td>
                          <td>
                            High Seirra
                          </td>
                          <td>
                            874-872-3356
                          </td>
                          <td>
                            44479
                          </td>
                          <td>
                            <label class="badge badge-success">High</label>
                          </td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-5 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Profits</h4>
                  <div class="table-responsive">
                    <table class="table">
                      <tbody>
                        <tr>
                          <td class="border-0 pt-0">
                            <img src="<%=request.getContextPath()%>/adminResources/image/brand-logo-1.png" alt="icon"/>
                          </td>
                          <td class="border-0 pt-0">
                            <p>Dribbble</p>
                            <p class="text-muted mb-0">North Jermain</p>
                          </td>
                          <td class="text-primary border-0 pt-0">
                            21760
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <img src="<%=request.getContextPath()%>/adminResources/image/brand-logo-2.png" alt="icon"/>
                          </td>
                          <td>
                            <p>Adidas</p>
                            <p class="text-muted mb-0">Bahamas</p>
                          </td>
                          <td class="text-primary">
                            17602
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <img src="<%=request.getContextPath()%>/adminResources/image/brand-logo-3.png" alt="icon"/>
                          </td>
                          <td>
                            <p>New Kattie</p>
                            <p class="text-muted mb-0">Italy</p>
                          </td>
                          <td class="text-primary">
                            72160
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <img src="<%=request.getContextPath()%>/adminResources/image/brand-logo-4.png" alt="icon"/>
                          </td>
                          <td>
                            <p>Anahiborough</p>
                            <p class="text-muted mb-0">Kyrgyz Republic</p>
                          </td>
                          <td class="text-primary">
                            62170
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <img src="<%=request.getContextPath()%>/adminResources/image/brand-logo-5.png" alt="icon"/>
                          </td>
                          <td>
                            <p>Schoenberg</p>
                            <p class="text-muted mb-0">Bulgaria</p>
                          </td>
                          <td class="text-primary">
                            12760
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <img src="<%=request.getContextPath()%>/adminResources/image/brand-logo-6.png" alt="icon"/>
                          </td>
                          <td>
                            <p>South Earnestine</p>
                            <p class="text-muted mb-0">Saint Helena</p>
                          </td>
                          <td class="text-primary">
                            21607
                          </td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- content-wrapper ends -->
        <!-- partial:partials/_footer.html --> --%>


	
		<jsp:include page="footer.jsp"></jsp:include>



        <!-- partial -->
      </div>
      <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->

  <!-- plugins:js -->
  <script src="<%=request.getContextPath()%>/adminResources/js/vendor.bundle.base.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/vendor.bundle.addons.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page-->
  <!-- End plugin js for this page-->
  <!-- inject:js -->
  <script src="<%=request.getContextPath()%>/adminResources/js/off-canvas.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/hoverable-collapse.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/template.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/settings.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/todolist.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
  <script src="<%=request.getContextPath()%>/adminResources/js/dashboard.js"></script>
  <!-- End custom js for this page-->
  
  <script src="<%=request.getContextPath()%>/adminResources/js/highcharts.js"></script>
  <script src="<%=request.getContextPath()%>/adminResources/js/exporting.js"></script>
  <script>
var xvalue= document.getElementsByName("xvalue");
var xdata = [];
var yvalue= document.getElementsByName("yvalue");
var ydata = [];
for(var i=0;i<xvalue.length;i++)
{
	xdata.push(xvalue[i].value);
	ydata.push(parseFloat(yvalue[i].value));
}
Highcharts.chart({
    chart: {
	renderTo:"container",

        type: 'column'
    },
    title: {
        text: 'Average Loan Rate'
    },
    subtitle: {
        text: ''
    },
    xAxis: {
        categories: xdata,
        crosshair: true
    },
    yAxis: {
        min: 0,
        title: {
            text: 'Loan Rate(no)'
        }
    },
    plotOptions: {
        column: {
            pointPadding: 0.2,
            borderWidth: 0
        }
    },
    series: [{
        name: 'Loan Type',
        data: ydata

    }]
});
</script>

 <!-- ********* MAXIMUM APPLIED LOAN ****************** -->
    
<script>
var xvalue= document.getElementsByName("x1value");
var xdata = [];
var yvalue= document.getElementsByName("y1value");
var ydata = [];
for(var i=0;i<xvalue.length;i++)
{
	xdata.push(xvalue[i].value);
	ydata.push(parseFloat(yvalue[i].value));
}
Highcharts.chart({
    chart: {
	renderTo:"container1",

        type: 'column'
    },
    title: {
        text: 'Maximum Apllied Loans'
    },
    subtitle: {
        text: ''
    },
    xAxis: {
        categories: xdata,
        crosshair: true
    },
    yAxis: {
        min: 0,
        title: {
            text: 'Loan Count(no)'
        }
    },
    plotOptions: {
        column: {
            pointPadding: 0.2,
            borderWidth: 0
        }
    },
    series: [{
        name: 'Loan Type',
        data: ydata

    }]
});
</script>
  
</body>

</html>

