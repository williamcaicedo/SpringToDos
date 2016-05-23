<!DOCTYPE html>
<html lang="en" ng-app="springToDosApp">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>To Dos App</title>

        <!-- Material Design Icons -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

        <!-- Bootstrap core CSS -->
        <link href="assets/css/bootstrap.min.css" rel="stylesheet">

        <!-- Material Design Bootstrap -->
        <link href="assets/css/mdb.css" rel="stylesheet">


        <!-- Template style -->
        <link href="assets/css/style.css" rel="stylesheet">

    </head>

    <body>


        


        <script type="text/ng-template" id="loginModal">
            <div class="modal-header">
            <button type="button" class="close" ng-click="cancel();" aria-hidden="true">&times;</button>
            <h4 class="modal-title">Login</h4>
            </div>
            <div class="modal-body">
            <form name="loginForm" novalidate>
            <br/>
            <div class="row">
            <div class="col-md-5">
            <div class="form-group">
            <label for="name" class="control-label">Username: </label>
            <input id="name" class="form-control" type="text" ng-model="user.username" required/>
            </div>
            </div>
            </div>
            <br/>
            <div class="row">
            <div class="col-md-5">
            <div class="form-group">
            <label for="director" class="control-label">Password: </label>
            <input id="director" class="form-control" type="password" ng-model="user.password" required/>
            </div>
            </div>
            </div>


            </form>
            </div>
            <div class="modal-footer">
            <button type="button" class="btn btn-primary" ng-disabled="loginForm.$invalid" ng-click="ok()">Add</button>
            </div>
        </script>

        <!-- Navigation -->
        <nav ng-controller="navbarController" class="navbar z-depth-2 info-color">
            <div class="container ">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand waves-effect waves-light" href="#/">To Dos App</a>
                    <a class="navbar-brand waves-effect waves-light" href="#/" ng-click="addToDo()">Add a To Do</a>



                </div>
                <a ng-show="!isLoggedIn" class="navbar-brand waves-effect waves-light" href="#/login">Login</a>
                <a ng-show="isLoggedIn" class="navbar-brand waves-effect waves-light" ng-click="logout()">Logout</a>
                <div class="collapse navbar-collapse pull-right" id="bs-example-navbar-collapse-1">

                    <!--form class="navbar-form navbar-right waves-effect waves-light" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                    </form-->
                </div>
            </div>
        </nav>

        <!-- Page Content -->
        <div ng-view class="container">










            <hr>

        </div>
        <!-- /.container -->


        <!-- Footer -->
        <footer class="page-footer info-color darken-1" if="footer">
            <div class="container">
                <div class="row">

                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    <div class="col-md-10 col-md-offset-1 center-on-small-only"> <a href="http://www.unitecnologica.edu.co">Universidad Tecnol&oacute;gica de Bol&iacute;var</a>

                    </div>
                </div>
            </div>
        </footer>


        <!-- SCRIPTS -->

        <script>
            apiUrl = "${apiUrl}";
        </script>

        <!-- JQuery -->
        <script type="text/javascript" src="assets/js/lib/jquery.min.js"></script>

        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="assets/js/lib/bootstrap.min.js"></script>

        <!-- Material Design Bootstrap -->
        <script type="text/javascript" src="assets/js/lib/mdb.js"></script>



        <script src="assets/js/lib/lodash.min.js"></script>
        <script src="assets/js/lib/angular.min.js"></script>
        <script src="assets/js/lib/angular-route.min.js"></script>
        <!--angular - boostrap "interface"-->
        <script src="assets/js/lib/ui-bootstrap-tpls-0.14.0.min.js"></script>
        <script src="assets/js/moduleRegistration.js"></script>
        <script src="assets/js/services/todoService.js"></script>
        <script src="assets/js/services/authService.js"></script>
        <script src="assets/js/controllers/navbarController.js"></script>
        <script src="assets/js/controllers/homeController.js"></script>
        <script src="assets/js/controllers/loginController.js"></script>

        <script src="assets/js/app.js"></script>



    </body>

</html>