// https://leetcode.com/problems/total-hamming-distance/description/

import java.util.HashMap;

public class Algo477
{
    public int totalHammingDistance(int[] nums) {
        /*int diff;
        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                diff = nums[i] ^ nums[j];

                while(diff > 0)
                {
                    cnt = cnt + (diff & 1);
                    diff = diff >> 1;
                }

                sum = sum + cnt;
                cnt = 0;
            }
        }

        return sum;
        */

        int total = 0, n = nums.length;
        for (int j=0;j<32;j++) {
            int bitCount = 0;
            for (int i=0;i<n;i++)
                bitCount += (nums[i] >> j) & 1;
            total += bitCount*(n - bitCount);
        }
        return total;
    }
}
