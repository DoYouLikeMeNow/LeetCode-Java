package GoldmanSachs;

public class Q1
{
    public int secondSmallest(int[] x)
    {
        if (x.length < 2)
        {
            return 0;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < x.length ; i ++)
        {
            if (x[i] < first)
            {
                second = first;
                first = x[i];
            }

            else if (x[i] < second && x[i] != first)
            {
                second = x[i];
            }
        }

        if (second != Integer.MAX_VALUE)
        {
            return second;
        }

        else if(x.length == 2 && x[0] != x[1])
        {
            return second;
        }

        else
        {
            return 0;
        }
    }
}
