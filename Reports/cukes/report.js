$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/flight/english/GuestUser.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#src/test/resources/features/flight/english/GuestUser.feature"
    }
  ],
  "line": 2,
  "name": "Guest user functionality on Flights",
  "description": "As a User to be able to use Flights functionality\r\nI want to be able to successfully login to Flights",
  "id": "guest-user-functionality-on-flights",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 42,
  "name": "Validate if the user can book OneWay Trip",
  "description": "",
  "id": "guest-user-functionality-on-flights;validate-if-the-user-can-book-oneway-trip",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 41,
      "name": "@flight_healthcheck"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "I go to Rehlat Home page",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "I go to select OneWay Radio button",
  "keyword": "When "
});
formatter.examples({
  "line": 45,
  "name": "",
  "description": "",
  "id": "guest-user-functionality-on-flights;validate-if-the-user-can-book-oneway-trip;",
  "rows": [
    {
      "cells": [
        "userName"
      ],
      "line": 46,
      "id": "guest-user-functionality-on-flights;validate-if-the-user-can-book-oneway-trip;;1"
    },
    {
      "cells": [
        "***"
      ],
      "line": 47,
      "id": "guest-user-functionality-on-flights;validate-if-the-user-can-book-oneway-trip;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13772756257,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on login page of Flights",
  "keyword": "Given "
});
formatter.match({
  "location": "FlightLoginSteps.i_am_on_login_page_of_Flight()"
});
formatter.result({
  "duration": 72601662,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Validate if the user can book OneWay Trip",
  "description": "",
  "id": "guest-user-functionality-on-flights;validate-if-the-user-can-book-oneway-trip;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 41,
      "name": "@flight_healthcheck"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "I go to Rehlat Home page",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "I go to select OneWay Radio button",
  "keyword": "When "
});
formatter.match({
  "location": "FlightLoginSteps.i_go_to_Home_page()"
});
formatter.result({
  "duration": 72708721,
  "status": "passed"
});
formatter.match({
  "location": "OneWayTripSteps.i_go_to_select_oneway()"
});
formatter.result({
  "duration": 2180130575,
  "status": "passed"
});
formatter.after({
  "duration": 2856003122,
  "status": "passed"
});
});