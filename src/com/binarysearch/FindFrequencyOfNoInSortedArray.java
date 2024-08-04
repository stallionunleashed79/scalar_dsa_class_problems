package com.binarysearch;

import java.util.Arrays;
import java.util.List;

public class FindFrequencyOfNoInSortedArray {

    public static void main(String[] args) {
        System.out.println("FIND FREQUENCY OF NUMBER IN SORTED ARRAY WITH DUPLICATES "+ frequencyOfNumberInArrayWithDuplicates(Arrays.asList(
                -5, -5, -3, 0, 0, 1, 1, 5, 5, 5, 5, 5, 5, 5, 8, 10, 10, 15, 15), 5));
    }
    /**
     * TC = O(N) as it is just one loop and SC = O(1)
     * @param input
     * @param K
     * @return
     */
    private static Integer frequencyOfNumberInArrayWithDuplicates(final List<Integer> input, final Integer K) {
        int count = 0;
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i).compareTo(K) == 0) {
                count++;
            }
        }
        return count;
    }
}
