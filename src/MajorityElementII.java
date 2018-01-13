// https://leetcode.com/problems/majority-element-ii/description/

/*
Note:
Try using boyer-Moore Algorithm
https://gregable.com/2013/10/majority-vote-algorithm-find-majority.html
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII
{
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int cnt = 0;
        List<Integer> finalList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }

            else
            {
                cnt = map.get(nums[i]);
                map.put(nums[i], cnt+1);
            }
        }

        for(HashMap.Entry<Integer,Integer> ent : map.entrySet())
        {
            if(ent.getValue() > nums.length/3)
            {
                finalList.add(ent.getKey());
            }
        }

        return  finalList;
    }
}
