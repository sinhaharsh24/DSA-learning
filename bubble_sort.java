import java.util.Arrays;

public class bubble_sort {
    //it is also know as sinking sort or
    //in this sorting algorithm we pass the unsorted array multiple times till it gets sort
    //in bubble sort we check with the nearest element and sort them accordingly
    //like if we take a array as {4,5,1,2} in one pass it will swap the places to sort accordingly
    // {4,5,1,2} -> {4,1,2,5} -> {1,2,4,5}
    public static void main(String[] args) {
        int[] arr = {3,6,2,7,4,5};
        int[] ans = sorting(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
