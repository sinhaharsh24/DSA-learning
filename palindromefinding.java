public class palindromefinding {
    public static void main(String[] args) {
        //check if the word is palindrome or not
        String s = "abcba";
        System.out.println(isPalindrome(s));

    }
    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s == null || s.length() == 0){
            return true;
        }
        for(int i = 0; i < s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if(start != end) {
                return false;
            }

        }
        return true;

    }
}
