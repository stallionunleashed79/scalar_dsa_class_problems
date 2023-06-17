package com.carryforward;

import java.util.List;

// GIVEN AN ARRAY OF N ELEMENTS, FIND THE LENGTH OF THE SMALLEST SUB-ARRAY CONTAINING THE MIN AND MAX OF THE ARRAY
// USING CARRY FORWARD TECHNIQUE
public class FindSmallestSubArrayHavingMinAndMaxOfArray {

    public static void main(String[] args) {
        System.out.println("MIN SUB ARRAY LENGTH CONTAINING MIN AND MAX ELEMENTS "+
                getSmallestSubarrayLengthHavingMinAndMaxOptimized(List.of( 1, 2, 3, 1, 3, 4, 6, 4, 6, 3 )));
        System.out.println("MIN SUB ARRAY LENGTH CONTAINING MIN AND MAX ELEMENTS "+
                getSmallestSubarrayLengthHavingMinAndMaxOptimized(List.of( 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 )));
    }

    // TC = O(N) DUE TO A SINGLE FOR LOOP AND SC = O(1) SINCE NO EXTRA SPACE NEEDED
    private static int getSmallestSubarrayLengthHavingMinAndMaxOptimized(final List<Integer> input) {
        int maxElementIndex = -1, minElementIndex = -1;
        int maxElement = Integer.MIN_VALUE, minElement = Integer.MAX_VALUE;
        // FIRST FIND MAX AND MIN ELEMENT OF ARRAY
        int N = input.size();
        int minSubArrayLength = N;
        for (int i = 0; i < N; i++) {
            final Integer currentElement = input.get(i);
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            } else if (currentElement.compareTo(minElement) < 0) {
                minElement = currentElement;
            }
        }
        // ALGORITHM TO KEEP UPDATING THE SUBARRAY LENGTH USING CARRY-FORWARD TECHNIQUE
        for (int i = N-1; i>=0; i--) {
            final Integer currentElement = input.get(i);
            if (currentElement.compareTo(maxElement) == 0) {
                maxElementIndex = i;
            } else if (currentElement.compareTo(minElement) == 0) {
                minElementIndex = i;
            }
            if (maxElementIndex != -1 && minElementIndex != -1) {
                minSubArrayLength = Math.min(minSubArrayLength, Math.abs(maxElementIndex - minElementIndex) + 1);
            }
        }
        return minSubArrayLength;
    }
}
