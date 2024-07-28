package com.hashing;

import java.util.*;

public class FindNoOfDistinctElementsInSubArrayLengthK {

    public static void main(String[] args) {
        System.out.println("NUMBER OF DISTINCT ELEMENTS OF ALL SUBARRAYS OF LENGTH K " + getLengthOfSubArraysOfLengthKBruteForce(
                Arrays.asList(2, 4, 3, 8, 3, 9, 4, 9, 4, 10), 4));
    }


    /**
     * TC = O((N-K+1) * K) - THE NUMBER OF SUB ARRAYS IS N-K+1 AND SIZE OF EACH SUBARRAY IS K AND SC = O(K)
     * @param input
     * @param K
     * @return
     */
    private static List<Integer> getLengthOfSubArraysOfLengthKBruteForce(final List<Integer> input, final Integer K) {
        final List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= input.size() - K; i++) {
            final Set<Integer> hashSet = new HashSet<>();
            for (int j = i; j < i+K; j++) {
                hashSet.add(input.get(j));
            }
            result.add(hashSet.size());
        }
        return result;
    }
}
