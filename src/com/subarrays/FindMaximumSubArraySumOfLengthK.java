package com.subarrays;

import com.util.ArrayUtils;

import java.util.List;

public class FindMaximumSubArraySumOfLengthK {

    public static void main(String[] args) {
        System.out.println("MAX SUB-ARRAY SUM OF LENGTH K " + getMaxSubArraySumOfSizeKForArray(List.of( 7, 3, 2, -1, 6, 8, 2, 3 ), 4));
        System.out.println();
        System.out.println("MAX SUB-ARRAY SUM OF LENGTH K " + getMaxSubArraySumOfSizeKForArray(List.of( 3, 4, 2, -1, 6, 7, 8, 9, 3, 2, -1, 4 ), 3));
        System.out.println();
        System.out.println("MAX SUB-ARRAY SUM OF LENGTH K " + getMaxSubArraySumOfSizeKForArray(List.of( -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 ), 5));
    }

    // TC = O(N) AND SC = O(N) DUE TO EXTRA PREFIX SUM ARRAY USED
    private static int getMaxSubArraySumOfSizeKForArray(final List<Integer> input, final Integer K) {
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
