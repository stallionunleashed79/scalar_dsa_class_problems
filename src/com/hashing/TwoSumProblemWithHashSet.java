package com.hashing;

import java.util.*;

// GIVEN AN ARRAY OF SIZE N, RETURN 2 VALUES FROM ARRAY SUCH THAT THE SUM
// OF ELEMENTS AT THOSE 2 INDICES EQUALS A GIVEN TARGET K ELSE RETURN EMPTY ARRAY
public class TwoSumProblemWithHashSet {

    public static void main(String[] args) {
        System.out.println("FIRST PAIR OF ELEMENTS SUMMING TO K EQUALS "+ Arrays.toString(getFirstPairOfValuesSummingToKOptimized(
                List.of( 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 ), 11)));
        System.out.println("FIRST PAIR OF ELEMENTS SUMMING TO K EQUALS "+ Arrays.toString(getFirstPairOfValuesSummingToKOptimized(
                List.of( 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 ), 22)));
        System.out.println("NUMBER OF PAIRS OF ELEMENTS SUMMING TO K EQUALS "+ getNumberOfPairsWhoseSumIsEqualToTargetSum(
                List.of( 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 ), 22));
        System.out.println("NUMBER OF PAIRS OF ELEMENTS SUMMING TO K EQUALS "+ getNumberOfPairsWhoseSumIsEqualToTargetSum(
                List.of( 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 ), 11));
        System.out.println("NUMBER OF PAIRS OF ELEMENTS SUMMING TO K EQUALS "+ getNumberOfPairsWhoseSumIsEqualToTargetSum(
                List.of( 8, 9, 2, 2, -2, 4, 5, 11, -6, 4 ), 7));
        System.out.println("NUMBER OF PAIRS OF ELEMENTS SUMMING TO K EQUALS "+ getNumberOfPairsWhoseSumIsEqualToTargetSum(
                List.of( 8, 9, 2, -2, 4, 5, -2, 5, 2 ), 7));
    }
    // TC = O(N) and SC = O(N) for the extra hashset
    private static Integer[] getFirstPairOfValuesSummingToKOptimized(final List<Integer> input, final Integer K) {
        final HashSet<Integer> hashSet = new HashSet<>();
        for(Integer element: input) {
            final Integer remaining = K - element;
            if (hashSet.contains(remaining)) {
                return new Integer[]{element, remaining};
            } else {
                hashSet.add(element);
            }
        }
        return new Integer[]{};
    }

    private static Integer getNumberOfPairsWhoseSumIsEqualToTargetSum(final List<Integer> input, final Integer K) {
        int answer = 0;
        final Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer element: input) {
            int difference = K - element;
            if (frequencyMap.containsKey(difference)) {
                answer = answer + frequencyMap.get(difference);
            }
            frequencyMap.compute(element, (k, v) -> v == null ? 1 : v+1);
        }
        return answer;
    }
}
