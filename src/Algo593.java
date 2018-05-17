// https://leetcode.com/problems/valid-square/description/

import java.util.ArrayList;
import java.util.List;

public class Algo593
{
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        List<Double> dist = new ArrayList<>();

        if(!dist.contains(distance(p1, p2)))
        {
            dist.add(distance(p1, p2));
        }

        if(!dist.contains(distance(p1, p3)))
        {
            dist.add(distance(p1, p3));
        }

        if(!dist.contains(distance(p1, p4)))
        {
            dist.add(distance(p1, p4));
        }

        if(!dist.contains(distance(p2, p3)))
        {
            dist.add(distance(p2, p3));
        }

        if(!dist.contains(distance(p2, p4)))
        {
            dist.add(distance(p2, p4));
        }

        if(!dist.contains(distance(p3, p4)))
        {
            dist.add(distance(p3, p4));
        }

        if(dist.size() == 2)
        {
            if(dist.get(0) > dist.get(1))
            {
                if((Math.round(dist.get(0) * dist.get(0) *1000.0) / 1000.0) == (Math.round(2 * dist.get(1) * dist.get(1) * 1000.0) / 1000.0))
                {
                    return true;
                }
            }

            else
            {
                if((Math.round(dist.get(1) * dist.get(1) *1000.0) / 1000.0) == (Math.round(2 * dist.get(0) * dist.get(0) * 1000.0) / 1000.0))
                {
                    return true;
                }
            }
        }

        return false;
    }

    public double distance(int[] p1, int[] p2)
    {
        return Math.sqrt((p2[1] - p1[1]) * (p2[1] - p1[1]) + (p2[0] - p1[0]) * (p2[0] - p1[0]));
    }
}
