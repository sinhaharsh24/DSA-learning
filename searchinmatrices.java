import java.util.Arrays;

public class searchinmatrices {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        int target = 8;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target) {
        int r = 0;
        int col = arr[0].length - 1;
        while (r < arr.length && col >= 0) {
            if (arr[r][col] == target) {
                return new int[]{r, col};
            }
            if (arr[r][col] < target) {
                r++;
            }else {
                col--;
            }
        }
        return new int[]{-1, -1};

    }
}
