<!--
=========================================================
* Argon Dashboard - v1.2.0
=========================================================
* Product Page: https://www.creative-tim.com/product/argon-dashboard


* Copyright  Creative Tim (http://www.creative-tim.com)
* Coded by www.creative-tim.com



=========================================================
* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
-->
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="Start your development with a Dashboard for Bootstrap 4.">
        <meta name="author" content="Creative Tim">
        <title>Argon Dashboard - Free Dashboard for Bootstrap 4</title>
        <!-- Favicon -->
        <link rel="icon" href="assets/img/brand/favicon.png" type="image/png">
        <!-- Fonts -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700">
        <!-- Icons -->
        <link rel="stylesheet" href="assets/vendor/nucleo/css/nucleo.css" type="text/css">
        <link rel="stylesheet" href="assets/vendor/@fortawesome/fontawesome-free/css/all.min.css" type="text/css">
        <!-- Argon CSS -->
        <link rel="stylesheet" href="assets/css/argon.css?v=1.2.0" type="text/css">
    </head>

    <body>
        <script>
            
          
    let xmlHttp;
            if (window.XMLHttpRequest) {
                xmlHttp = new XMLHttpRequest();


            } else {
                xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
            }
            xmlHttp.onreadystatechange = function () {
                if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                    var ar = JSON.parse(xmlHttp.responseText);
                    // const xmlDoc=this.responseXML;
                    // const ar response=JSON.parse(xmlHttp.responseText);
                    console.log("kalpa sadaruwan");
                    console.log(ar);
                    let data = "";
                    ar.forEach(value => {
                        console.log(value.title);
                        console.log(value.dpartmentID);

                        // data += "<tr><td>" + value.dpartmentID + "</td><td>" + value.title + "</td><td><button class=\"btn btn-success\" onclick=\"update(" + value.dpartmentID + ")\">Edit</button></td></tr>"
                        data += "<option>" + value.empID + "-" + value.fname +" "+value.mname+" "+value.lname+ "<option>"

                    });
                    let tbody = document.getElementById("employeeid");
                    tbody.innerHTML = data;
                }
            }
           // xmlHttp.open("GET", "view_employee", true);
            xmlHttp.open("GET", "view_employee", true);
            //  xmlHttp.open("POST", "view_all?id="+id, true);
            xmlHttp.send();



          
function save(){
    console.log("kalpa");
    var emp = document.getElementById("employeeid").value;
    var date = document.getElementById("input-date").value;
    var experience = document.getElementById("input-experience").value;
    var feedback = document.getElementById("input-feedback").value;
    var complains = document.getElementById("input-complain").value;
    console.log(emp);
    console.log(date);
    console.log(experience);
    console.log(feedback);
    console.log(complains);
    
           let xmlHttp3;
                if (window.XMLHttpRequest) {
                    xmlHttp3 = new XMLHttpRequest();


                } else {
                    xmlHttp3 = new ActiveXobject("Microsoft.XMLHTTP");
                }
                let tb = document.getElementById("input-username");
                xmlHttp3.onreadystatechange = function () {
                    if (xmlHttp3.readyState == 4 && xmlHttp3.status == 200) {
                      //  var ar = JSON.parse(xmlHttp3.responseText);
window.location='performance_page.jsp'


                    }
                }
                xmlHttp3.open("GET", "save_performance?emp=" + emp+"&date="+date+"&exp="+experience+"&feed="+feedback+"&compl="+complains, true);
                //  xmlHttp.open("POST", "view_all?id="+id, true);
                xmlHttp3.send();
}
           
