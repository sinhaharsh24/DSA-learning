//ceiling of a number - Smallest element in array greater or equal to the target

public class binary_search_ceiling_of_a_number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceilingofthenumber(arr, target);
        System.out.println(ans);
    }

    static int ceilingofthenumber(int[] arr, int target) {
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
        return arr[start]; //if you want undex then it will be return start; only

    }

}
