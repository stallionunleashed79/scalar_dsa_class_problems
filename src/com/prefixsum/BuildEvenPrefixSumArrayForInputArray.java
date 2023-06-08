package com.prefixsum;

import com.util.ArrayUtils;

import java.util.List;

public class BuildEvenPrefixSumArrayForInputArray {

    public static void main(String[] args) {
        System.out.println("EVEN PREFIX SUM ARRAY "+ ArrayUtils.buildEvenPrefixSumArray(List.of( 3, -3, 4, 6, -3, 5 )));
        System.out.println("EVEN PREFIX SUM ARRAY "+ ArrayUtils.buildEvenPrefixSumArray(List.of( 2, -1, 3, 1, 4, 3, 2, -1 )));
    }
}