function select(){
    console.log("kalpa");
      var emp = document.getElementById("employeeid").value;
      console.log(emp);
      
      
       let xmlHttp4;
            if (window.XMLHttpRequest) {
                xmlHttp4 = new XMLHttpRequest();


            } else {
                xmlHttp4 = new ActiveXobject("Microsoft.XMLHTTP");
            }
            xmlHttp4.onreadystatechange = function () {
                if (xmlHttp4.readyState == 4 && xmlHttp4.status == 200) {
                    var ar = JSON.parse(xmlHttp4.responseText);
                    // const xmlDoc=this.responseXML;
                    // const ar response=JSON.parse(xmlHttp.responseText);
                    console.log("kalpa sadaruwan");
                    console.log(ar);
                    let data = "";
                    ar.forEach(value => {
                        console.log(value.title);
                        console.log(value.dpartmentID);

                         data += "<tr><td>" + value.pfID + "</td><td>" + value.performance + "</td><td>"+value.feedback+"</td><td>"+value.decipline+"</td><td>"+value.date+"</td><td><button class=\"btn btn-danger\" onclick=\"deletep(" + value.pfID + ")\">Delete</button></td><td><button class=\"btn btn-success\" onclick=\"updatefill(" + value.pfID + ")\">Edit</button></td></tr>"
                       

                    });
                    let tbody = document.getElementById("tbody");
                    tbody.innerHTML = data;
                }
            }
           // xmlHttp.open("GET", "view_employee", true);
            xmlHttp4.open("GET", "getemployee_performance?id="+emp, true);
            //  xmlHttp.open("POST", "view_all?id="+id, true);
            xmlHttp4.send();
}

function deletep(id){
    console.log(id)
       let xmlHttp5;
            if (window.XMLHttpRequest) {
                xmlHttp5 = new XMLHttpRequest();


            } else {
                xmlHttp5 = new ActiveXobject("Microsoft.XMLHTTP");
            }
            xmlHttp5.onreadystatechange = function () {
                if (xmlHttp5.readyState == 4 && xmlHttp5.status == 200) {
                   // var ar = JSON.parse(xmlHttp5.responseText);
                    // const xmlDoc=this.responseXML;
                    // const ar response=JSON.parse(xmlHttp.responseText);
//                    console.log("kalpa sadaruwan");
//                    //console.log(ar);
//                    let data = "";
//                    ar.forEach(value => {
//                        console.log(value.title);
//                        console.log(value.dpartmentID);
//
//                       //  data += "<tr><td>" + value.pfID + "</td><td>" + value.performance + "</td><td>"+value.feedback+"</td><td>"+value.decipline+"</td><td>"+value.date+"</td><td><button class=\"btn btn-danger\" onclick=\"deletep(" + value.pfID + ")\">Delete</button></td><td><button class=\"btn btn-success\" onclick=\"update(" + value.pfID + ")\">Update</button></td></tr>"
//                       
//
//                    });
                  window.location='performance_page.jsp'
                }
            }
           // xmlHttp.open("GET", "view_employee", true);
            xmlHttp5.open("GET", "delete_per?id="+id, true);
            //  xmlHttp.open("POST", "view_all?id="+id, true);
            xmlHttp5.send();
    
}

function updatefill(id){
        let xmlHttp6;
            if (window.XMLHttpRequest) {
                xmlHttp6 = new XMLHttpRequest();


            } else {
                xmlHttp6 = new ActiveXobject("Microsoft.XMLHTTP");
            }
            
   // var emp = document.getElementById("employeeid")
    var date = document.getElementById("input-date")
    var experience = document.getElementById("input-experience")
    var feedback = document.getElementById("input-feedback")
    var complains = document.getElementById("input-complain")
    var hide = document.getElementById("hide")
            
            xmlHttp6.onreadystatechange = function () {
                if (xmlHttp6.readyState == 4 && xmlHttp6.status == 200) {
                    var ar = JSON.parse(xmlHttp6.responseText);
                   
                    console.log(ar);
                    let data = "";
                    ar.forEach(value => {
                        

                       //  data += "<tr><td>" + value.pfID + "</td><td>" + value.performance + "</td><td>"+value.feedback+"</td><td>"+value.decipline+"</td><td>"+value.date+"</td><td><button class=\"btn btn-danger\" onclick=\"deletep(" + value.pfID + ")\">Delete</button></td><td><button class=\"btn btn-success\" onclick=\"update(" + value.pfID + ")\">Update</button></td></tr>"
                       date.value=value.date;
                       experience.value=value.performance;
                       feedback.value=value.feedback;
                       complains.value=value.decipline;
                       hide.value=value.pfID;
                    });
                //  window.location='performance_page.jsp'
                }
            }
           // xmlHttp.open("GET", "view_employee", true);
            xmlHttp6.open("GET", "getDetails_id?id="+id, true);
            //  xmlHttp.open("POST", "view_all?id="+id, true);
            xmlHttp6.send();
}

