$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("arabic/GuestUser.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#src/test/resources/features/arabic/GuestUser.feature"
    }
  ],
  "line": 2,
  "name": "Arabic Guest User functionality",
  "description": "As a User to be able to use Flights functionality\r\nI want to be able to successfully login to Flights",
  "id": "arabic-guest-user-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Validate if the user for all roles can login successfully into Engine",
  "description": "",
  "id": "arabic-guest-user-functionality;validate-if-the-user-for-all-roles-can-login-successfully-into-engine",
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
  "name": "I go to Rehlat Home page arabic",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I go to select OneWay Arabic Radio button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can enter Arabic From and To city names",
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
  "name": "I can select Arabic date and traveller information",
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
  "name": "I can verify text and select the arabic filter",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I can verify popUp and number of flights in current page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I can verify add oncheck box in arabic",
  "rows": [
    {
      "cells": [
        "addOnBaggage",
        "\u003caddOnBaggage\u003e"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I can enter email and coupon code and verify the show more details popUp in Arabic",
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
  "name": "I can navigative to traveller Information arabic page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I can enter Traveller arabic details",
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
  "name": "I can enter contact details and Click PaySecurel button in arabic page",
  "keyword": "And "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "arabic-guest-user-functionality;validate-if-the-user-for-all-roles-can-login-successfully-into-engine;",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord",
        "fromCity",
        "toCity",
        "adults",
        "childs",
        "infant",
        "addOnBaggage",
        "CouponCodeStatus",
        "EnterCoupon"
      ],
      "line": 35,
      "id": "arabic-guest-user-functionality;validate-if-the-user-for-all-roles-can-login-successfully-into-engine;;1"
    },
    {
      "cells": [
        "******",
        "******",
        "JED",
        "CAI",
        "3",
        "2",
        "2",
        "NO",
        "NO",
        ""
      ],
      "line": 36,
      "id": "arabic-guest-user-functionality;validate-if-the-user-for-all-roles-can-login-successfully-into-engine;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14098288046,
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
  "name": "I am on login page of Flights Arabic",
  "keyword": "Given "
});
formatter.match({
  "location": "FlightLoginStepsArabic.i_am_on_login_page_of_Flight()"
});
formatter.result({
  "duration": 194442496,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Validate if the user for all roles can login successfully into Engine",
  "description": "",
  "id": "arabic-guest-user-functionality;validate-if-the-user-for-all-roles-can-login-successfully-into-engine;;2",
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
  "name": "I go to Rehlat Home page arabic",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I go to select OneWay Arabic Radio button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can enter Arabic From and To city names",
  "matchedColumns": [
    2,
    3
  ],
  "rows": [
    {
      "cells": [
        "fromCity",
        "JED"
      ],
      "line": 14
    },
    {
      "cells": [
        "toCity",
        "CAI"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I can select Arabic date and traveller information",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "rows": [
    {
      "cells": [
        "adults",
        "3"
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
        "2"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I can verify text and select the arabic filter",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I can verify popUp and number of flights in current page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I can verify add oncheck box in arabic",
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
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I can enter email and coupon code and verify the show more details popUp in Arabic",
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
  "name": "I can navigative to traveller Information arabic page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I can enter Traveller arabic details",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "rows": [
    {
      "cells": [
        "adults",
        "3"
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
        "2"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I can enter contact details and Click PaySecurel button in arabic page",
  "keyword": "And "
});
formatter.match({
  "location": "FlightLoginStepsArabic.i_go_to_Rehlat_Home_page_arabic()"
});
