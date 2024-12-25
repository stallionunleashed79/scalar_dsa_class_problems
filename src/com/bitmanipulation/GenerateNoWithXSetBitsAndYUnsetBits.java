package com.bitmanipulation;

/**
 * GIVEN X AND Y GENERATE A NUMBER WITH X SET BITS AND Y UNSET BITS
 */
public class GenerateNoWithXSetBitsAndYUnsetBits {

    public static void main (String[] args) {
        System.out.println("GENERATE NUMBER AFTER SETTING X BITS AND UNSETING Y BITS " + setXBitsAndUnsetYBits(3, 2));
        System.out.println("GENERATE NUMBER AFTER SETTING X BITS AND UNSETING Y BITS " + setXBitsAndUnsetYBits(2, 3));
        System.out.println("GENERATE NUMBER AFTER SETTING X BITS " + setXBits(2));
        System.out.println("GENERATE NUMBER AFTER SETTING X BITS " + setXBits(3));
    }

    private static int setXBitsAndUnsetYBits(int x, int y) {
        int ans = 0;
        for (int i = x; i < x + y; i++) {
            ans = ans + (1 << i);
        }
        return ans;
    }

    private static int setXBits(int x) {
        int ans = 0;
        for (int i = 0; i < x; i++) {
            ans = ans + (1 << i);
        }
        return ans;
    }
}
