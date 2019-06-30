package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDoubleSwapper {
    ObjectSwapper objectSwapper = new ObjectSwapper();

    // Doubles to swap
    double x;
    double y;

    @Given("I have two objects")
    public void i_have_two_objects() {
        System.out.println("*** Swap two doubles ***");
        this.x = 100.234;
        this.y = 200.456;
        System.out.println("Initial X value: " + this.x);
        System.out.println("Initial Y value: " + this.y);
    }

    @When("I swap the two objects without using a temporary variable")
    public void i_swap_the_two_objects_without_using_a_temporary_variable() {
        objectSwapper.swap(x, y);
    }

    @Then("The first object contains the value in the second object and the second has the first")
    public void the_first_object_contains_the_value_in_the_second_object_and_the_second_has_the_first() {
        System.out.println("End X value: " + objectSwapper.getX());
        System.out.println("End Y value: " + objectSwapper.getY());
        assert (double)objectSwapper.getX() == y: "Failed swap";
        assert (double)objectSwapper.getY() == x: "Failed swap";

    }

}
