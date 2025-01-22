package com.introtoarrays;

/**
 * On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 1-indexed.).
 * NOTE: I PULLED THE SOLUTION FROM THE YOUTUBE LINK USING RECURSION AND IS A GREAT SOLUTION: https://www.youtube.com/watch?v=QRa9ZVGMWlY
 */
public class KthSymbol {

    // NOTE: I PULLED THE SOLUTION FROM THE FOLLOWING YOUTUBE LINK: https://www.youtube.com/watch?v=QRa9ZVGMWlY
    public static void main(String[] args) {
        System.out.println("FIND THE SYMBOL AT THE NTH ROW AND KTH INDEX FOR THE ABOVE PROBLEM "+ kthGrammar(2, 1));
        System.out.println("FIND THE SYMBOL AT THE NTH ROW AND KTH INDEX FOR THE ABOVE PROBLEM "+ kthGrammar(2, 2));
    }
    private static int kthGrammar(int N, int K) {
        if (N == 1) {
            return 0;
        }
        int parent = kthGrammar(N-1, K / 2 + K % 2);
        boolean kIsOdd = K % 2 == 1;
        if (parent == 0) {
            return kIsOdd ? 0 : 1;
        }
        if (parent == 1) {
            return kIsOdd ? 1 : 0;
        }
        return 0;
    }

}
