Feature: Test facebook smoke scenario

  Scenario: Account_id is obligatory
    Given I want to set "London" in param "q"
      When I call the weather WS
      Then status code should be 401
      
        Scenario: Account_id is obligatory
    Given I want to set "London" in param "q"
      When I call the weather WS
      Then status code should be 400