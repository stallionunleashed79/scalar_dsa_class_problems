package com.recursion;

/**
 * Implement power function using recursion
 */
public class PowerFunction {

    public static void main(String[] args) {
        System.out.println("POWER FUNCTION "+ power(2, 3));
        System.out.println("POWER FUNCTION "+ power(3, 4));
    }
    private static int power(int a, int N) {
        if (N == 0) {
            return 1;
        }
        return a * power(a, N-1);
    }
}
