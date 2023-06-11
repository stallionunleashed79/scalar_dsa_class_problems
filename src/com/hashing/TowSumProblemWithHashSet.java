package com.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// GIVEN AN ARRAY OF SIZE N, RETURN 2 VALUES FROM ARRAY SUCH THAT THE SUM
// OF ELEMENTS AT THOSE 2 INDICES EQUALS A GIVEN TARGET K ELSE RETURN EMPTY ARRAY
public class TowSumProblemWithHashSet {

    public static void main(String[] args) {
        System.out.println("FIRST PAIR OF ELEMENTS SUMMING TO K EQUALS "+ Arrays.toString(getFirstPairOfValuesSummingToK(
                List.of( 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 ), 11)));
    }
    // TC = O(N) and SC = O(N) for the extra hashset
    private static Integer[] getFirstPairOfValuesSummingToK(final List<Integer> input, final Integer K) {
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
}
