public class max_wealth {
    //https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int rowsum = 0;
            for (int anInt : ints) {
                rowsum += anInt; // taking sum of row elements
            }
            if (rowsum > max) {
                max = rowsum;
            }
        }
        return max;
    }


}
