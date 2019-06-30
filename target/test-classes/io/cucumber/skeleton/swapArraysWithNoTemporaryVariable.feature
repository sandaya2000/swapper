Feature: swapArraysWithNoTemporaryVariable

  Scenario: swap two arrays with no temporary variable
    Given I have two arrays
    When I swap the two arrays without using a temporary variable
    Then The first array contains the value in the second array and the second has the first
