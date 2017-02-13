public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
        {
            return 0;
        }
        int max = 0;
        int minsofar = prices[0];
        for(int i = 0; i<prices.length; i++)
        {
            if(minsofar<prices[i])
            {
                max = Math.max(max,prices[i]-minsofar);
            }else{
                minsofar = prices[i];
            }
        }
        
        return max;
        
    }
}
