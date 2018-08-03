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
  "line": 10,
  "name": "Validate if the user can book OneWay Trip",
  "description": "",
  "id": "guest-user-functionality-on-flights;validate-if-the-user-can-book-oneway-trip",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@flight_healthcheck"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I go to Rehlat Home page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I go to select OneWay Radio button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can enter From and To city names",
  "rows": [
    {
      "cells": [
        "fromCity",
        "\u003cfromCity\u003e"
      ],
      "line": 14
    },
    {
      "cells": [
        "toCity",
        "\u003ctoCity\u003e"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I can select date and traveller information",
  "rows": [
    {
      "cells": [
        "adults",
        "\u003cadults\u003e"
      ],
      "line": 17
    },
    {
      "cells": [
        "childs",
        "\u003cchilds\u003e"
      ],
      "line": 18
    },
    {
      "cells": [
        "infant",
        "\u003cinfant\u003e"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I can verify text and select the filter",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I can verify price details in flightdetails Pop up page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I can verify add on check box",
  "rows": [
    {
      "cells": [
        "addOnBaggage",
        "\u003caddOnBaggage\u003e"
      ],
      "line": 23
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I can enter email and coupon code and verify the show more details popUp",
  "rows": [
    {
      "cells": [
        "CouponCodeStatus",
        "\u003cCouponCodeStatus\u003e"
      ],
      "line": 25
    },
    {
      "cells": [
        "EnterCoupon",
        "\u003cEnterCoupon\u003e"
      ],
      "line": 26
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I can navigative to traveller Information page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I can enter Traveller details",
  "rows": [
    {
      "cells": [
        "adults",
        "\u003cadults\u003e"
      ],
      "line": 29
    },
    {
      "cells": [
        "childs",
        "\u003cchilds\u003e"
      ],
      "line": 30
    },
    {
      "cells": [
        "infant",
        "\u003cinfant\u003e"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I can enter contact details and Click PaySecurel button",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 33,
      "value": "# Then I can navigative to payment page"
    },
    {
      "line": 34,
      "value": "# And I can enter the card details"
    },
    {
      "line": 35,
      "value": "# |selectCard|\u003cselectCard\u003e|"
    }
  ],
  "line": 36,
  "name": "",
  "description": "",
  "id": "guest-user-functionality-on-flights;validate-if-the-user-can-book-oneway-trip;",
  "rows": [
    {
      "cells": [
        "userName",
        "selectCard",
        "fromCity",
        "toCity",
        "adults",
        "childs",
        "infant",
        "addOnBaggage",
        "CouponCodeStatus",
        "EnterCoupon"
      ],
      "line": 37,
      "id": "guest-user-functionality-on-flights;validate-if-the-user-can-book-oneway-trip;;1"
    },
    {
      "cells": [
        "******",
        "KNET",
        "DXB",
        "MCT",
        "2",
        "1",
        "2",
        "NO",
        "NO",
        ""
      ],
      "line": 38,
      "id": "guest-user-functionality-on-flights;validate-if-the-user-can-book-oneway-trip;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14066629375,
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
  "duration": 191555297,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Validate if the user can book OneWay Trip",
  "description": "",
  "id": "guest-user-functionality-on-flights;validate-if-the-user-can-book-oneway-trip;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@flight_healthcheck"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I go to Rehlat Home page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I go to select OneWay Radio button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can enter From and To city names",
  "matchedColumns": [
    2,
    3
  ],
  "rows": [
    {
      "cells": [
        "fromCity",
        "DXB"
      ],
      "line": 14
    },
    {
      "cells": [
        "toCity",
        "MCT"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I can select date and traveller information",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "rows": [
    {
      "cells": [
        "adults",
        "2"
      ],
      "line": 17
    },
    {
      "cells": [
        "childs",
        "1"
      ],
      "line": 18
    },
    {
      "cells": [
        "infant",
        "2"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I can verify text and select the filter",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I can verify price details in flightdetails Pop up page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I can verify add on check box",
  "matchedColumns": [
    7
  ],
  "rows": [
    {
      "cells": [
        "addOnBaggage",
        "NO"
      ],
      "line": 23
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I can enter email and coupon code and verify the show more details popUp",
  "matchedColumns": [
    8,
    9
  ],
  "rows": [
    {
      "cells": [
        "CouponCodeStatus",
        "NO"
      ],
      "line": 25
    },
    {
      "cells": [
        "EnterCoupon",
        ""
      ],
      "line": 26
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I can navigative to traveller Information page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I can enter Traveller details",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "rows": [
    {
      "cells": [
        "adults",
        "2"
      ],
      "line": 29
    },
    {
      "cells": [
        "childs",
        "1"
      ],
      "line": 30
    },
    {
      "cells": [
        "infant",
        "2"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I can enter contact details and Click PaySecurel button",
  "keyword": "And "
});
formatter.match({
  "location": "FlightLoginSteps.i_go_to_Home_page()"
});
formatter.result({
  "duration": 91695652,
  "status": "passed"
});
formatter.match({
  "location": "OneWayTripSteps.i_go_to_select_oneway()"
});
formatter.result({
  "duration": 2229199082,
  "status": "passed"
});
formatter.match({
  "location": "OneWayTripSteps.i_can_enter_from_and_to_city_names(DataTable)"
});
formatter.result({
  "duration": 4455043986,
  "status": "passed"
});
formatter.match({
  "location": "OneWayTripSteps.i_can_select_date_and_traveller_details(DataTable)"
});
formatter.result({
  "duration": 20489668383,
  "status": "passed"
});
formatter.match({
  "location": "BookNowSteps.i_can_verify_text_and_select_filter()"
});
formatter.result({
  "duration": 1396255070,
  "status": "passed"
});
formatter.match({
  "location": "BookNowSteps.i_can_verify_price_details_in_flight_details_popUp_page()"
});
formatter.result({
  "duration": 11143831708,
  "status": "passed"
});
formatter.match({
  "location": "BookingSummarySteps.i_can_verify_text_and_select_filter(DataTable)"
});
formatter.result({
  "duration": 4390341940,
  "status": "passed"
});
formatter.match({
  "location": "BookingSummarySteps.i_can_enter_email_and_coupon_code_and_verify_show_more_details_popUp(DataTable)"
});
formatter.result({
  "duration": 5764415576,
  "status": "passed"
});
formatter.match({
  "location": "TravellerInformationSteps.i_go_navigative_traveller_information_page()"
});
formatter.result({
  "duration": 2069494586,
  "status": "passed"
});
formatter.match({
  "location": "TravellerInformationSteps.i_can_enter_Traveller_details(DataTable)"
});
formatter.result({
  "duration": 16309993791,
  "status": "passed"
});
formatter.match({
  "location": "TravellerInformationSteps.i_can_enter_contact_details_and_click_on_paysecurely_button()"
});
formatter.result({
  "duration": 53158216658,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2971449975,
  "status": "passed"
});
});