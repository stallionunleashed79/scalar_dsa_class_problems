package com.subarrays;

import java.util.List;

// GIVEN AN ARRAY OF SIZE N, FIND MAXIMUM OF ALL SUBARRAY SUMS
public class FindMaximumOfAllSubarraySums {

    public static void main(String[] args) {
        System.out.println("MAX OF ALL SUBARRAY SUMS USING CARRY FORWARD TECHNIQUE "+ findMaximumOfAllSubarraySumsOptimizedUsingCarryForward(
                List.of( 7, 3, 2, -1, 6, 8, 2, 3 )));
    }

    private static int findMaximumOfAllSubarraySumsOptimizedUsingCarryForward(final List<Integer> input) {
        int N = input.size();
        int maxSubArraySum = Integer.MIN_VALUE;
        for (int i =0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + input.get(j);
                maxSubArraySum = Math.max(maxSubArraySum, sum);
            }
        }
        return maxSubArraySum;
    }
}
