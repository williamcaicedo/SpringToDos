/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var servicesModule = angular.module('springToDosAppServices');
servicesModule.factory('authService', ['$http', function ($http) {
        return {
            login: function(user) {
                var headers = user ? {
                    Authorization: 'Basic ' + btoa(user.username + ":" + user.password)
                } : {};
                return $http.get(apiUrl + 'user', {headers: headers});
            },
            logout: function () {
                return $http.post(apiUrl + 'logout', {});
            }
        };
}]);