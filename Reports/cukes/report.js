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
formatter.step({
  "line": 33,
  "name": "I can navigative to payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I can enter the card details",
  "rows": [
    {
      "cells": [
        "selectCard",
        "\u003cselectCard\u003e"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.examples({
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
        "CreditCard",
        "DXB",
        "MCT",
        "2",
        "2",
        "1",
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
  "duration": 628221,
  "status": "passed"
});
formatter.before({
  "duration": 15480124786,
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
  "duration": 101426821,
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
        "2"
      ],
      "line": 18
    },
    {
      "cells": [
        "infant",
        "1"
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
        "2"
      ],
      "line": 30
    },
    {
      "cells": [
        "infant",
        "1"
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
formatter.step({
  "line": 33,
  "name": "I can navigative to payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I can enter the card details",
  "matchedColumns": [
    1
  ],
  "rows": [
    {
      "cells": [
        "selectCard",
        "CreditCard"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FlightLoginSteps.i_go_to_Home_page()"
});
formatter.result({
  "duration": 107411151,
  "status": "passed"
});
formatter.match({
  "location": "OneWayTripSteps.i_go_to_select_oneway()"
});
formatter.result({
  "duration": 2235050759,
  "status": "passed"
});
formatter.match({
  "location": "OneWayTripSteps.i_can_enter_from_and_to_city_names(DataTable)"
});
formatter.result({
  "duration": 4547777655,
  "status": "passed"
});
formatter.match({
  "location": "OneWayTripSteps.i_can_select_date_and_traveller_details(DataTable)"
});
formatter.result({
  "duration": 18992381510,
  "status": "passed"
});
formatter.match({
  "location": "BookNowSteps.i_can_verify_text_and_select_filter()"
});
formatter.result({
  "duration": 1379530881,
  "status": "passed"
});
formatter.match({
  "location": "BookNowSteps.i_can_verify_price_details_in_flight_details_popUp_page()"
});
formatter.result({
  "duration": 14342690163,
  "status": "passed"
});
formatter.match({
  "location": "BookingSummarySteps.i_can_verify_text_and_select_filter(DataTable)"
});
formatter.result({
  "duration": 3750400687,
  "status": "passed"
});
formatter.match({
  "location": "BookingSummarySteps.i_can_enter_email_and_coupon_code_and_verify_show_more_details_popUp(DataTable)"
});
formatter.result({
  "duration": 5304623891,
  "status": "passed"
});
formatter.match({
  "location": "TravellerInformationSteps.i_go_navigative_traveller_information_page()"
});
formatter.result({
  "duration": 2082053791,
  "status": "passed"
});
formatter.match({
  "location": "TravellerInformationSteps.i_can_enter_Traveller_details(DataTable)"
});
formatter.result({
  "duration": 19569449974,
  "status": "passed"
});
formatter.match({
  "location": "TravellerInformationSteps.i_can_enter_contact_details_and_click_on_paysecurely_button()"
});
formatter.result({
  "duration": 45302989993,
  "status": "passed"
});
formatter.match({
  "location": "PaymentCardsSteps.i_can_navigative_to_payment_page()"
});
formatter.result({
  "duration": 53065051,
  "status": "passed"
});
formatter.match({
  "location": "PaymentCardsSteps.i_can_enter_the_card_details(DataTable)"
});
formatter.result({
  "duration": 33473882624,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: [[ChromeDriver: chrome on XP (c896c07fa5359e205a539c968de94021)] -\u003e xpath: //button[@class\u003d\u0027btn pay_button\u0027]/i] (tried for 30 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ROS-PC331\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Nagababu\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: c896c07fa5359e205a539c968de94021\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat cloud.rehlat.utils.PageUtils.clickElement(PageUtils.java:69)\r\n\tat cloud.rehlat.pages.PaymentCards.PaymentCardsPage.enterCreditCardDetails(PaymentCardsPage.java:139)\r\n\tat cloud.rehlat.pages.PaymentCards.PaymentCardsPage.selectCard(PaymentCardsPage.java:219)\r\n\tat cloud.rehlat.steps.PaymentCards.PaymentCardsSteps.i_can_enter_the_card_details(PaymentCardsSteps.java:36)\r\n\tat ✽.And I can enter the card details(src/test/resources/features/flight/english/GuestUser.feature:34)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 273594218,
  "status": "passed"
});
});