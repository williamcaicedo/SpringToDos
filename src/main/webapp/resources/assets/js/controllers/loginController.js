/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var controllerModule = angular.module('springToDosAppControllers');

controllerModule.controller('loginController', ['$scope', '$rootScope','$location', '$route', 'authService',
    function ($scope, $rootScope, $location, $route, authService) {
        $scope.user = {};
        $scope.loginError = false;
        $scope.login = function () {
            authService.login($scope.user).then(function (response) {
                if (response.data.name === undefined)
                    $scope.loginError = true;
                else {
                    $rootScope.isLoggedIn = true;
                    $route.reload();
                    $location.path('/');
                }
            }, function(response) {
                $scope.loginError = true;
            });
        };

    }]);
