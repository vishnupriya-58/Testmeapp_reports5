$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature456/mytest999.feature");
formatter.feature({
  "name": "verifying reports",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "My demo report validation in jenkins today",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "TestMe is up and running",
  "keyword": "Given "
});
formatter.match({
  "location": "Mytest999_steps.testme_is_up_and_running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "Mytest999_steps.user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies for the login status for his credentials",
  "keyword": "And "
});
formatter.match({
  "location": "Mytest999_steps.verifies_for_the_login_status_for_his_credentials()"
});
formatter.result({
  "status": "passed"
});
});