package com.stacksandqueues;

/**
 * IMPLEMENT A STACK USING AN ARRAY
 */
public class ImplementAStackUsingAnArray {
    private static int top = -1;
    private static int[] input = new int[100];

    public static void main(String[] args) {
        push(1);
        push(4);
        push(-1);
        System.out.println("CURRENT ELEMENT "+ pop());
        System.out.println("CURRENT ELEMENT "+ pop());
        push(6);
        System.out.println("CURRENT ELEMENT "+ pop());
    }

    private static int pop() {
        int temp = input[top];
        top--;
        return temp;
    }
    private static void push(int element) {
        if (top < input.length - 1) {
            top++;
            input[top] = element;
        }
    }
}
