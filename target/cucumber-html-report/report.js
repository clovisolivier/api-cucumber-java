$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("API.feature");
formatter.feature({
  "line": 1,
  "name": "Test facebook smoke scenario",
  "description": "",
  "id": "test-facebook-smoke-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test login with unvalid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-unvalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "account_id number 221",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "date_from is 2016-07-01T00:00:00",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "date_to is 2017-07-01T00:00:00",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "call the stats service",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the server should handle it and return a 200 status",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "221",
      "offset": 18
    }
  ],
  "location": "StatsSteps.accountIdNumber(String)"
});
formatter.result({
  "duration": 723010155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2016-07-01T00:00:00",
      "offset": 13
    }
  ],
  "location": "StatsSteps.dateFromIs(String)"
});
formatter.result({
  "duration": 69505,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2017-07-01T00:00:00",
      "offset": 11
    }
  ],
  "location": "StatsSteps.dateToIs(String)"
});
formatter.result({
  "duration": 111791,
  "status": "passed"
});
formatter.match({
  "location": "StatsSteps.callTheStatsService()"
});
formatter.result({
  "duration": 199207614,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 41
    }
  ],
  "location": "StatsSteps.the_server_should_handle_it_and_return_a_status(int)"
});
formatter.result({
  "duration": 7657681,
  "status": "passed"
});
});