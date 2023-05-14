package com.introtoarrays;

import com.util.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

// GIVEN AN ARRAY OF N ELEMENTS, ROTATE IT K NUMBER OF TIMES
public class RotateAGivenArrayKTimes {

    public static void main(String[] args) {
        rotateAndPrint(new ArrayList<>(List.of( 3, -2, 1, 4, 6, 9, 8)), 3);
        rotateAndPrint(new ArrayList<>(List.of( 3, -2, 1, 4, 6, 9, 8)), 8);
        rotateAndPrint(new ArrayList<>(List.of( 4, 1, 6, 9, 2, 14, 7, 8, 3)), 4);
    }

    private static void rotateAndPrint(final List<Integer> input, int K) {
        K = K % input.size();
        rotateArrayKTimes(input, K);
        System.out.println("ROTATED ARRAY "+ input);
    }

    private static void rotateArrayKTimes(final List<Integer> input, final int K) {
        ArrayUtils.reversePartOfArray(input, 0, input.size() - K - 1);
        ArrayUtils.reversePartOfArray(input, input.size() - K, input.size() - 1);
        ArrayUtils.reversePartOfArray(input, 0, input.size() - 1);
    }


}
