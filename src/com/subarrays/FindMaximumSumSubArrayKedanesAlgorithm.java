package com.subarrays;

import java.util.Arrays;
import java.util.List;

public class FindMaximumSumSubArrayKedanesAlgorithm {

    public static void main(String[] args) {
        System.out.println("MAX SUBARRAY SUM " + maximumSumSubArray(Arrays.asList(5, 6, 7, -3, 2, -10, -12, 8, 12, -4, 7, -2)));
    }

    private static int maximumSumSubArray(final List<Integer> input) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (Integer element: input) {
            sum = sum + element;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
