// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algo442
{
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output = new ArrayList<>();
        Set<Integer> occurred = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0 && nums[i] <= nums.length)
            {
                if (occurred.contains(nums[i]))
                {
                    output.add(nums[i]);
                } else
                {
                    occurred.add(nums[i]);
                }
            }
        }

        return output;
    }
}
