Feature: To test add, edit and delete user

   Scenario: Adding a user
   Given On some page
   When Add some user
   Then User is added
   
   
   Scenario: Editing the user
   Given On some page
   When Search for the existing user
   And Edit some user
   Then User is edited
   
   Scenario: Deleting the user
   Given On some page
   When Search for the existing user
   And Delete some user
   Then User is deleted