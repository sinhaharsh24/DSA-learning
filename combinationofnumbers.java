//leetcode question 17 
//link = https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

public class combinationofnumbers {

    public static void main(String[] args) {
        pad("", "23");

    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        } 

        int digit = up.charAt(0) - '0'; //this will convert '2' to 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);  //(char) will convert it into char
            pad(p + ch, up.substring(1));

        }

    }

}
