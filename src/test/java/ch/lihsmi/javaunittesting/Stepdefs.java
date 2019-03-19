package ch.lihsmi.javaunittesting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class Stepdefs {

    private Stack<String> stack;

    @Given("I create a new stack")
    public void i_have_an_empty_stack() {
        stack = new Stack<>();
    }

    @When("I insert an element {string} into the stack")
    public void i_insert_an_element_into_the_stack(String string) {
        stack.push(string);
    }

    @Then("the stack is not empty")
    public void the_stack_is_not_empty() {
        assertFalse(stack.empty());
    }

    @Then("the stack is empty")
    public void the_stack_if_empty() {
        assertTrue(stack.empty());
    }

}
