import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 7, 4, 5};
        int[] ans = sorting(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }else {
                    break;
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
