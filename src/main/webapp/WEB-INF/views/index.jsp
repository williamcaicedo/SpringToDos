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

    <body ng-controller="homeController">


        <script type="text/ng-template" id="addToDoModal">
    <div class="modal-header">
    <button type="button" class="close" ng-click="cancel();" aria-hidden="true">&times;</button>
    <h4 class="modal-title">Add a To Do</h4>
    </div>
    <div class="modal-body">
    <form name="todoForm" novalidate>
    <br/>
    <div class="row">
    <div class="col-md-5">
    <div class="form-group">
    <label for="name" class="control-label">Name: </label>
    <input id="name" class="form-control" type="text" ng-model="todo.title" required/>
    </div>
    </div>
    </div>
    <br/>
    <div class="row">
    <div class="col-md-5">
    <div class="form-group">
    <label for="director" class="control-label">Description </label>
    <input id="director" class="form-control" type="text" ng-model="todo.description" required/>
    </div>
    </div>
    </div>
    <br/>
    <div class="row">
    <div class="col-md-5">
    <div class="form-group">
    <label for="releaseDate" class="control-label">Due Date: </label>
    <input id="releaseDate" class="form-control" type="date" ng-model="todo.dueDate" required/>
    </div>
    </div>
    </div>


    </form>
    </div>
    <div class="modal-footer">
    <button type="button" class="btn btn-primary" ng-disabled="todoForm.$invalid" ng-click="ok()">Add</button>
    <button class="btn btn-warning" type="button" ng-click="cancel()">Cancel</button>
    </div>
        </script>

        <!-- Navigation -->
        <nav class="navbar z-depth-2 info-color">
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

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                    <!--form class="navbar-form navbar-right waves-effect waves-light" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                    </form-->
                </div>
            </div>
        </nav>

        <!-- Page Content -->
        <div class="container">





            <!-- /.row -->
            <div>
                <div ng-repeat="todo in todos">
                    <!-- Project One -->
                    <div  class="row">
                        <div class="col-md-7">
                            <a href="">
                                <img class="img-responsive z-depth-1 hoverable hidden-sm hidden-xs" src="http://lorempixel.com/400/200/" alt="">
                            </a>

                        </div>
                        <div class="col-md-5" style="padding-top: 1em" id="videomaker">
                            <h3><i class="fa fa-star "></i> {{todo.title}}</h3>
                            <p>{{todo.description| limitTo:200}}...</p>
                            <a href="#/detail/{{todo.id}}">
                                <button type="button" class="btn btn-info waves-effect waves-light">More...</button>
                            </a>
                        </div>
                    </div>
                    <!-- /.row -->

                    <hr>
                </div>

            </div>




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
        <script src="assets/js/controllers/homeController.js"></script>

        <script src="assets/js/app.js"></script>



    </body>

</html>