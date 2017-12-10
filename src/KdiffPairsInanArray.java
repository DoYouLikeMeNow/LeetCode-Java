// https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

import java.util.*;

public class KdiffPairsInanArray {
    public int findPairs(int[] nums, int k) {
        int cnt = 0;

        Set<Integer> setI = new HashSet<>();

        for(int i : nums){
            setI.add(i);
        }

        List<Integer> integersList = new ArrayList<>();
        for(int i : setI){
                integersList.add(i);
        }

        /*
        List<Integer> integersList = new ArrayList<>();

        for(int i : nums){
            integersList.add(i);
        }
*/
        Collections.sort(integersList, Collections.reverseOrder());

        for(int i = 0; i < integersList.size(); i++){
            for(int j = i+1; j < integersList.size(); j++){
                if(integersList.get(i)-integersList.get(j) == k){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
