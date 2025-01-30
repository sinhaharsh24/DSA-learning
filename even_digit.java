public class even_digit {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));



    }
    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check if it a element in a array contains a even digit or not
    static boolean even(int num) {
        int numofdigits = digits(num);
//        if (numofdigits % 2 == 0) {
//            return true;
//        }
//        return false;
        return numofdigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }

//        if(num == 0) {
//            return 0;
//        }
//
//        while (num > 0) {
//            count++;
//            num = num / 10;
//        }
//        return count;

        return (int)(Math.log10(num) + 1);

    }
}
