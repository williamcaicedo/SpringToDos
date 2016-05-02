/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



app = angular.module('springToDosApp',['springToDosAppControllers', 'springToDosAppServices', 
    'ngRoute', 'ui.bootstrap', 'lodash']);


/* app.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
        when('/detail/:todoId', {
            templateUrl: 'js/views/detail.html',
            controller: 'detailController'
        }).when('/', {
            templateUrl: 'js/views/home.html',
            controller: 'homeController'
        }).otherwise({
            redirectTo: '/'
        });

        

    }]);
    */