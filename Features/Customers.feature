Feature: Customers

  Background: Below are the common steps to each sceanrio
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login/"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then User can view Dashboard
    When User click on customers menu
    And Click on customers menu item

	@Sanity @Regression
  Scenario: Add a new Customer
    And Click on Add new button
    Then User can View Add new customer page
    When User enter customer info
    And Click on Save button
    Then User can view Confirmation message "The new customer has been added successfully."
    And Close browser
	
	@Regression
  Scenario: Search Customer by EmailID
    And Enter customer Email
    When Click on search button
    Then User should found Email in the Search table
    And Close browser

	@Sanity @Regression
  Scenario: Search Customer by Name
    And Enter customer FirstName
    And Enter customer LastName
    When Click on search button
    Then User should found Name in the Search table
    And Close browser
