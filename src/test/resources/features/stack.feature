Feature: Stack API
  In order to assure the functionality of the stack class
  As a user
  I want to successfully run basic stack operations

  Scenario: element can be inserted into empty Stack
    Given I create a new stack
    When I insert an element "first-element" into the stack
    Then the stack is not empty

  Scenario: a new stack is empty
    Given I create a new stack
    Then the stack is empty
