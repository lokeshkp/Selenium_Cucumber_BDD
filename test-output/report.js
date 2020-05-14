$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps to each sceanrio",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_click_on_customers_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_customers_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can View Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_View_Add_new_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enter_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_view_Confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps to each sceanrio",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_click_on_customers_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_customers_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer by Name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Enter customer FirstName",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.enter_customer_FirstName()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on WINDOWS (c5fbfc7ac7a97ef436e57e411e908b9e)] -\u003e id: SearchFirstName] (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-HC64QLTM\u0027, ip: \u0027192.168.43.92\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.138 (8c6c7ba89cc9..., userDataDir: C:\\Users\\lokes\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52788}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c5fbfc7ac7a97ef436e57e411e908b9e\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat utilities.WaitHelper.WaitForElement(WaitHelper.java:19)\r\n\tat pageObjects.CustomerSearchPage.setFirstName(CustomerSearchPage.java:52)\r\n\tat stepDefinitions.Steps.enter_customer_FirstName(Steps.java:203)\r\n\tat ✽.Enter customer FirstName(file:///C:/Users/lokes/eclipse-workspace/Selenium_BDD_Cucumber/./Features/Customers.feature:30)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter customer LastName",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.enter_customer_LastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should found Name in the Search table",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_should_found_Name_in_the_Search_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});