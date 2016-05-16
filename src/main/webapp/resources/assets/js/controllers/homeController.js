/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var controllerModule = angular.module('springToDosAppControllers');

controllerModule.controller('homeController', ['$scope', '$uibModal', 'todoService', '_', function ($scope, $uibModal, todoService, _) {
        $scope.todos = [];

        $scope.getAllTodos = function () {
            todoService.getAll().then(function(response) {
                $scope.todos = response.data;
            });
        };
        
        $scope.addToDo = function () {
            $uibModal.open({
                templateUrl: 'addToDoModal',
                controller: 'homeController.addToDoModal',
                size: 'md'
            }).result.then(function (t) {
                todoService.save(t)
                        .then(function (response) {
                            $scope.getAllTodos();
                        });
            });
        };
        
        $scope.getAllTodos();
        
        $scope.login = function () {
            $uibModal.open({
                templateUrl: 'loginModal',
                controller: 'homeController.loginModal',
                size: 'md'
            }).result.then(function (l) {
                
            });
        };


    }]);
controllerModule.controller('homeController.addToDoModal', ['$scope', '$modalInstance', function ($scope, $modalInstance) {
        $scope.todo = {};

        $scope.cancel = function () {
            $modalInstance.dismiss('cancel');
        };

        $scope.ok = function () {

            $modalInstance.close($scope.todo);
        };
    }]);

controllerModule.controller('homeController.loginModal', ['$scope', '$modalInstance', function ($scope, $modalInstance) {
        $scope.todo = {};

        $scope.cancel = function () {
            $modalInstance.dismiss('cancel');
        };

        $scope.ok = function () {

            $modalInstance.close($scope.userLogin);
        };
    }]);

