package com.twodimensionalarrays;

import java.util.Arrays;
import java.util.List;

// GIVEN A 2D SQUARE MATRIX OR LIST OF LISTS WITH NO OF ROWS EQUALS NO OF COLUMNS, PERFORM A TRANSPOSE OF THE MATRIX IN-PLACE
// NOTE: A RECTANGULAR MATRIX WHERE NO OF ROWS DOES NOT EQUAL NO OF COLUMNS CANNOT BE TRANSPOSED IN-PLACED ONLY A SQUARE MATRIX
// CAN BE TRANSPOSED IN-PLACE
public class GivenA2DSquareMatrixTransposeItInPlace {

    public static void main(String[] args) {
        System.out.println("TRANSPOSED SQUARE MATRIX IS " + getTransposeOfListOfLists(Arrays.asList(
                Arrays.asList(3, 8, 9, 2), Arrays.asList(1, 2, 3, 6), Arrays.asList(4, 10, 11, 17), Arrays.asList(7, 4, 5, 2))));
    }

    // TC = O(N^2) SINCE WE ARE TOUCHING HALF OF ALL THE N*N CELLS WHILE SWAPPING THE LOWER OR UPPER MATRIX WHICH IS O(N*N/2) ~ O(N^2)
    // SC = O(1) SINCE NO EXTRA SPACE USED
    private static List<List<Integer>> getTransposeOfListOfLists(final List<List<Integer>> input) {
        for (int i=0;i < input.size();i++) {
            for (int j = i+1; j < input.get(0).size(); j++) {
                Integer temp = input.get(i).get(j);
                input.get(i).set(j, input.get(j).get(i));
                input.get(j).set(i, temp);
            }
        }
        return input;
    }
}
