
### Test Run Console Log

```

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running io.cucumber.skeleton.RunCucumberTest
*** Swap two arrays ***
Initial X value: [1, 2, 3]
Initial Y value: [first, second, third]
End X value: [first, second, third]
End Y value: [1, 2, 3]
*** Swap two integers ***
Initial X value: 100
Initial Y value: 200
End X value: 200
End Y value: 100
*** Swap two doubles ***
Initial X value: 100.234
Initial Y value: 200.456
End X value: 200.456
End Y value: 100.234
Feature: swapArraysWithNoTemporaryVariable

  Scenario: swap two arrays with no temporary variable                                       # io/cucumber/skeleton/swapArraysWithNoTemporaryVariable.feature:3
    Given I have two arrays                                                                  # StepArraysSwapper.i_have_two_arrays()
    When I swap the two arrays without using a temporary variable                            # StepArraysSwapper.i_swap_the_two_arrays_without_using_a_temporary_variable()
    Then The first array contains the value in the second array and the second has the first # StepArraysSwapper.the_first_array_contains_the_value_in_the_second_array_and_the_second_has_the_first()

Feature: swapIntegersWithNoTemporaryVariable

  Scenario: swap two integers with no temporary variable                         # io/cucumber/skeleton/swapIntegersWithNoTemporaryVariable.feature:3
    Given I have two integers                                                    # StepIntegerSwapper.i_have_two_integers()
    When I swap them without using a temporary variable                          # StepIntegerSwapper.i_swap_them_without_using_a_temporary_variable()
    Then The first contains the value in the second and the second has the first # StepIntegerSwapper.the_first_contains_the_value_in_the_second_and_the_second_has_the_first()

Feature: swapObjectsWithNoTemporaryVariable

  Scenario: swap two objects with no temporary variable                                        # io/cucumber/skeleton/swapObjectsWithNoTemporaryVariable.feature:3
    Given I have two objects                                                                   # StepDoubleSwapper.i_have_two_objects()
    When I swap the two objects without using a temporary variable                             # StepDoubleSwapper.i_swap_the_two_objects_without_using_a_temporary_variable()
    Then The first object contains the value in the second object and the second has the first # StepDoubleSwapper.the_first_object_contains_the_value_in_the_second_object_and_the_second_has_the_first()

3 Scenarios (3 passed)
9 Steps (9 passed)
0m0.458s

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.136 sec

Results :

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 7.474 s
[INFO] Finished at: 2019-06-30T09:03:32-04:00
[INFO] Final Memory: 15M/162M
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0
```
