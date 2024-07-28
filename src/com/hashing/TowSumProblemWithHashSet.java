package com.hashing;

import java.util.*;

// GIVEN AN ARRAY OF SIZE N, RETURN 2 VALUES FROM ARRAY SUCH THAT THE SUM
// OF ELEMENTS AT THOSE 2 INDICES EQUALS A GIVEN TARGET K ELSE RETURN EMPTY ARRAY
public class TowSumProblemWithHashSet {

    public static void main(String[] args) {
        System.out.println("FIRST PAIR OF ELEMENTS SUMMING TO K EQUALS "+ Arrays.toString(getFirstPairOfValuesSummingToKOptimized(
                List.of( 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 ), 11)));
        System.out.println("FIRST PAIR OF ELEMENTS SUMMING TO K EQUALS "+ Arrays.toString(getFirstPairOfValuesSummingToKOptimized(
                List.of( 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 ), 22)));
        System.out.println("NUMBER OF PAIRS OF ELEMENTS SUMMING TO K EQUALS "+ getNumberOfPairsWhoseSumIsEqualToTargetSum(
                List.of( 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 ), 22));
        System.out.println("NUMBER OF PAIRS OF ELEMENTS SUMMING TO K EQUALS "+ getNumberOfPairsWhoseSumIsEqualToTargetSum(
                List.of( 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 ), 11));
    }
    // TC = O(N) and SC = O(N) for the extra hashset
    private static Integer[] getFirstPairOfValuesSummingToKOptimized(final List<Integer> input, final Integer K) {
        final HashSet<Integer> hashSet = new HashSet<>();
        for(Integer element: input) {
            final Integer remaining = K - element;
            if (!hashSet.contains(remaining)) {
                hashSet.add(element);
            } else {
                return new Integer[]{element, remaining};
            }
        }
        return new Integer[]{};
    }

    private static Integer getNumberOfPairsWhoseSumIsEqualToTargetSum(final List<Integer> input, final Integer K) {
        int answer = 0;
        final HashSet<Integer> hashSet = new HashSet<>();
        for (Integer element: input) {
            int difference = K - element;
            if (!hashSet.contains(difference)) {
                hashSet.add(element);
            } else {
                answer++;
            }
        }
        return answer;
    }
}
