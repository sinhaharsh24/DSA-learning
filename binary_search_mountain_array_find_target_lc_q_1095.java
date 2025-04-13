public class binary_search_mountain_array_find_target_lc_q_1095 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;
        int ans = searchthetarget(arr, target);
        System.out.println(ans);
    }

    static int searchthetarget(int[] arr,int target){
        int peakIndex = searchmaxindex(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target,0, peakIndex);
        if(firstTry != -1){
            return firstTry;
        }

        int secondTry = orderAgnosticBinarySearch(arr, target, peakIndex + 1, arr.length -1);
        
        return secondTry;
    }

    static int searchmaxindex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return start;

    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}