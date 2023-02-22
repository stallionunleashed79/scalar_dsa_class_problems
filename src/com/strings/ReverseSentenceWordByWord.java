package com.strings;

import com.util.StringUtils;

//GIVEN A CHARACTER ARRAY STORING A SENTENCE REVERSE IT WORD BY WORD
// CONSTRAINTS:
// 1) NO EXTRA SPACE CAN BE USED
// 2) EVERY WORD SEPARATED BY SINGLE SPACE
// 3) NO INBUILT METHOD CAN BE USED
// EG: INPUT: "here is a boy"
// OUTPUT: "boy a is here"
public class ReverseSentenceWordByWord {

    public static void main(String[] args) {
        System.out.println("REVERSE SENTENCE WORD BY WORD "+reverseSentenceWordByWord("here is a boy"));
    }

    // 2 STEP APPROACH:
    //2-A) REVERSE THE ENTIRE STRING
    //2-B) REVERSE EACH WORD OF SENTENCE THAT ARE SEPARATED BY SPACE
    private static String reverseSentenceWordByWord(String input) {
        input = StringUtils.reversePartOfString(input, 0, input.length() - 1);
        int left = 0, right = 0;
        while (left < input.length() && right < input.length()) {
            if (input.charAt(right) == ' ') {
                input = StringUtils.reversePartOfString(input, left, right-1);
            }
            left = right + 1;
            right++;
        }
        return input;
    }
}
