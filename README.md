# Cucumber-Swapper (without a temporary variable)
  
  It great that Intellij Idea suggests the methods to be implemented when you write the feature files.

## swapIntegersWithNoTemporaryVariable.feature
The code started out with a swapper for integers 

## swapObjectsWithNoTemporaryVariable.feature
To swap doubles, a more generalized swapper for objects was written

## swapArraysWithNoTemporaryVariable.feature
The generalized code was used to swap an array of integers with an arrays of strings


## Get the code

Git:

    git clone https://github.com/sandaya2000/swapper.git
    cd cucumber-java-skeleton

Subversion:

    svn checkout https://github.com/sandaya2000/swapper/trunk cucumber-java-skeleton
    cd cucumber-java-skeleton

Or simply [download a zip](https://github.com/sandaya2000/swapper/archive/master.zip) file.

## Use Maven

Open a command window and run:

    mvn test

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `RunCukesTest`
class tells JUnit to kick off Cucumber.

## Use Gradle

Open a command window and run:

    gradlew test --info

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `RunCukesTest`
class tells JUnit to kick off Cucumber.

## Overriding options

The Cucumber runtime parses command line options to know what features to run, where the glue code lives, what plugins to use etc.
When you use the JUnit runner, these options are generated from the `@CucumberOptions` annotation on your test.

Sometimes it can be useful to override these options without changing or recompiling the JUnit class. This can be done with the
`cucumber.options` system property. The general form is:

Using Maven:

    mvn -Dcucumber.options="..." test

Using Gradle:

    gradlew -Dcucumber.options="..." test

Let's look at some things you can do with `cucumber.options`. Try this:

    -Dcucumber.options="--help"

That should list all the available options.

*IMPORTANT*

When you override options with `-Dcucumber.options`, you will completely override whatever options are hard-coded in
your `@CucumberOptions` or in the script calling `cucumber.api.cli.Main`. There is one exception to this rule, and that
is the `--plugin` option. This will not _override_, but _add_ a plugin. The reason for this is to make it easier
for 3rd party tools (such as [Cucumber Pro](https://cucumber.pro/)) to automatically configure additional plugins by appending arguments to a `cucumber.properties`
file.

### Run a subset of Features or Scenarios

Specify a particular scenario by *line* (and use the pretty plugin, which prints the scenario back)

    -Dcucumber.options="classpath:skeleton/belly.feature:4 --plugin pretty"

This works because Maven puts `./src/test/resources` on your `classpath`.
You can also specify files to run by filesystem path:

    -Dcucumber.options="src/test/resources/skeleton/belly.feature:4 --plugin pretty"

You can also specify what to run by *tag*:

    -Dcucumber.options="--tags @bar --plugin pretty"

### Running only the scenarios that failed in the previous run

    -Dcucumber.options="@target/rerun.txt"

This works as long as you have the `rerun` formatter enabled.

### Specify a different formatter:

For example a JUnit formatter:

    -Dcucumber.options="--plugin junit:target/cucumber-junit-report.xml"

### Test Run Console Log
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

