// https://leetcode.com/problems/assign-cookies/description/
import java.util.Arrays;

public class AssignCookies
{
    /*
    // O(n^2)
    public int findContentChildren(int[] g, int[] s) {
        int cnt = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for(int i = 0; i < g.length; i++)
        {
            for(int j = 0; j < s.length; j++)
            {
                if(s[j] >= g[i])
                {
                    cnt++;
                    s[j]=-1;
                    break;
                }
            }
        }

        return cnt;
    }
    */

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;

        for(int j = 0; i < g.length && j < s.length; j++)
        {
            if(g[i] <= s[j])
                i++;
        }

        return i;
    }
}