function update(){
    var hide = document.getElementById("hide").value;
    
    
    
    var emp = document.getElementById("employeeid").value;
    var date = document.getElementById("input-date").value;
    var experience = document.getElementById("input-experience").value;
    var feedback = document.getElementById("input-feedback").value;
    var complains = document.getElementById("input-complain").value;
  
    
           let xmlHttp7;
                if (window.XMLHttpRequest) {
                    xmlHttp7 = new XMLHttpRequest();


                } else {
                    xmlHttp7 = new ActiveXobject("Microsoft.XMLHTTP");
                }
                let tb = document.getElementById("input-username");
                xmlHttp7.onreadystatechange = function () {
                    if (xmlHttp7.readyState == 4 && xmlHttp7.status == 200) {
                      //  var ar = JSON.parse(xmlHttp3.responseText);
window.location='performance_page.jsp'


                    }
                }
                xmlHttp7.open("GET", "update_per?emp=" + emp+"&date="+date+"&exp="+experience+"&feed="+feedback+"&compl="+complains+"&id="+hide, true);
                //  xmlHttp.open("POST", "view_all?id="+id, true);
                xmlHttp7.send();
}
         
        </script>  


        <!-- Sidenav -->
        <nav class="sidenav navbar navbar-vertical  fixed-left  navbar-expand-xs navbar-light bg-white" id="sidenav-main">
            <div class="scrollbar-inner">
                <!-- Brand -->
                <div class="sidenav-header  align-items-center">
                    <a class="navbar-brand" href="javascript:void(0)">
                        <img src="assets/img/brand/blue.png" class="navbar-brand-img" alt="...">
                    </a>
                </div>
                <div class="navbar-inner">
                    <!-- Collapse -->
                    <div class="collapse navbar-collapse" id="sidenav-collapse-main">
                        <!-- Nav items -->
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link active" href="">
                                    <i class="ni ni-tv-2 text-primary"></i>
                                    <span class="nav-link-text">Dashboard</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="add_department.jsp">
                                    <i class="ni ni-planet text-orange"></i>
                                    <span class="nav-link-text">Add Department</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="add_designation.jsp">
                                    <i class="ni ni-pin-3 text-primary"></i>
                                    <span class="nav-link-text">Add Designation</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="add_employee.jsp">
                                    <i class="ni ni-single-02 text-yellow"></i>
                                    <span class="nav-link-text">Register Employee</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                  <a class="nav-link" href="attendance_mark.jsp">
                                    <i class="ni ni-bullet-list-67 text-default"></i>
                                    <span class="nav-link-text">Mark Attendance</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="performance_page.jsp">
                                    <i class="ni ni-key-25 text-info"></i>
                                    <span class="nav-link-text">Employee Performance</span>
                                </a>
                            </li>
                          <li class="nav-item">
                                <a class="nav-link" href="salary.jsp">
                                    <i class="ni ni-circle-08 text-pink"></i>
                                    <span class="nav-link-text">Pay Salary</span>
                                </a>
                            </li>
<!--                            <li class="nav-item">
                                <a class="nav-link" href="examples/upgrade.html">
                                    <i class="ni ni-send text-dark"></i>
                                    <span class="nav-link-text">Upgrade</span>
                                </a>
                            </li>-->
                        </ul>
                        <!-- Divider -->
                        <hr class="my-3">
                        <!-- Heading -->
                        <h6 class="navbar-heading p-0 text-muted">
                            <!--<span class="docs-normal">Documentation</span>-->
                        </h6>
                        <!-- Navigation -->
