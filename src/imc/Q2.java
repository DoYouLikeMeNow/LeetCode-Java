package imc;

import java.util.HashSet;
import java.util.Set;

public class Q2
{
    public int solution(int[] A, int[] B, int M, int X, int Y) {

        int accWt = 0;
        int capFilled = 0;
        int totalStops = 0;
        Set<Integer> floors = new HashSet<>();

        if(A.length == B.length && A.length > 0 && A.length <= 100000 && M > 0 && M <= 100000 && X > 0 && X <= 100000 && Y > 0 && Y < 1000000000)
        {
            for(int i =0; i < A.length; )
            {
                if(A[i] > 0 && A[i] <= Y && A[i] <= (Y-accWt) && capFilled < X)
                {
                    if(B[i] > 0 && B[i] <= M)
                    {
                        floors.add(B[i]);
                        capFilled++;
                        accWt = accWt + A[i];
                        i++;
                    }
                }

                else
                {
                    if(A[i] > 0 && A[i] <= Y)
                    {
                        totalStops = totalStops + floors.size() + 1;
                        floors.clear();
                        accWt = 0;
                        capFilled = 0;
                    }

                    else
                    {
                        i++;
                    }
                }
            }

            if(floors.size() > 0)
                totalStops = totalStops + floors.size() + 1;

            return totalStops;
        }

        return -1;
    }
}
