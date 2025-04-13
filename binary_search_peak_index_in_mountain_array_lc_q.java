public class binary_search_peak_index_in_mountain_array_lc_q {
    public static void main(String[] args) {
        int[] arr = {0,1,3,6,8,5,2,1};
        int ans = searchmaxindex(arr);
        System.out.println(ans);
        
    }
    static int searchmaxindex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end ) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else {
                end = mid;
            }
            
        }
        return start;

    }
}
