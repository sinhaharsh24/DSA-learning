
public class binary_search_in_matrix_leetcode_question {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        int target = 8;
        boolean ans = search(matrix, target);
        System.out.println(ans);

    }
    static boolean search(int[][] matrix, int target) {
        int r = 0;
        int col = matrix[0].length - 1;
        while (r < matrix.length && col >= 0) {
            if (matrix[r][col] == target) {
                return true;
            }
            if (matrix[r][col] < target) {
                r++;
            }else {
                col--;
            }
        }
        return false;

    }
}
