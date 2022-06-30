package string;

public class CountOccuranceOfSubString {

    public static void main(String[] args) {
        String input = "hellojavajavaguides";
        int count = countOccurrencesOf(input, "java");
        System.out.println("Count number of occurrences of substring 'java'" +
                "  in string " + input + " : " + count);
    }

    public static boolean hasLength(String str) {
        return (str != null && !str.isEmpty());
    }

    /**
     * Count the occurrences of the substring {@code sub} in string {@code str}.
     * @param str string to search in
     * @param sub string to search for
     */
    public static int countOccurrencesOf(String str, String sub) {
        if (!hasLength(str) || !hasLength(sub)) {
            return 0;
        }

        int count = 0;
        int pos = 0;
        int index;
        /*
        public int indexOf(@NotNull String str, int fromIndex)
        Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
        The returned index is the smallest value k for which:

             k >= Math.min(fromIndex, this.length()) &&
                           this.startsWith(str, k)

        If no such value of k exists, then -1 is returned.
         */
        System.out.println(str.indexOf(sub, pos));
        while ((index = str.indexOf(sub, pos)) != -1) {
            System.out.println(str.indexOf(sub, pos));
            ++count;
            pos = index + sub.length();
        }
        return count;
    }
}