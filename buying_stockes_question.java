//question number - 121

public class buying_stockes_question {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = maxprofit(prices);
        System.out.println(result);
    }

    static int maxprofit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] <  min){
                min = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
        }

        return profit;
    }
}
