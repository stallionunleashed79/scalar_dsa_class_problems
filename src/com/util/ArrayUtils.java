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
            if (i % 2 == 0) {
                prefixSumArray.add(Integer.sum(input.get(i), prefixSumArray.get(i-1)));
            } else {
                prefixSumArray.add(prefixSumArray.get(i-1));
            }
        }
        return prefixSumArray;
    }

    // TC = O(N) and SC = O(N) due to the new even PFSum array
    public static List<Integer> buildOddPrefixSumArray(final List<Integer> input) {
        final List<Integer> prefixSumArray = new ArrayList<>();
        prefixSumArray.add(input.get(0));
        prefixSumArray.add(input.get(1));
        for (int i =2; i < input.size(); i++) {
            if (i % 2 == 1) {
                prefixSumArray.add(Integer.sum(input.get(i), prefixSumArray.get(i-1)));
            } else {
                prefixSumArray.add(prefixSumArray.get(i-1));
            }
        }
        return prefixSumArray;
    }

    public static Integer[] findMinAndMaxOfGivenArray(final List<Integer> input) {
        int maxElement = Integer.MIN_VALUE, minElement = Integer.MAX_VALUE;
        // FIRST FIND MAX AND MIN ELEMENT OF ARRAY
        int N = input.size();
        for (int i = 0; i < N; i++) {
            final Integer currentElement = input.get(i);
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            } else if (currentElement.compareTo(minElement) < 0) {
                minElement = currentElement;
            }
        }
        return new Integer[]{ minElement, maxElement };
    }

    public static void reversePartOfArray(final List<Integer> input, final int startIndex, final int endIndex) {
        for (int i =startIndex, j = endIndex; i <= j; i++, j--) {
            Integer temp = input.get(i);
            input.set(i, input.get(j));
            input.set(j, temp);
        }
    }

    public static List<List<Integer>> getTransposeOf2DSquareMatrix(final List<List<Integer>> input) {
        for (int i=0;i < input.size();i++) {
            for (int j = i+1; j < input.get(0).size(); j++) {
                Integer temp = input.get(i).get(j);
                input.get(i).set(j, input.get(j).get(i));
                input.get(j).set(i, temp);
            }
        }
        return input;
    }

    public static List<List<Integer>> getTransposeOf2DRectangularMatrix(final List<List<Integer>> input) {
        final List<List<Integer>> transposedMatrix = new ArrayList<>();
        for (int j=0;j < input.get(0).size();j++) {
            final List<Integer> row = new ArrayList<>();
            for (int i = 0; i < input.size(); i++) {
                row.add(input.get(i).get(j));
            }
            transposedMatrix.add(row);
        }
        return transposedMatrix;
    }
}
