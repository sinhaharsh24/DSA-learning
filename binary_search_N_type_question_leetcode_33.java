public class binary_search_N_type_question_leetcode_33 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2,3};
        int target = 1;
        int ans = findtarget(nums, target);
        System.out.println(ans);
    }

    static int findtarget(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
