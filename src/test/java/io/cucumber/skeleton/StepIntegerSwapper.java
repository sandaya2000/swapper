package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepIntegerSwapper {
    IntegerSwapper integerSwapper = new IntegerSwapper();

    // The integers to swap
    int x;
    int y;

    @Given("I have two integers")
    public void i_have_two_integers() {
        System.out.println("*** Swap two integers ***");
        this.x = 100;
        this.y = 200;
        System.out.println("Initial X value: " + this.x);
        System.out.println("Initial Y value: " + this.y);
    }

    @When("I swap them without using a temporary variable")
    public void i_swap_them_without_using_a_temporary_variable() {
        integerSwapper.swap(x, y);
      }

    @Then("The first contains the value in the second and the second has the first")
    public void the_first_contains_the_value_in_the_second_and_the_second_has_the_first() {
        System.out.println("End X value: " + integerSwapper.getX());
        System.out.println("End Y value: " + integerSwapper.getY());
        assert integerSwapper.getX() == y: "Failed swap";
        assert integerSwapper.getY() == x: "Failed swap";

    }
}
