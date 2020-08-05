Feature: Check login page feature for OrangeHRM 
  
    Background: 
    Given I launch Chrome browser
    When I open OrangeHRM home page
    
    
    Scenario: Logo presence on OrangeHRM home page
    Then I verify that the logo is present on the page
    And Close browser
    
    Scenario: Login to OrangeHRM with valid credentials
    And Enter username and password
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser
    
    Scenario: Login to OrangeHRM with valid credentials
    And Enter username "Admin" and password "admin123"
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser
    
    Scenario Outline: Login to OrangeHRM with valid credentials
    And Enter username "<username>" and password "<password>"
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser
    
    Examples:
    | username | password | 
    | Admin | admin123 | 
    | Admin | admin123 | 
    
