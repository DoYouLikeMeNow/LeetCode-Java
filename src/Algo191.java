// https://leetcode.com/problems/number-of-1-bits/description/

public class Algo191
{
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        /*long num = Integer.toUnsignedLong(n);
        String bitStr = Long.toBinaryString(num);
        int cnt = 0;

        for(char ch : bitStr.toCharArray())
        {
            if(ch == '1')
                cnt++;
        }

        return cnt;*/

        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1);
            n = n>>>1;
        }
        return ones;
    }
}
