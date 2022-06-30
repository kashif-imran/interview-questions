package synechron;

class LargestCommonPrefix {
    public String longestCommonPrefix(String[] str) {
        if (str.length == 0) return "";
        String prefix = str[0];
        for (int i = 1; i < str.length; i++)
            while (str[i].indexOf(prefix) != 0) { //indexOf(str) Returns the index within this string of the first occurrence of the specified substring.
                                                  //The returned index is the smallest value k for which:  this.startsWith(str, k) If no such value of k exists, then -1 is returned.
                System.out.println("str[i] " + str[i]);
                System.out.println("prefix " + prefix);
                System.out.println("str[i].indexOf(prefix) " + str[i].indexOf(prefix));

                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static void main(String args[]) {
        // Your code goes here
        LargestCommonPrefix ob = new LargestCommonPrefix();
        String s[] = {"flower", "flow", "flight"};
        System.out.println(ob.longestCommonPrefix(s));
    }
}