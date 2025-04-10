//https://leetcode.com/problems/search-insert-position/description/
//Given a sorted array of distinct integers and a target value,
//return the index if the target is found. If not, return the index where it would be if it were inserted in order.

public class binary_search_return_target_index {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 4;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end ) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid] ) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;

    }


}
