package string;

public class CountOccuranceOfEachCharInString {
    public static void main(String[] args) {
        String input = "kashifimran";
        System.out.println(countOccurrencesOf(input, 'a'));
    }

    private static long countOccurrencesOf(final String str, final char character) {
        return str.chars().mapToObj(i -> (char) i).filter(ch -> ch == character).count();
    }
}
