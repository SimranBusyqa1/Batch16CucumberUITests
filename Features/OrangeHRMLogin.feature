Feature: Check login page feature for OrangeHRM 
  
    
    Scenario: Logo presence on OrangeHRM home page
    Given I launch Chrome browser
    When I open OrangeHRM home page
    Then I verify that the logo is present on the page
    And Close browser
    
    Scenario: Login to OrangeHRM with valid credentials
    Given I launch Chrome browser
    When I open OrangeHRM home page
    And Enter username and password
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser
    
    Scenario: Login to OrangeHRM with valid credentials
    Given I launch Chrome browser
    When I open OrangeHRM home page
    And Enter username "Admin" and password "admin123"
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser
    
    Scenario Outline: Login to OrangeHRM with valid credentials
    Given I launch Chrome browser
    When I open OrangeHRM home page
    And Enter username "<username>" and password "<password>"
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser
    
    Examples:
    | username | password | 
    | admin12 | admin123 | 
    | Admin | admin123 | 
    
