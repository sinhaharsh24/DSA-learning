import java.util.Arrays;

public class linearsearch_in2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };
        int target = 8;
        int[] ans = search(arr, target);  //it will be in array format {a,b}
        System.out.println(Arrays.toString(ans));
        System.out.println(min(arr));
    }
    static int[] search(int[][] arr, int target) {

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        return min;

    }
}
