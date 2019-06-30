package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class StepArraysSwapper {
    ObjectSwapper objectSwapper = new ObjectSwapper();

    // Lists to swap
    List<Integer> x = new ArrayList<>();
    List<String> y = new ArrayList<>();

    @Given("I have two arrays")
    public void i_have_two_arrays() {
        x.add(1);
        x.add(2);
        x.add(3);

        y.add("first");
        y.add("second");
        y.add("third");

        System.out.println("Initial X value: " + this.x);
        System.out.println("Initial Y value: " + this.y);

    }

    @When("I swap the two arrays without using a temporary variable")
    public void i_swap_the_two_arrays_without_using_a_temporary_variable() {
        objectSwapper.swap(x, y);
     }

    @Then("The first array contains the value in the second array and the second has the first")
    public void the_first_array_contains_the_value_in_the_second_array_and_the_second_has_the_first() {
        System.out.println("End X value: " + objectSwapper.getX());
        System.out.println("End Y value: " + objectSwapper.getY());
        assert objectSwapper.getX() == y: "Failed swap";
        assert objectSwapper.getY() == x: "Failed swap";
    }

}
