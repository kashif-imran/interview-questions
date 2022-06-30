package string;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {
    public static void main(String[] args) {
        String input1 = "kashif";
        String input2 = "fihsak";
        if(isAnagram(input1, input2)) {
            System.out.println(String.format("%s is a anagram of %s", input1, input2));
        } else {
            System.out.println(String.format("%s is not a anagram of %s", input1, input2));
        }
    }

    static boolean isAnagram(String str1, String str2) {


        if(str1.length() != str2.length()) return false;
        int NUMBER_OF_ASCII_CHARS = 256;
        int charCount[] = new int[NUMBER_OF_ASCII_CHARS]; // array of length 256(number of ASCII chars) with default value 0 at all indexes

        for(int i=0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++; //str1.charAt(i) returns ASCII value, increasing count at the index of ASCII value
            charCount[str2.charAt(i)]--; // decreasing count at the index of ASCII value
        }

        for(int i=0; i< NUMBER_OF_ASCII_CHARS; i++) {
            if(charCount[i] !=0) {
                return false;
            }
        }
        return true;
    }
}
