// next capital beautiful bike path
// https://stackoverflow.com/questions/48919799/find-maximum-intervals-with-no-more-than-3-overlap

package temp;

import java.lang.reflect.Array;
import java.util.*;

public class Rough2
{
    public int maxFlorists(int pathLength, int[][] floristIntervals) {
        Arrays.sort(floristIntervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        List<Integer> currentPath = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i = 0; i < pathLength; i++)
        {
            if(floristIntervals[i][0] < pathLength)
            {
                if(map.get(i) == null)
                {
                    currentPath.add(floristIntervals[i][0]);
                    currentPath.add(floristIntervals[i][1]);
                    map.put(i,currentPath);
                }

                else
                {

                }
            }
        }

        return 0;
    }


}
