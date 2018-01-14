// https://leetcode.com/problems/factorial-trailing-zeroes/description/

/*
There is an overflow issue if you use i*5
https://leetcode.com/problems/factorial-trailing-zeroes/discuss/52367/
 */

public class FactorialTrailingZeroes
{
    public int trailingZeroes(int n)
    {
        int cnt = 0;
        while(n>0){
            cnt += n/5;
            n/=5;
        }
        return cnt;
    }
}
