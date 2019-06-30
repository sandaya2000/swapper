Feature: swapObjectsWithNoTemporaryVariable

  Scenario: swap two objects with no temporary variable
    Given I have two objects
    When I swap the two objects without using a temporary variable
    Then The first object contains the value in the second object and the second has the first
