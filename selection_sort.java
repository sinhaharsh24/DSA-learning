import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 7, 4, 5};
        int[] ans = sorting(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int last = n - 1 - i;
            int maximumIndex = maxindex(arr, 0, last);
            swap(arr, maximumIndex, last);  // Swapping with last, not i
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maxindex(int[] arr, int start, int end) {
        int maxIndex = start;  // Should store index, not value
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {  // Compare with arr[maxIndex], not arr[max]
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
