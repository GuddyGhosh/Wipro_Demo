Feature: Shopping and checkout

Scenario: Purchase multiple items
  When I add a phone product to the cart
  And I add a laptop product to the cart
  And I add a monitor product to the cart
  Then All selected products should be in the cart
  When I proceed to Place Order
  And I provide details "Himanshu Grover" "India" "Noida" "1234567890123456" "12" "2028"
  And I complete purchase
  Then I should see success message "Thank you for your purchase!"
  
  
  Scenario: Login with invalid credentials
    Given I am on the Demoblaze home page
    When Log in modal is open
    And I login with username "invaliduser" and password "wrongpass"
    Then I should see a welcome alert with message "Wrong password."
  
  Scenario: Login with no username credentials
    Given I am on the Demoblaze home page
    When Log in modal is open
    And I login with username "" and password "pass"
    Then I should see a alert with message "Please fill out Username and Password."
    
    Scenario: Login with no password credentials
    Given I am on the Demoblaze home page
    When Log in modal is open
    And I login with username "hg12" and password ""
    Then I should see a login alert with message "Please fill out Username and Password."
