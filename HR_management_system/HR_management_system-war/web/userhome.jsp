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
        <title>HR Management System</title>
        <!-- Favicon -->
        <link rel="icon" href="assets/img/brand/favicon.png" type="image/png">
        <!-- Fonts -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700">
        <!-- Icons -->
        <link rel="stylesheet" href="assets/vendor/nucleo/css/nucleo.css" type="text/css">
        <link rel="stylesheet" href="assets/vendor/@fortawesome/fontawesome-free/css/all.min.css" type="text/css">
        <!-- Page plugins -->
        <!-- Argon CSS -->
        <link rel="stylesheet" href="assets/css/argon.css?v=1.2.0" type="text/css">

        <!--<script type="text/javascript" src="userprofile.js"></script>-->
        <script>
        function user(){
       console.log("Hi");
            var a = "";
            const queryString = window.location.search;

            const urlParams = new URLSearchParams(queryString);
            const empid = urlParams.get('id')
            console.log(empid)
       //     var name = document.getElementById("input-username");
            var data = document.getElementById("userdata");
            var address = document.getElementById("address");
            var tel = document.getElementById("tel");
            var email = document.getElementById("email");
            var dobb = document.getElementById("dob");
            var designation = document.getElementById("desi");
           // var jobrole = document.getElementById("input-jobrole")
            //console.log(name);
         //   var a="Kalpa";
            console.log(a);
         // name.innerHTML=a;
         // name.value=a;
          
                      let xmlHttp3;
            if (window.XMLHttpRequest) {
                xmlHttp3 = new XMLHttpRequest();


            } else {
                xmlHttp3 = new ActiveXobject("Microsoft.XMLHTTP");
            }

//var name = document.getElementById("username")



            xmlHttp3.onreadystatechange = function () {
                if (xmlHttp3.readyState == 4 && xmlHttp3.status == 200) {
                    var ar = JSON.parse(xmlHttp3.responseText);
                    // const xmlDoc=this.responseXML;
                    // const ar response=JSON.parse(xmlHttp.responseText);
                    console.log("kalpa sadaruwan");
                      console.log(ar);
                    ar.forEach(value => {
                        console.log(value.fname);
                        //   data="<h1>"+value.fname+"</h1>"
                    //   name.value=value.fname;
                       data.innerHTML="Welcome to Your Profile : "+value.fname+" "+value.mname+" "+value.lname;
                       address.innerHTML="Address : "+value.address1+" "+value.address2+" "+value.address3;
                      tel.innerHTML="Telephone : "+value.tel;
                       email.innerHTML="Email : "+value.email;
                       designation.innerHTML="Designation : "+value.url;
                        dobb.innerHTML="Birthday : "+value.dob;
                    });

                    //  name.innerHTML=data;

                }
            }
            xmlHttp3.open("GET", "get_employee_from_id?id=" + empid, true);
            //  xmlHttp.open("POST", "view_all?id="+id, true);
            xmlHttp3.send();
          
          
          
}
          
        </script>
    </head>

    <body>
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
                                
                                    <i class="ni ni-tv-2 text-primary"></i>
                                    <span class="nav-link-text" onclick="user()">User Information</span>
                                
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="">
                                    <i class="ni ni-planet text-orange"></i>
                                    <span class="nav-link-text">Add Bank Details</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="">
                                    <i class="ni ni-pin-3 text-primary"></i>
                                    <span class="nav-link-text">Add Insurance Details</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="">
                                    <i class="ni ni-single-02 text-yellow"></i>
                                    <span class="nav-link-text">Request Leaves</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="">
                                    <i class="ni ni-bullet-list-67 text-default"></i>
                                    <span class="nav-link-text">Approve Leaves</span>
                                </a>
                            </li>


                        </ul>
                        <!-- Divider -->

                        <!-- Heading -->

                        <!-- Navigation -->

                    </div>
                </div>
            </div>
        </nav>
        <!-- Main content -->
        <div class="main-content" id="panel">
            <!-- Topnav -->
            <nav class="navbar navbar-top navbar-expand navbar-dark bg-primary border-bottom">
                <div class="container-fluid">
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <!-- Search form -->
                        <form class="navbar-search navbar-search-light form-inline mr-sm-3" id="navbar-search-main">
                            <div class="form-group mb-0">
                                <div class="input-group input-group-alternative input-group-merge">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text"><i class="fas fa-search"></i></span>
                                    </div>
                                    <input class="form-control" placeholder="Search" type="text">
                                </div>
                            </div>
                            <button type="button" class="close" data-action="search-close" data-target="#navbar-search-main" aria-label="Close">
                                <span aria-hidden="true">×</span>
                            </button>
                        </form>
                        <!-- Navbar links -->

                        <ul class="navbar-nav align-items-center  ml-auto ml-md-0 ">
                            <li class="nav-item dropdown">
                                <a class="nav-link pr-0" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <div class="media align-items-center">
                                        <span class="avatar avatar-sm rounded-circle">
                                            <img alt="Image placeholder" src="assets/img/theme/team-4.jpg">
                                        </span>
                                        <div class="media-body  ml-2  d-none d-lg-block" id="empname">
                                            <!--<span class="mb-0 text-sm  font-weight-bold" id="empname"> </span>-->
                                        </div>

                                    </div>
                                </a>

                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <!-- Header -->
            <!-- Header -->
            <div class="header bg-primary pb-6">
                <div class="container-fluid">
                    <div class="header-body">
                        <div class="row align-items-center py-4">
                            <div class="col-lg-6 col-7">
                                <h6 class="h2 text-white d-inline-block mb-0" >User Information</h6>
                                <br>
                                <h6 class="h2 text-white d-inline-block mb-0" id="userdata"></h6>
                                <br>
                                <h6 class="h2 text-white d-inline-block mb-0" id="address"></h6>
                                <br>
                                <h6 class="h2 text-white d-inline-block mb-0" id="tel"></h6>
                                <br>
                                <h6 class="h2 text-white d-inline-block mb-0" id="email"></h6>
                                <br>
                                <h6 class="h2 text-white d-inline-block mb-0" id="dob"></h6>
                                <br>
                                <h6 class="h2 text-white d-inline-block mb-0" id="desi"></h6>
                            </div>

                        </div>
                        <!-- Card stats -->
                        <div class="row">
                          


                            <div class="col-xl-3 col-md-6">
                                <div class="card card-stats">
                                    <!-- Card body -->
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col">
                                                <h5 class="card-title text-uppercase text-muted mb-0">Performance</h5>
                                                
                                                <span class="h2 font-weight-bold mb-0">49,65%</span>
                                            </div>
                                            <div class="col-auto">
                                                <div class="icon icon-shape bg-gradient-info text-white rounded-circle shadow">
                                                    <i class="ni ni-chart-bar-32"></i>
                                                </div>
                                            </div>
                                        </div>
                                        <p class="mt-3 mb-0 text-sm">
                                            <span class="text-success mr-2"><i class="fa fa-arrow-up"></i> 3.48%</span>
                                            <span class="text-nowrap">Since last month</span>
                                        </p>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <!-- Page content -->
            <div class="container-fluid mt--6">
                <div class="row">


                </div>
                <div class="row">


                </div>
                <!-- Footer -->

            </div>

        </div>
        <!-- Argon Scripts -->
        <!-- Core -->
        <script src="assets/vendor/jquery/dist/jquery.min.js"></script>
        <script src="assets/vendor/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/js-cookie/js.cookie.js"></script>
        <script src="assets/vendor/jquery.scrollbar/jquery.scrollbar.min.js"></script>
        <script src="assets/vendor/jquery-scroll-lock/dist/jquery-scrollLock.min.js"></script>
        <!-- Optional JS -->
        <script src="assets/vendor/chart.js/dist/Chart.min.js"></script>
        <script src="assets/vendor/chart.js/dist/Chart.extension.js"></script>
        <!-- Argon JS -->
        <script src="assets/js/argon.js?v=1.2.0"></script>

    </body>

</html>

