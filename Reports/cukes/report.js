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
