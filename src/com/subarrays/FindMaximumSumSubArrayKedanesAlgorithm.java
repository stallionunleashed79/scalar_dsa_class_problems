package com.subarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaximumSumSubArrayKedanesAlgorithm {

    public static void main(String[] args) {
        System.out.println("MAX SUBARRAY SUM " + maximumSumSubArray(Arrays.asList(5, 6, 7, -3, 2, -10, -12, 8, 12, -4, 7, -2)));
        System.out.println("MAX SUBARRAY SUM " + maximumSumSubArrayIndices(Arrays.asList(5, 6, 7, -3, 2, -10, -12, 8, 12, -4, 7, -2)));
    }

    /**
     * Return the value of the maximum subarray sum
     * @param input
     * @return
     */
    private static int maximumSumSubArray(final List<Integer> input) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (Integer element: input) {
            sum = sum + element;
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    /**
     * Return the actual subarray having the maximum sum, TC = O(N), SC = O(1)
     * @param input
     * @return
     */
//    private static List<Integer> maximumSumSubArrayIndices(final List<Integer> input) {
//        int sum = 0, maxSum = Integer.MIN_VALUE;
//        final List<Integer> result = new ArrayList<>();
//        int l =0, left = -1, right = -1;
//        for (int i = 0; i < input.size(); i++) {
//            sum = sum + input.get(i);
//            if (sum > maxSum) {
//                maxSum = sum;
//                left = l;
//                right = i;
//            }
//            if (sum < 0)
//                l = i + 1;
//        }
//        result.add(left);
//        result.add(right);
//        return result;
//    }

}
