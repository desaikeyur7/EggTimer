$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/EggTimer/CountdownTimer.feature");
formatter.feature({
  "line": 1,
  "name": "Count down functionality",
  "description": "As a user\r\nI want to be able to select a time in the start a timer option\r\nSo that I am able to verify that the count down functionality works",
  "id": "count-down-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Verify countdown functionality works when time is entered",
  "description": "",
  "id": "count-down-functionality;verify-countdown-functionality-works-when-time-is-entered",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I navigate to url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"\u003ctime\u003e\" in start a timer field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click Go",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the countdown happen every second",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "The remaining time decreases in one-second increments",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "count-down-functionality;verify-countdown-functionality-works-when-time-is-entered;",
  "rows": [
    {
      "cells": [
        "time"
      ],
      "line": 14,
      "id": "count-down-functionality;verify-countdown-functionality-works-when-time-is-entered;;1"
    },
    {
      "cells": [
        "25"
      ],
      "line": 15,
      "id": "count-down-functionality;verify-countdown-functionality-works-when-time-is-entered;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7601822800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify countdown functionality works when time is entered",
  "description": "",
  "id": "count-down-functionality;verify-countdown-functionality-works-when-time-is-entered;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I navigate to url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"25\" in start a timer field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click Go",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the countdown happen every second",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "The remaining time decreases in one-second increments",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefs.i_navigate_to_url()"
});
formatter.result({
  "duration": 482540200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 9
    }
  ],
  "location": "MyStepDefs.i_enter_in_start_a_timer_field(String)"
});
formatter.result({
  "duration": 169695600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_click_Go()"
});
formatter.result({
  "duration": 3380668100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_should_see_the_countdown_happen_every_second()"
});
formatter.result({
  "duration": 25464064800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.the_remaining_time_decreases_in_one_second_increments()"
});
formatter.result({
  "duration": 64200,
  "status": "passed"
});
formatter.after({
  "duration": 214631900,
  "status": "passed"
});
});