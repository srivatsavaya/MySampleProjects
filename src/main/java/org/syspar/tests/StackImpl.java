package org.syspar.tests;

public class StackImpl {

    private int capacity;
    private int[] array;
    private int top;

    public StackImpl(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    public void push(int element) {
        if (!isFull())
            array[++top] = element;
        else
            System.out.println("Stack is full");
    }

    public int pop() {
        if (!isEmpty())
            return array[top--];
        else
            System.out.println("Stack is empty");

        return -1; // usually better throw an error.
    }

    public int peek() {
        if (!isEmpty())
            return array[top];
        else
            System.out.println("Stack is empty");
        return -1; // usually better throw an error.
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackImpl si = new StackImpl(12);
        System.out.println(si.peek());
        System.out.println(si.pop());

        for (int i = 0; i < 10; i++) {
            si.push(i);
            System.out.println(si.peek());
        }
        
        System.out.println(si.pop());

    }
}