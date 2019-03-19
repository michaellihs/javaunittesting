package ch.lihsmi.javaunittesting;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {

    private static final int INITIAL_SIZE = 16;

    private T[] elements;

    private int size = 0;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (T[]) new Object[INITIAL_SIZE];
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T element = elements[--size];
        elements[size] = null;
        return element;
    }

    public void push(T element) {
        if (stackIsFull()) {
            enlargeStack();
        }
        elements[size++] = element;
    }

    public boolean empty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void enlargeStack() {
        elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    private boolean stackIsFull() {
        return (elements.length == size);
    }
}
