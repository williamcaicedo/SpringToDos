/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var services = angular.module('springToDosAppServices');
services.factory('todoService', ['$http', '_', function ($http, _) {
        var apiUrl = 'http://localhost:8080/SpringToDos/';
        return {
            getAll: function() {
                return $http.get(apiUrl + 'todo/');
            },
            getById: function(id) {
                return $http.get(apiUrl + 'todo/'+id);
            },
            save: function(todo) {
                return $http.post(apiUrl + 'todo/',todo);
            },
            update: function(todo) {
                return $http.put(apiUrl + 'todo/',todo);
            },
            delete: function(id) {
                return $http.delete(apiUrl + 'todo/'+id);
            }
            
        };
    }]);

