Feature: Test facebook smoke scenario

  Scenario: Test login with unvalid credentials
    Given account_id number 221
    And date_from is 2016-07-01T00:00:00
    And date_to is 2017-07-01T00:00:00
    When call the stats service
    Then the server should handle it and return a 200 status
