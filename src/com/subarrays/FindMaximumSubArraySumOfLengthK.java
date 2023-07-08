package com.subarrays;

import com.util.ArrayUtils;

import java.util.List;

public class FindMaximumSubArraySumOfLengthK {

    public static void main(String[] args) {
        System.out.println("MAX SUB-ARRAY SUM OF LENGTH K BRUTE FORCE " + getMaxSubArraySumOfSizeKForArrayBruteForce(List.of( -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 ), 5));
        System.out.println();
        System.out.println("MAX SUB-ARRAY SUM OF LENGTH K OPTIMIZED " + getMaxSubArraySumOfSizeKForArrayOptimizedWithPrefixSumArray(List.of( -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 ), 5));
    }

    // TC = O(N^2) DUE TO 2 NESTED FOR LOOPS AND SC = O(1) DUE TO NO EXTRA SPACE USED
    private static int getMaxSubArraySumOfSizeKForArrayBruteForce(final List<Integer> input, final Integer K) {
        int N = input.size();
        int maxSum = Integer.MIN_VALUE;
        for (int i =0; i <= N - K; i++) {
            int j = i + K-1;
            int sum = 0;
            for (int e = i; e <= j; e++) {
                sum = sum + input.get(e);
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    // TC = O(N) AND SC = O(N) DUE TO EXTRA PREFIX SUM ARRAY USED
    private static int getMaxSubArraySumOfSizeKForArrayOptimizedWithPrefixSumArray(final List<Integer> input, final Integer K) {
        final List<Integer> prefixSumArray = ArrayUtils.buildPrefixSumArray(input);
        int N = input.size();
        int maxSum = Integer.MIN_VALUE;
        for (int i =0; i <= N - K; i++) {
            int j = i + K-1;
            maxSum = Math.max(maxSum, i == 0 ? prefixSumArray.get(j) : prefixSumArray.get(j) - prefixSumArray.get(i-1));
        }
        return maxSum;
    }
}
