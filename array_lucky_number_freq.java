
import java.util.HashMap;

//a number is considered lucky if the frequecy of the number in array is equal to the number itself
// for example 2 is lucky number if it appears 2 times in the array
// Q1 “Find the Lucky Integer”
// A lucky integer in an array is an integer whose frequency in the array is equal to its value.
// Return the largest lucky integer in the array. If no lucky integer exists, return -1

// Input: [2, 2, 3, 4]
// Output: 2

// Explanation: 2 appears 2 times → 2 == 2

public class array_lucky_number_freq {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        System.out.println(luckyNumber(arr));
    }

    static int luckyNumber(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Check for lucky number using keySet with index
        Object[] keys = map.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            int key = (int) keys[i];
            if (map.get(key) == key) {
                return key; 
            }
        }

        return -1;
    }
}
