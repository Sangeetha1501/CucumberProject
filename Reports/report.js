$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login fucntionality module of automation practise web page",
  "description": "Contains E2E functionality such as login, add a product to card, place order,  and signout",
  "id": "login-fucntionality-module-of-automation-practise-web-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "duration": 581913,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User launch the browser and navigate to application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_browser_and_navigate_to_application()"
});
formatter.result({
  "duration": 175941715,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify the user login the application with valid credentials",
  "description": "",
  "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Sce1"
    },
    {
      "line": 8,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User click on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enter the valid credentials",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 12
    },
    {
      "cells": [
        "TestUser1",
        "Password1"
      ],
      "line": 13
    },
    {
      "cells": [
        "TestUser1",
        "Password2"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User validate the username displayed in the header",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_on_Signin_button()"
});
formatter.result({
  "duration": 95101,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_valid_credentials(DataTable)"
});
formatter.result({
  "duration": 4519590,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_signin_button()"
});
formatter.result({
  "duration": 578828,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_validate_the_username_displayed_in_the_header()"
});
formatter.result({
  "duration": 314603,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 279647,
  "status": "passed"
});
formatter.after({
  "duration": 320771,
  "status": "passed"
});
formatter.before({
  "duration": 315631,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User launch the browser and navigate to application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_browser_and_navigate_to_application()"
});
formatter.result({
  "duration": 343904,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify the user login the application with valid credentials",
  "description": "",
  "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Sce2"
    },
    {
      "line": 21,
      "name": "@dem"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User click on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User enter the valid username \"TestUser3\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User enter the valid password \"TestPassword1\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User click the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User validate the username displayed in the header",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_on_Signin_button()"
});
formatter.result({
  "duration": 293526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestUser3",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 1320613,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestPassword1",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 1976036,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_signin_button()"
});
formatter.result({
  "duration": 65799,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_validate_the_username_displayed_in_the_header()"
});
formatter.result({
  "duration": 98699,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 143422,
  "status": "passed"
});
formatter.after({
  "duration": 107438,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 31,
  "name": "Verify the user login the application with valid credentials",
  "description": "",
  "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@Sce3"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User click on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User enter the valid username \"\u003cUserName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User enter the valid password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User click the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User validate the username \"\u003cUserName\u003e\" displayed in the header",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 39,
  "name": "",
  "description": "",
  "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 40,
      "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials;;1"
    },
    {
      "cells": [
        "User1",
        "Pass1"
      ],
      "line": 41,
      "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials;;2"
    },
    {
      "cells": [
        "User2",
        "Pass2"
      ],
      "line": 42,
      "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials;;3"
    },
    {
      "cells": [
        "User3",
        "Pass3"
      ],
      "line": 43,
      "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 286844,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User launch the browser and navigate to application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_browser_and_navigate_to_application()"
});
formatter.result({
  "duration": 102298,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Verify the user login the application with valid credentials",
  "description": "",
  "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@Sce3"
    },
    {
      "line": 1,
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User click on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User enter the valid username \"User1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User enter the valid password \"Pass1\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User click the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User validate the username \"User1\" displayed in the header",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_on_Signin_button()"
});
formatter.result({
  "duration": 258571,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User1",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 140338,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass1",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 141366,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_signin_button()"
});
formatter.result({
  "duration": 78651,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User1",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_validate_the_username_displayed_in_the_header(String)"
});
formatter.result({
  "duration": 145478,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 94587,
  "status": "passed"
});
formatter.after({
  "duration": 82763,
  "status": "passed"
});
formatter.before({
  "duration": 93044,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User launch the browser and navigate to application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_browser_and_navigate_to_application()"
});
formatter.result({
  "duration": 263198,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Verify the user login the application with valid credentials",
  "description": "",
  "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@Sce3"
    },
    {
      "line": 1,
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User click on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User enter the valid username \"User2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User enter the valid password \"Pass2\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User click the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User validate the username \"User2\" displayed in the header",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_on_Signin_button()"
});
formatter.result({
  "duration": 81735,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User2",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 370121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass2",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 327455,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_signin_button()"
});
formatter.result({
  "duration": 255487,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User2",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_validate_the_username_displayed_in_the_header(String)"
});
formatter.result({
  "duration": 158329,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 150105,
  "status": "passed"
});
formatter.after({
  "duration": 67855,
  "status": "passed"
});
formatter.before({
  "duration": 111036,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User launch the browser and navigate to application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_browser_and_navigate_to_application()"
});
formatter.result({
  "duration": 104868,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Verify the user login the application with valid credentials",
  "description": "",
  "id": "login-fucntionality-module-of-automation-practise-web-page;verify-the-user-login-the-application-with-valid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@Sce3"
    },
    {
      "line": 1,
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User click on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User enter the valid username \"User3\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User enter the valid password \"Pass3\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User click the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User validate the username \"User3\" displayed in the header",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_on_Signin_button()"
});
formatter.result({
  "duration": 1249159,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User3",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 586539,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass3",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 314603,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_signin_button()"
});
formatter.result({
  "duration": 231840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User3",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_validate_the_username_displayed_in_the_header(String)"
});
formatter.result({
  "duration": 287358,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 248804,
  "status": "passed"
});
formatter.after({
  "duration": 283759,
  "status": "passed"
});
});