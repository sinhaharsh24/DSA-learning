
import java.util.Arrays;
import java.util.HashMap;

public class two_sum_hashmap {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 16;
        int[] result = findingtheanswer(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] findingtheanswer(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return null;

    }
}
