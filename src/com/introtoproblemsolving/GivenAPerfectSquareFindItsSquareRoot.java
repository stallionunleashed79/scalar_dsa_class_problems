package com.introtoproblemsolving;

public class GivenAPerfectSquareFindItsSquareRoot {

    public static void main(String[] args) {
        System.out.println("SQAURE ROOT OF PERFECT SQUARE IS "+ findSquareRootOptimized(100));
        System.out.println("SQAURE ROOT OF PERFECT SQUARE IS "+ findSquareRootOptimized(81));
        System.out.println("SQAURE ROOT OF PERFECT SQUARE IS "+ findSquareRootBruteForce(100));
        System.out.println("SQAURE ROOT OF PERFECT SQUARE IS "+ findSquareRootBruteForce(81));
    }

    /**
     * FIND SQUARE ROOT WITH BRUTE FORCE TECHNIQUE, TC = O(N) AND SC = O(1)
     * @param N
     * @return
     */
    private static int findSquareRootBruteForce(final Integer N) {
        for (int i = 1; i <=N; i++) {
            if (i*i == N) {
                return i;
            }
        }
        return -1;
    }

    /**
     * FIND SQUARE ROOT WITH BINARY SEARCH TECHNIQUE, TC = O(LOG(N)) AND SC = O(1)
     * @param N
     * @return
     */
    private static int findSquareRootOptimized(final Integer N) {
        int left = 1;
        int right = N;

        while (left <= right) {
            int mid = (left + right) / 2;
            int square = mid * mid;
            if (square > N) {
                right = mid - 1;
            } else if (square < N) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
