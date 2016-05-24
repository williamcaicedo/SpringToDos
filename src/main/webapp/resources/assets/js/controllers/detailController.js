/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var controllerModule = angular.module('springToDosAppControllers');

controllerModule.controller('detailController', ['$scope', '$routeParams', '$location', 'todoService', '_', 
    function ($scope, $routeParams, $location, todoService, _) {
        $scope.todo = {};

        $scope.getTodo = function (id) {
            todoService.getById(id).then(function(response) {
                $scope.todo = response.data;
            });
        };
        
        if ($routeParams.todoId) {
            $scope.getTodo(parseInt($routeParams.todoId));
        } else {
            $location.path('/');
        }
        


    }]);
