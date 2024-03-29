public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalindrom(str));
    }

    static boolean isPalindrom(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - i -1);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
