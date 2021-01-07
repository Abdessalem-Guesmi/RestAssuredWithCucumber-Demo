Feature: Verify  GET operation using Rest-Assured

Scenario: verify list of users

Given I perform Get operation for "/users"
Then I should see all users

Scenario: verify one fname of users

Given I perform Get operation for "/users"
And I perform Get for the user number "1"
Then I should see the first name as "Mohamadov"

Scenario: verify Query Parameters 

Given I perform Get operation for "/users"
Then I should see verify GET Query Parameter

Scenario: verify Path Parameters 

Given I perform Get operation for "/users"
Then I should see verify GET Path Parameter
