//https://leetcode.com/problems/jewels-and-stones/description/

public class Algo771
{
    public int numJewelsInStones(String J, String S) {
        int cnt = 0;
        for(char ch : S.toCharArray())
        {
            if(J.contains(Character.toString(ch)))
            {
                cnt++;
            }
        }

        return cnt;
    }
}
