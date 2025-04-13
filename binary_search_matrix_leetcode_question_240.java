public class binary_search_matrix_leetcode_question_240 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 }, 
                { 3, 6, 9, 16, 22 }, 
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 },
        };
        int target = 20;
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
            } else {
                col--;
            }
        }
        return false;

    }
}