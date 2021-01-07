Feature: POST User
  Test POST operation

  Scenario: verify POST operation 
    Given I ensure to Perform POST operatio for "/users" with body as
      | fname        | lname      | departmentId |
      | Rest-Assured | Automation |            2 |
   
    Then I should see the body with fname as "Rest-Assured"
