package com.introtoarrays;

import com.util.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

// GIVEN AN ARRAY OF N ELEMENTS, ROTATE IT K NUMBER OF TIMES
public class RotateAGivenArrayKTimes {

    public static void main(String[] args) {
        final List<Integer> input = new ArrayList<>(List.of( 3, -2, 1, 4, 6, 9, 8));
        rotateArrayKTimes(input, 3);
        System.out.println("ROTATED ARRAY "+input);
    }

    private static void rotateArrayKTimes(final List<Integer> input, final int K) {
        ArrayUtils.reversePartOfArray(input, 0, input.size() - K - 1);
        ArrayUtils.reversePartOfArray(input, input.size() - K, input.size() - 1);
        ArrayUtils.reversePartOfArray(input, 0, input.size() - 1);
    }


}
