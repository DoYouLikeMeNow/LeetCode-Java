// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/#

public class algo762
{
    public int countPrimeSetBits(int L, int R)
    {
        int cnt = 0;
        if (L > 0 && L <= R && R <= 1000000 && R - L <= 10000)
        {
            String bitString;
            int numOfBits = 0;


            for (int n = L; n <= R; n++)
            {
                bitString = Integer.toBinaryString(n);

                for (char ch : bitString.toCharArray())
                {
                    if (ch == '1')
                        numOfBits++;
                }

                if (isPrime(numOfBits))
                {
                    cnt++;
                }

                numOfBits = 0;
            }
        }
        return cnt;
    }

    public boolean isPrime(int n)
    {
        if (n == 1)
            return false;

        int cnt = 0;

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
