package string;

public class StringPalindromeProgram {
    static boolean checkPalindrome(String input) {
        boolean result = true;
        int length = input.length();
        for(int i = 0; i < length /2; i++) {
            if(input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        
        return result;        
    }

    public static void main(String[] args) {

        System.out.println(checkPalindrome("madam"));
        System.out.println(checkPalindrome("abcba"));
        System.out.println(checkPalindrome("abba"));
    }
}
