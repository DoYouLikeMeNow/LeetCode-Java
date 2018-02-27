// https://leetcode.com/problems/reverse-integer/description/

public class Algo7
{
    public int reverse(int x) {
        int revNum = 0;
        int prevRevNum = 0;
        boolean isNegative = false;

        if(x < 0)
        {
            isNegative = true;
            x *= -1;
        }

        while(x > 0)
        {
            revNum = revNum * 10 + x%10;

            if((revNum - x%10)/10 != prevRevNum)
                return 0;

            x = x/10;
            prevRevNum = revNum;
        }

        if(isNegative)
            revNum *= -1;

        return revNum;
    }
}
