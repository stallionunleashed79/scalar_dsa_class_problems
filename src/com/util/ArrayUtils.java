package com.util;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {

    // TC = O(N) and SC = O(N) due to the new PFSum array
    public static List<Integer> buildPrefixSumArray(final List<Integer> input) {
        final List<Integer> prefixSumArray = new ArrayList<>();
        prefixSumArray.add(input.get(0));
        for (int i =1; i < input.size(); i++) {
            prefixSumArray.add(Integer.sum(input.get(i), prefixSumArray.get(i-1)));
        }
        return prefixSumArray;
    }

    // TC = O(N) and SC = O(N) due to the new even PFSum array
    public static List<Integer> buildEvenPrefixSumArray(final List<Integer> input) {
        final List<Integer> prefixSumArray = new ArrayList<>();
        prefixSumArray.add(input.get(0));
        for (int i =1; i < input.size(); i++) {
            prefixSumArray.add(Integer.sum(i % 2 == 0 ? input.get(i) : 0, prefixSumArray.get(i-1)));
        }
        return prefixSumArray;
    }

    // TC = O(N) and SC = O(N) due to the new even PFSum array
    public static List<Integer> buildOddPrefixSumArray(final List<Integer> input) {
        final List<Integer> prefixSumArray = new ArrayList<>();
        prefixSumArray.add(input.get(0));
        for (int i =1; i < input.size(); i++) {
            if (i % 2 == 1) {
                prefixSumArray.add(Integer.sum(input.get(i), prefixSumArray.get(i-1)));
            } else {
                prefixSumArray.add(prefixSumArray.get(i-1));
            }
        }
        return prefixSumArray;
    }

    public static void reversePartOfArray(final List<Integer> input, final int startIndex, final int endIndex) {
        for (int i =startIndex, j = endIndex; i <= j; i++, j--) {
            Integer temp = input.get(i);
            input.set(i, input.get(j));
            input.set(j, temp);
        }
    }
}
