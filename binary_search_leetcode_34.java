//leetcode question 34 - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class binary_search_leetcode_34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,1};
        int first = findIndex(nums, target, true);
        int last = findIndex(nums, target, false);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    static int findIndex(int[] nums, int target, boolean findFirst) {
        int ans = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1; 
                } else {
                    start = mid + 1; 
                }
            }
        }
        return ans;
    }
}
