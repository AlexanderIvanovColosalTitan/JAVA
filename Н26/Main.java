public class Main {
    public static void main(String[] args) {
        String palindrome = palindromeString("aabosobca");
        System.out.println(palindrome + "\n" + palindrome.length());
    }
    public static String pal(String str, int left, int right) {
        while (left >= 0 && right < str.length() &&
                str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
    public static String palindromeString(String str) {
        String lpal = str.substring(0, 1);
        for (int i = 0; i < str.length() - 1; i++) {
            if (pal(str, i, i).length() > lpal.length()) {
                lpal = pal(str, i, i);
            }
            if (pal(str, i, i + 1).length() > lpal.length()) {
                lpal = pal(str, i, i + 1);
            }
        }
        return lpal;

    }
}