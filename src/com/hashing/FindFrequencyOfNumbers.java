package com.hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfNumbers {

    public static void main(String[] args) {
        System.out.println("QUERY FREQUENCY MAP "+buildQueryFrequencyMap(List.of(2, 6, 3, 8, 2, 8, 2, 3, 8), List.of(2, 8, 3, 5)));
    }

    private static Map<Integer, Integer> buildQueryFrequencyMap(final List<Integer> input, final List<Integer> queries) {
        final Map<Integer, Integer> inputFrequencyMap = new HashMap<>();
        final Map<Integer, Integer> queryFrequencyMap = new HashMap<>();
        for (Integer element: input) {
            inputFrequencyMap.put(element, !inputFrequencyMap.containsKey(element) ? 1 : inputFrequencyMap.get(element) + 1);
        }

        for (Integer element: queries) {
            queryFrequencyMap.put(element, inputFrequencyMap.getOrDefault(element, 0));
        }
        return queryFrequencyMap;
    }
}