<!--                        <ul class="navbar-nav mb-md-3">
                            <li class="nav-item">
                                <a class="nav-link" href="https://demos.creative-tim.com/argon-dashboard/docs/getting-started/overview.html" target="_blank">
                                    <i class="ni ni-spaceship"></i>
                                    <span class="nav-link-text">Getting started</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="https://demos.creative-tim.com/argon-dashboard/docs/foundation/colors.html" target="_blank">
                                    <i class="ni ni-palette"></i>
                                    <span class="nav-link-text">Foundation</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="https://demos.creative-tim.com/argon-dashboard/docs/components/alerts.html" target="_blank">
                                    <i class="ni ni-ui-04"></i>
                                    <span class="nav-link-text">Components</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="https://demos.creative-tim.com/argon-dashboard/docs/plugins/charts.html" target="_blank">
                                    <i class="ni ni-chart-pie-35"></i>
                                    <span class="nav-link-text">Plugins</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active active-pro" href="examples/upgrade.html">
                                    <i class="ni ni-send text-dark"></i>
                                    <span class="nav-link-text">Upgrade to PRO</span>
                                </a>
                            </li>
                        </ul>-->
                    </div>
                </div>
            </div>
        </nav>
        <!-- Main content -->
        <div class="main-content" id="panel">
            <!-- Topnav -->
            <nav class="navbar navbar-top navbar-expand navbar-dark bg-default border-bottom">
                <div class="container-fluid">
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <!-- Search form -->
                        <!--          <form class="navbar-search navbar-search-light form-inline mr-sm-3" id="navbar-search-main">
                                    <div class="form-group mb-0">
                                      <div class="input-group input-group-alternative input-group-merge">
                                        <div class="input-group-prepend">
                                          <span class="input-group-text"><i class="fas fa-search"></i></span>
                                        </div>
                                        <input class="form-control" placeholder="Search" type="text">
                                      </div>
                                    </div>
                                    <button type="button" class="close" data-action="search-close" data-target="#navbar-search-main" aria-label="Close">
                                      <span aria-hidden="true">�</span>
                                    </button>
                                  </form>-->
                        <!-- Navbar links -->
                        <ul class="navbar-nav align-items-center  ml-md-auto ">
                            <li class="nav-item d-xl-none">
                                <!-- Sidenav toggler -->
                                <div class="pr-3 sidenav-toggler sidenav-toggler-dark" data-action="sidenav-pin" data-target="#sidenav-main">
                                    <div class="sidenav-toggler-inner">
                                        <i class="sidenav-toggler-line"></i>
                                        <i class="sidenav-toggler-line"></i>
                                        <i class="sidenav-toggler-line"></i>
                                    </div>
                                </div>
                            </li>
                            <li class="nav-item d-sm-none">
                                <a class="nav-link" href="#" data-action="search-show" data-target="#navbar-search-main">
                                    <i class="ni ni-zoom-split-in"></i>
                                </a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="ni ni-bell-55"></i>
                                </a>
                                <div class="dropdown-menu dropdown-menu-xl  dropdown-menu-right  py-0 overflow-hidden">
                                    <!-- Dropdown header -->
                                    <div class="px-3 py-3">
                                        <h6 class="text-sm text-muted m-0">You have <strong class="text-primary">13</strong> notifications.</h6>
                                    </div>
                                    <!-- List group -->
                                    <div class="list-group list-group-flush">
                                        <a href="#!" class="list-group-item list-group-item-action">
                                            <div class="row align-items-center">
                                                <div class="col-auto">
                                                    <!-- Avatar -->
                                                    <!--<img alt="Image placeholder" src="assets/img/theme/team-1.jpg" class="avatar rounded-circle">-->
                                                </div>
                                                <div class="col ml--2">
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <div>
                                                            <h4 class="mb-0 text-sm">John Snow</h4>
                                                        </div>
                                                        <div class="text-right text-muted">
                                                            <small>2 hrs ago</small>
                                                        </div>
                                                    </div>
                                                    <p class="text-sm mb-0">Let's meet at Starbucks at 11:30. Wdyt?</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="#!" class="list-group-item list-group-item-action">
                                            <div class="row align-items-center">
                                                <div class="col-auto">
                                                    <!-- Avatar -->
                                                    <!--<img alt="Image placeholder" src="assets/img/theme/team-2.jpg" class="avatar rounded-circle">-->
                                                </div>
                                                <div class="col ml--2">
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <div>
                                                            <h4 class="mb-0 text-sm">John Snow</h4>
                                                        </div>
                                                        <div class="text-right text-muted">
                                                            <small>3 hrs ago</small>
                                                        </div>
                                                    </div>
                                                    <p class="text-sm mb-0">A new issue has been reported for Argon.</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="#!" class="list-group-item list-group-item-action">
                                            <div class="row align-items-center">
                                                <div class="col-auto">
                                                    <!-- Avatar -->
                                                    <!--<img alt="Image placeholder" src="assets/img/theme/team-3.jpg" class="avatar rounded-circle">-->
                                                </div>
                                                <div class="col ml--2">
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <div>
                                                            <h4 class="mb-0 text-sm">John Snow</h4>
                                                        </div>
                                                        <div class="text-right text-muted">
                                                            <small>5 hrs ago</small>
                                                        </div>
                                                    </div>
                                                    <p class="text-sm mb-0">Your posts have been liked a lot.</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="#!" class="list-group-item list-group-item-action">
                                            <div class="row align-items-center">
                                                <div class="col-auto">
                                                    <!-- Avatar -->
                                                    <!--<img alt="Image placeholder" src="assets/img/theme/team-4.jpg" class="avatar rounded-circle">-->
                                                </div>
                                                <div class="col ml--2">
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <div>
                                                            <h4 class="mb-0 text-sm">John Snow</h4>
                                                        </div>
                                                        <div class="text-right text-muted">
                                                            <small>2 hrs ago</small>
                                                        </div>
                                                    </div>
                                                    <p class="text-sm mb-0">Let's meet at Starbucks at 11:30. Wdyt?</p>
                                                </div>
                                            </div>
                                        </a>
                                        <a href="#!" class="list-group-item list-group-item-action">
                                            <div class="row align-items-center">
                                                <div class="col-auto">
                                                    <!-- Avatar -->
                                                    <!--<img alt="Image placeholder" src="assets/img/theme/team-5.jpg" class="avatar rounded-circle">-->
                                                </div>
                                                <div class="col ml--2">
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <div>
                                                            <h4 class="mb-0 text-sm">John Snow</h4>
                                                        </div>
                                                        <div class="text-right text-muted">
                                                            <small>3 hrs ago</small>
                                                        </div>
                                                    </div>
                                                    <p class="text-sm mb-0">A new issue has been reported for Argon.</p>
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                    <!-- View all -->
                                    <a href="#!" class="dropdown-item text-center text-primary font-weight-bold py-3">View all</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="ni ni-ungroup"></i>
                                </a>
                                <div class="dropdown-menu dropdown-menu-lg dropdown-menu-dark bg-default  dropdown-menu-right ">
                                    <div class="row shortcuts px-4">
                                        <a href="#!" class="col-4 shortcut-item">
                                            <span class="shortcut-media avatar rounded-circle bg-gradient-red">
                                                <i class="ni ni-calendar-grid-58"></i>
                                            </span>
                                            <small>Calendar</small>
                                        </a>
                                        <a href="#!" class="col-4 shortcut-item">
                                            <span class="shortcut-media avatar rounded-circle bg-gradient-orange">
                                                <i class="ni ni-email-83"></i>
                                            </span>
                                            <small>Email</small>
                                        </a>
                                        <a href="#!" class="col-4 shortcut-item">
                                            <span class="shortcut-media avatar rounded-circle bg-gradient-info">
                                                <i class="ni ni-credit-card"></i>
                                            </span>
                                            <small>Payments</small>
                                        </a>
                                        <a href="#!" class="col-4 shortcut-item">
                                            <span class="shortcut-media avatar rounded-circle bg-gradient-green">
                                                <i class="ni ni-books"></i>
                                            </span>
                                            <small>Reports</small>
                                        </a>
                                        <a href="#!" class="col-4 shortcut-item">
                                            <span class="shortcut-media avatar rounded-circle bg-gradient-purple">
                                                <i class="ni ni-pin-3"></i>
                                            </span>
                                            <small>Maps</small>
                                        </a>
                                        <a href="#!" class="col-4 shortcut-item">
                                            <span class="shortcut-media avatar rounded-circle bg-gradient-yellow">
                                                <i class="ni ni-basket"></i>
                                            </span>
                                            <small>Shop</small>
                                        </a>
                                    </div>
                                </div>
                            </li>
                        </ul>
                        <ul class="navbar-nav align-items-center  ml-auto ml-md-0 ">
                            <li class="nav-item dropdown">

                                <div class="dropdown-menu  dropdown-menu-right ">
                                    <div class="dropdown-header noti-title">
                                        <h6 class="text-overflow m-0">Welcome!</h6>
                                    </div>
                                    <a href="#!" class="dropdown-item">
                                        <i class="ni ni-single-02"></i>
                                        <span>My profile</span>
                                    </a>
                                    <a href="#!" class="dropdown-item">
                                        <i class="ni ni-settings-gear-65"></i>
                                        <span>Settings</span>
                                    </a>
                                    <a href="#!" class="dropdown-item">
                                        <i class="ni ni-calendar-grid-58"></i>
                                        <span>Activity</span>
                                    </a>
                                    <a href="#!" class="dropdown-item">
                                        <i class="ni ni-support-16"></i>
                                        <span>Support</span>
                                    </a>
                                    <div class="dropdown-divider"></div>
                                    <a href="#!" class="dropdown-item">
                                        <i class="ni ni-user-run"></i>
                                        <span>Logout</span>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

            <div class="container-fluid mt--6">
                <div class="row">
                    <div class="col-xl-4 order-xl-2">

                    </div>
                    <div class="col-xl-8 order-xl-1">
                        <div class="card">
                            <div class="card-header">
                                <div class="row align-items-center">
                                    <div class="col-8">
                                        <h3 class="mb-0">Employee Performance Manage</h3>
                                    </div>
                                    <!--                <div class="col-4 text-right">
                                                      <a href="#!" class="btn btn-sm btn-primary">Settings</a>
                                                    </div>-->
                                </div>
                            </div>


                            <div class="card-body">

                                <h6 class="heading-small text-muted mb-4">Add Employee Performance</h6>
                                <div class="pl-lg-4">
                                    <div class="row">
                                           <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="form-control-label" for="input-last-name">Select Employee</label>
                                                <select name="cars" id="employeeid" onclick="select()">


                                                </select>
                                            </div>
                                        </div>
                                        
                                       
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="form-control-label" for="input-email">Date</label>
                                                <input type="date" id="input-date" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="form-control-label" for="input-first-name">Employee Experience</label>
                                                <input type="text" id="input-experience" class="form-control" placeholder="">
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="form-control-label" for="input-first-name">Feedback</label>
                                                <input type="text" id="input-feedback" class="form-control" placeholder="">
                                            </div>
                                        </div>
                                        </div>
                                    </div>
                                    
                                      <div class="row">
                                        <div class="col-lg-6">
                                            <div class="form-group">
                                                <label class="form-control-label" for="input-first-name">Complains</label>
                                                <input type="text" id="input-complain" class="form-control" placeholder="">
                                                <input type="hidden" value="" id="hide">
                                            </div>
                                        </div>
                                      
                                    </div>
                                </div>


                                <!--<input type="hidden" value="" id="hiddenid">-->



                                <div class="row">

                                    <div class="form-group">
                                        <div class="col-4 text-right">

                                            <input type="submit" value="Save" class="btn btn-sm btn-primary" onclick="save()">
                                        </div>
                                    </div>


                                    <div class="form-group">
                                        <div class="col-4 text-right">

                                            <input type="submit" value="Update" class="btn btn-sm btn-primary" onclick="update()">
                                        </div>
                                    </div>

                                </div>

                                <table class="table align-items-center table-dark">
                                    <thead class="thead-dark">
                                        <tr>
                                            <th scope="col" class="sort" data-sort="name">ID</th>
                                            <th scope="col" class="sort" data-sort="budget">Experience</th>
                                            <th scope="col" class="sort" data-sort="status">Feedback</th>
                                            <th scope="col" class="sort" data-sort="status">Complains</th>
                                            <th scope="col" class="sort" data-sort="status">Date</th>

                                        </tr>
                                    </thead>
                                    <tbody id="tbody">

                                    </tbody>
                                </table>

                            </div>
                        </div>



                    </div>
                </div>

            </div>
        </div>
        <!-- Argon Scripts -->
        <!-- Core -->
        <script src="assets/vendor/jquery/dist/jquery.min.js"></script>
        <script src="assets/vendor/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/js-cookie/js.cookie.js"></script>
        <script src="assets/vendor/jquery.scrollbar/jquery.scrollbar.min.js"></script>
        <script src="assets/vendor/jquery-scroll-lock/dist/jquery-scrollLock.min.js"></script>
        <!-- Argon JS -->
        <script src="assets/js/argon.js?v=1.2.0"></script>
    </body>

</html>
