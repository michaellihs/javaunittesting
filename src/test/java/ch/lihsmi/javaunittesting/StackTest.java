package ch.lihsmi.javaunittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void elementCanBeInsertedInStack() {
        String element = "stack-element";
        Stack<String> stack = new Stack<>();
        stack.push(element);
    }

}