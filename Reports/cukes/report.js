$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/hotels/english/GuestUser.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#src/test/resources/features/hotels/english/GuestUser.feature"
    }
  ],
  "line": 2,
  "name": "Guest user functionality on Hotels",
  "description": "",
  "id": "guest-user-functionality-on-hotels",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Validate if the user can book on Hotels",
  "description": "",
  "id": "guest-user-functionality-on-hotels;validate-if-the-user-can-book-on-hotels",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@flight_healthcheck"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I go to Rehlat Home page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I can click on hotel link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I can enter Hotel city name",
  "rows": [
    {
      "cells": [
        "cityName",
        "\u003ccityName\u003e"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can select CheckIn Date and CheckOut Date",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I can select the hotel traveller Details",
  "rows": [
    {
      "cells": [
        "rooms",
        "\u003crooms\u003e"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I can click on Book now and Verify the Price and Dates",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I can enter hotel Traveller details",
  "rows": [
    {
      "cells": [
        "rooms",
        "\u003crooms\u003e"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "guest-user-functionality-on-hotels;validate-if-the-user-can-book-on-hotels;",
  "rows": [
    {
      "cells": [
        "userName",
        "cityName",
        "rooms"
      ],
      "line": 20,
      "id": "guest-user-functionality-on-hotels;validate-if-the-user-can-book-on-hotels;;1"
    },
    {
      "cells": [
        "******",
        "MCT",
        "2"
      ],
      "line": 21,
      "id": "guest-user-functionality-on-hotels;validate-if-the-user-can-book-on-hotels;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 17269510619,
  "status": "passed"
});
formatter.before({
  "duration": 373530,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on login page of Hotels",
  "keyword": "Given "
});
formatter.match({
  "location": "FlightLoginSteps.i_am_on_login_page_of_Hotels()"
});
formatter.result({
  "duration": 135770147,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validate if the user can book on Hotels",
  "description": "",
  "id": "guest-user-functionality-on-hotels;validate-if-the-user-can-book-on-hotels;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@flight_healthcheck"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I go to Rehlat Home page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I can click on hotel link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I can enter Hotel city name",
  "matchedColumns": [
    1
  ],
  "rows": [
    {
      "cells": [
        "cityName",
        "MCT"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can select CheckIn Date and CheckOut Date",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I can select the hotel traveller Details",
  "matchedColumns": [
    2
  ],
  "rows": [
    {
      "cells": [
        "rooms",
        "2"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I can click on Book now and Verify the Price and Dates",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I can enter hotel Traveller details",
  "matchedColumns": [
    2
  ],
  "rows": [
    {
      "cells": [
        "rooms",
        "2"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "FlightLoginSteps.i_go_to_Home_page()"
});
formatter.result({
  "duration": 121197273,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelSteps.i_can_click_on_hotel_link()"
});
formatter.result({
  "duration": 9175867605,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelSteps.i_can_enter_Hotel_city_name(DataTable)"
});
formatter.result({
  "duration": 5325756213,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelSteps.i_can_select_CheckIn_date_and_CheckOut_date()"
});
formatter.result({
  "duration": 4909400712,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelSteps.i_can_select_the_hotel_traveller_details(DataTable)"
});
formatter.result({
  "duration": 10149834163,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelSteps.i_can_click_on_book_now_and_verify_the_price_and_dates()"
});
formatter.result({
  "duration": 25207581203,
  "status": "passed"
});
formatter.match({
  "location": "TravellerInformation_HotelsSteps.i_can_enter_hotel_Traveller_details(DataTable)"
});
formatter.result({
  "duration": 1773104431,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1863945060,
  "status": "passed"
});
});