//leetcode question 744 - https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class binary_search_leetcode_744 {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','e','f','i','x'};
        char target = 'g';
        char ans = findcharacter(arr, target);
        System.out.println(ans);
    }

    static char findcharacter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end ) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
     
}
