//https://leetcode.com/problems/power-of-three/description/

public class Algo362
{
    public boolean isPowerOfThree(int n) {
        while(n > 0)
        {
            if(n == 1)
            {
                return true;
            }

            if(n%3 != 0)
            {
                return false;
            }

            else
            {
                n = n/3;
            }
        }
        return false;

        // another way
        // return n > 0 && 1162261467 % n == 0;
        // see solution
    }
}
