package com.strings;

// GIVEN A STRING AND 2 INDICES, REVERSE THE SUBSTRING BETWEEN THE 2 INDICES
public class ReverseSubstringBetweenIndices {

    public static void main(String[] args) {
        System.out.println("THE STRING AFTER REVERSING SUBSTRING FROM INDICES I AND J IS "+reversePartOfString(
                "abdeagf", 2, 5));
    }

    // TC = O(N) since worst case we might need to reverse entire string and SC = O(N) for the extra stringbuilder
    private static String reversePartOfString(final String input, final int startIndex, final int endIndex) {
        StringBuilder stringBuilder = new StringBuilder(input);
        for (int i = startIndex, j = endIndex; i <= j; i++, j--) {
            char temp = stringBuilder.charAt(i);
            stringBuilder.setCharAt(i, stringBuilder.charAt(j));
            stringBuilder.setCharAt(j, temp);
        }
        return stringBuilder.toString();
    }
}
