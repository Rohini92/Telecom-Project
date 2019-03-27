
@addcust
Feature: Add the customer 

 
  @FunctionalTesting
  Scenario: add the customer
    Given The user is in add customer page
    When The user fill in the customer details
      | fname   | lname    | emailAdd           | Address  | mobile       |
      | Rohini | ravi | test@gmail.com  | chennai |   3723462348 |
      | nimy | karthi | test1@gmail.com | chennai |  2723462323 |
      | lavanya | dinesh  | test2@gmail.com | chennai | 1272346233 |
    And The user clicks the sumbit button
    Then The user should see the success message "Please Note Down Your CustomerID"
    And The user should see the customer ID
    
    