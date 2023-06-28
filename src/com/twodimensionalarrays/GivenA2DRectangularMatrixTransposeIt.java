package com.twodimensionalarrays;

import com.util.ArrayUtils;

import java.util.Arrays;

// GIVEN A 2D RECTANGULAR MATRIX OR LIST OF LISTS, PERFORM A TRANSPOSE OF THE MATRIX
// NOTE: A RECTANGULAR MATRIX WHERE NO OF ROWS DOES NOT EQUAL NO OF COLUMNS CANNOT BE TRANSPOSED IN-PLACED AND
// ONLY A SQUARE MATRIX CAN BE TRANSPOSED IN-PLACE

public class GivenA2DRectangularMatrixTransposeIt {

    public static void main(String[] args) {
        System.out.println("TRANSPOSED SQUARE MATRIX IS " + ArrayUtils.getTransposeOf2DRectangularMatrix(Arrays.asList(
                Arrays.asList( 1, 2, 3 ), Arrays.asList( 4, 5, 6 ))));
    }
}
