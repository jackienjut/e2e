$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Refund item",
  "description": "",
  "id": "refund-item",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Jeff returns a faulty microwave",
  "description": "",
  "id": "refund-item;jeff-returns-a-faulty-microwave",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "he has a receipt",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});