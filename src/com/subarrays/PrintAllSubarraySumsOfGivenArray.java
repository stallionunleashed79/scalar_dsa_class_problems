package com.subarrays;

import java.util.List;

// GIVEN AN ARRAY OF SIZE N, PRINT ALL SUBARRAY SUMS
public class PrintAllSubarraySumsOfGivenArray {

    public static void main(String[] args) {
        System.out.println("PRINT ALL SUB-ARRAYS OF ARRAY ");
        printAllSubarraySumsOfArrayBruteForce(List.of( -1, 3, 5, 6, 8 ));
    }

    // TC = O(N^3) and SC = O(1)
    private static void printAllSubarraySumsOfArrayBruteForce(final List<Integer> input) {
        int N = input.size();
        for (int i=0; i < N; i++) {
            for (int j =i; j < N; j++) {
                int sum = 0;
                for (int e = i; e <=j; e++) {
                    sum = sum + input.get(e);
                }
                System.out.println(sum);
            }
        }
    }
}
