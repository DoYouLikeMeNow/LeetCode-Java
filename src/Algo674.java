// https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/

public class Algo674
{
    public int findLengthOfLCIS(int[] nums) {
        int max = 0;

        if(nums.length > 0)
        {
            int cnt = 1;


            for (int i = 1; i < nums.length; i++)
            {
                if (nums[i - 1] < nums[i])
                {
                    cnt++;
                } else
                {
                    if (max < cnt)
                    {
                        max = cnt;
                    }

                    cnt = 1;
                }
            }

            if (cnt > max)
            {
                max = cnt;
            }
        }
        return max;
    }
}
