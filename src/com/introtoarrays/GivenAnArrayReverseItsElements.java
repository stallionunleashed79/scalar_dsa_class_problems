package com.introtoarrays;

import java.util.ArrayList;
import java.util.List;

// GIVEN AN ARRAY OF SIZE N, REVERSE ITS ELEMENTS IN PLACE
public class GivenAnArrayReverseItsElements {

    public static void main(String[] args) {
        System.out.println("ARRAY SWAPPED "+ reverseArray(new ArrayList<>(List.of(-1, 4, 7, 6, -2, 7, 8, 10))));
    }
    // TC = O(N) and SC = O(1) since no extra space
    private static List<Integer> reverseArray(final List<Integer> input) {
        for (int i =0, j = input.size() - 1; i <= j; i++, j--) {
            Integer temp = input.get(i);
            input.set(i, input.get(j));
            input.set(j, temp);
        }
        return input;
    }
}
