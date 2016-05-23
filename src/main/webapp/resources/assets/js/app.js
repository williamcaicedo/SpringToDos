/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



app = angular.module('springToDosApp', ['springToDosAppControllers', 'springToDosAppServices',
    'ngRoute', 'ui.bootstrap', 'lodash']);


app.config(['$routeProvider', '$httpProvider',
    function ($routeProvider, $httpProvider) {
        $routeProvider.
                when('/detail/:todoId', {
                    templateUrl: 'assets/js/views/detail.html',
                    controller: 'detailController'
                }).when('/', {
                    templateUrl: 'assets/js/views/home.html',
                    controller: 'homeController'
                }).when('/login', {
                    templateUrl: 'assets/js/views/login.html',
                    controller: 'loginController'
                })
                .otherwise({
                    redirectTo: '/'
                });

        $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';



    }])

        .run(['$rootScope', '$location', 'authService', function ($rootScope, $location, authService) {
                $rootScope.$on("$routeChangeStart", function (event, next, current) {
                    authService.login().then(function (response) {
                        if (response.data.name === undefined)
                            $location.path('/login');
                    });

                    /*if (next.templateUrl === "assets/js/app/views/admin.html") {
                     
                     
                     }*/
                });
            }]);
  