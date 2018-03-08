// https://leetcode.com/problems/unique-binary-search-trees/description/

public class Algo96
{
    public int numTrees(int n) {
        return fac(2*n) / (fac(n + 1) * fac(n));
    }

    int fac(int n)
    {
        int cnt = n;
        while (cnt>1)
        {
            n *= --cnt;
        }

        return n;
    }
}
