import java.util.HashMap;

public class contains_duplicate_within_a_distance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int k = 3;
        System.out.println(duplicatepresent(arr, k)); // Output: true
    }

    static boolean duplicatepresent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int prevIndex = map.get(arr[i]);
                if (Math.abs(i - prevIndex) <= k) {
                    return true;
                }
            }
            map.put(arr[i], i); // store/update latest index of the number
        }
        return false;
    }
}
