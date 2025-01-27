Feature: GETPosts
  Verify different GET operations

  Scenario: Verify GET Available
    Given I am testing API
    When I want see all records
    Then I should be able te see all available records

  Scenario: Verify GET Pending
    Given I am testing API
    When I want see all records
    Then I should be able te see all pending records

  Scenario: Verify GET Sold
    Given I am testing API
    When I want see all records
    Then I should be able te see all sold records

  Scenario: Verify GET by id
    Given I am testing API
    When I want see id records
    Then I should be able te see record id

  Scenario: Verify POST
    Given I am testing API
    When I want add a new pet
    Then I add a pet

  Scenario: Verify PUT
    Given I am testing API
    When I want update a pet
    Then I update a existing pet

  Scenario: Verify DELETE
    Given I am testing API
    When I want delete a pet
    Then I delete a pet