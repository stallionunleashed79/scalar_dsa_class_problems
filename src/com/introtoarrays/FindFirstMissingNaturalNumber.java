package com.introtoarrays;

import java.util.Arrays;
import java.util.List;

public class FindFirstMissingNaturalNumber {

    public static void main(String[] args) {
        System.out.println("FIND FIRST MISSING NATURAL NUMBER "+ findFirstNaturalNumberOptimized(Arrays.asList(1, 6, 3, 2, 4)));
        System.out.println("FIND FIRST MISSING NATURAL NUMBER "+ findFirstNaturalNumberOptimized(Arrays.asList(1, 0, -5, -6, 4, 2)));
    }

    private static int findFirstNaturalNumberOptimized(final List<Integer> input) {
        for (int i = 0; i < input.size(); i++) {
            Integer current = input.get(i);
            while (current!= i+1 && current.compareTo(0) > 0 && current.compareTo(input.size() - 1) <= 0) {
                Integer next = input.get(current - 1);
                input.set(i, next);
                input.set(current-1, current);
                current = input.get(i);
            }
        }
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) != i+1) {
                return i+1;
            }
        }
        return -1;
    }
}
