// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class Algo121
{
    public int maxProfit(int[] prices) {
        int max = 0;

        if(prices.length > 1)
        {
            int curr = prices[0];

            for(int i =0; i < prices.length; i++)
            {
                if(prices[i] > curr)
                {
                    if(prices[i] - curr > max)
                    {
                        max = prices[i] - curr;
                    }
                }

                else
                {
                    curr = prices[i];
                }
            }
        }

        return max;
    }
}
