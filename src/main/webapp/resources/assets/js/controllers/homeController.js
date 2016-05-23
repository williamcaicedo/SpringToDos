/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var controllerModule = angular.module('springToDosAppControllers');

controllerModule.controller('homeController', ['$scope', 'todoService', '_', function ($scope, todoService, _) {
        $scope.todos = [];

        $scope.getAllTodos = function () {
            todoService.getAll().then(function(response) {
                $scope.todos = response.data;
            });
        };
        
        $scope.getAllTodos();
        


    }]);
