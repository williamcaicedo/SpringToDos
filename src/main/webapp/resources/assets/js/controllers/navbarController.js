/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var controllerModule = angular.module('springToDosAppControllers');

controllerModule.controller('navbarController', ['$scope', '$rootScope', '$uibModal', '$route',
    'todoService', 'authService', '_', function ($scope, $rootScope, $uibModal, $route, todoService, authService, _) {
        $scope.todos = [];
        $scope.addToDo = function () {
            $uibModal.open({
                templateUrl: 'addToDoModal',
                controller: 'navbarController.addToDoModal',
                size: 'md'
            }).result.then(function (t) {
                todoService.save(t)
                        .then(function (response) {
                            $route.reload();
                        });
            });
        };

        $scope.checkLogin = function () {
            authService.login().then(function (response) {
                if (response.data.name !== undefined)
                    $rootScope.isLoggedIn = true;
                else
                    $rootScope.isLoggedIn = false;
            });
        };

        $scope.logout = function () {
            authService.logout().then(function (response) {
                $rootScope.isLoggedIn = false;
                $route.reload();
                
            }, function(response) {
                $rootScope.isLoggedIn = false;
                $route.reload();
                
            });

        };

        $scope.checkLogin();





    }]);
controllerModule.controller('navbarController.addToDoModal', ['$scope', '$modalInstance', function ($scope, $modalInstance) {
        $scope.todo = {};

        $scope.cancel = function () {
            $modalInstance.dismiss('cancel');
        };

        $scope.ok = function () {

            $modalInstance.close($scope.todo);
        };
    }]);

