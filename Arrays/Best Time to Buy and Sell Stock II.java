

class Solution {
    public int maxProfit(int[] prices) {
        
        int sum = 0;
        int curPrice = prices[0];

        for(int i=1;i<prices.length;i++){
            curPrice = Math.min(curPrice,prices[i]);
            if(curPrice < prices[i]){
                int profit = prices[i] - curPrice;
                sum+=profit;
                curPrice = prices[i];
            }
        }

        return sum;
    }
}
