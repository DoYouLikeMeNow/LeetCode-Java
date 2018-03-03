// https://leetcode.com/problems/number-of-segments-in-a-string/description/

public class Algo434
{
    public int countSegments(String s) {
        if(!s.isEmpty())
        {
            int cnt = 0;
            String[] arr = s.split(" ");

            for(String str : arr)
            {
                if(!str.isEmpty())
                {
                    cnt++;
                }
            }

            return cnt;
        }
        return 0;
    }
}
