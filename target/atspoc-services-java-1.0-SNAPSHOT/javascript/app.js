var atspocApp = angular.module('atspocApp', ['ngRoute']);

atspocApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: 'index.html',
                controller: 'IndexCtrl'
            }).
            otherwise({
                redirectTo: '/campaigns'
            });
    }]);

