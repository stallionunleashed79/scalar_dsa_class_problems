package com.carryforward;

import java.util.Arrays;

// GIVEN AN ARRAY OF SIZE N AND INDICES (I, J) SUCH THAT I < J COUNT NUMBER OF PAIRS SUCH THAT
// ARR[I] = 'a' AND ARR[J] = 'g'
public class CountPossiblePairsInGivenArray {

    public static void main(String[] args) {
        System.out.println("COUNT NUMBER OF 'AG' PAIRS IN ARRAY "+ countNumberOfPairsBruteForce(
                new char[]{ 'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g' }));
    }
    private static int countNumberOfPairsBruteForce(final char[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
                for (int j = i+1; j < input.length; j++) {
                    if (input[i] == 'a' && input[j] == 'g') {
                        count++;
                    }
                }
            }
        return count;
    }
}
