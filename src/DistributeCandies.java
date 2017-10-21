import java.lang.reflect.Array;
import java.util.*;

// https://leetcode.com/problems/distribute-candies/description/
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        if(candies.length>=2 && candies.length<=10000 && candies.length%2==0) {

            int dividedQty = candies.length / 2;

            Set<Integer> unique = new HashSet<>();
            unique.addAll(Arrays.asList(Arrays.stream(candies).boxed().toArray(Integer[]::new)));

            int numOfTypes = unique.size();

            if (numOfTypes < dividedQty) {
                return numOfTypes;
            } else {
                return dividedQty;
            }
        }

        return -1;
    }
}
