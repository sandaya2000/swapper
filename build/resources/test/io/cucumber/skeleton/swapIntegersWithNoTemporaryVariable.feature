Feature: swapIntegersWithNoTemporaryVariable

  Scenario: swap two integers with no temporary variable
    Given I have two integers
    When I swap them without using a temporary variable
    Then The first contains the value in the second and the second has the first
