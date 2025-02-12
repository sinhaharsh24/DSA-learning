//https://leetcode.com/problems/missing-number/description/
//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

import java.util.Arrays;

public class missing_number_between_distinct_numbers {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int sorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        return i;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
