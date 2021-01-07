Feature: Delete User
  Test Delete operation

  Scenario: verify DELETE operation after POST
    Given I Perform DELETE operation for "id"
      | id |
      |  3 |
    And I Perform GET operation with path parameter for "/users/{id}/"
      | id |
      |  3 |
    Then I should not see the body with fname as "Selenium"
