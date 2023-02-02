package com.util;

public class BitManipulationHelper {

    // TC = O(1) and SC = O(1) since we are just using right shift operator and & operator for solution
    public static boolean checkIfBitIsSetInPosition(int a, int i) {
        return ((a >> i) & 1) == 1;
    }

    public static int[] convertToBinary(int N, int noOfBits) {
        int[] binary = new int[noOfBits];
        int index = 0;
        while(N > 0){
            binary[index++] = N % 2;
            N = N/2;
        }
        return binary;
    }
}
