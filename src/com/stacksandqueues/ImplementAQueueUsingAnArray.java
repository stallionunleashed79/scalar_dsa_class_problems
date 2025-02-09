package com.stacksandqueues;

public class ImplementAQueueUsingAnArray {
    private static int top = -1;
    private static int[] input = new int[100];

    public static void main(String[] args) throws Exception {
        enqueue(1);
        enqueue(4);
        enqueue(-1);
        System.out.println("CURRENT ELEMENT "+ dequeue());
        enqueue(6);
        System.out.println("CURRENT ELEMENT "+ dequeue());
        System.out.println("CURRENT ELEMENT "+ dequeue());
        System.out.println("CURRENT ELEMENT "+ dequeue());
    }

    private static void enqueue(int element) {
        if (top < input.length - 1) {
            top++;
            input[top] = element;
        }
    }

    private static int dequeue() throws Exception {
        if (top < 0) {
            throw new Exception("Cannot dequeue from an empty array");
        }
        int temp = input[0];
        for (int i = 0; i < top; i++) {
            input[i] = input[i+1];
        }
        top--;
        return temp;
    }
}
