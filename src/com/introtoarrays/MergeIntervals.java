package com.introtoarrays;

import com.util.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        final Interval interval1 = new Interval();
        interval1.setStart(0);
        interval1.setEnd(2);
        final Interval interval2 = new Interval();
        interval2.setStart(1);
        interval2.setEnd(4);
        final Interval interval3 = new Interval();
        interval3.setStart(3);
        interval3.setEnd(6);
        final Interval interval4 = new Interval();
        interval4.setStart(7);
        interval4.setEnd(10);
        final Interval interval5 = new Interval();
        interval5.setStart(11);
        interval5.setEnd(12);
        final List<Interval> input = Arrays.asList(interval1, interval2, interval3, interval4, interval5);
        final List<Interval> result = mergeSortedIntervals(input);
        System.out.print("NON MERGED INTERVALS ");
        System.out.println();
        result.forEach(System.out::println);
    }

    private static List<Interval> mergeSortedIntervals(final List<Interval> input) {
        final List<Interval> nonOverlappingIntervals = new ArrayList<>();
        Interval current = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            final Interval next = input.get(i);
            if (next.getStart().compareTo(current.getEnd()) > 0) {
                nonOverlappingIntervals.add(current);
                current = next;
            } else {
                current.setStart(Math.min(current.getStart(), next.getStart()));
                current.setEnd(Math.max(current.getEnd(), next.getEnd()));
            }
        }
        nonOverlappingIntervals.add(current);
        return nonOverlappingIntervals;
    }
}
