// https://leetcode.com/problems/repeated-string-match/description/

public class RepeatedStringMatch
{
    public int repeatedStringMatch(String A, String B) {
        int inc = 0, cnt = 1;
        String initialStr = A;

        while(inc < 2)
        {
            if(A.length() >= B.length())
            {
                if(A.contains(B))
                    return cnt;

                inc++;
            }

            A = A + initialStr;
            cnt++;
        }

        return -1;
    }
}
