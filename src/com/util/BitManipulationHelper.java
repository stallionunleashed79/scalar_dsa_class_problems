package com.util;

public class BitManipulationHelper {

    // TC = O(1) and SC = O(1) since we are just using right shift operator and & operator for solution
    public static boolean checkIfBitIsSetInPosition(int a, int i) {
        return ((a >> i) & 1) == 1;
    }
}
