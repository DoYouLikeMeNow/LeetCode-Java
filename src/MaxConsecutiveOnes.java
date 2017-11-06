// https://leetcode.com/problems/max-consecutive-ones/description/

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cnt = 0;
        boolean check = false;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                if(check == false)
                    check = true;

                cnt++;

                if(i == nums.length-1)
                    if(cnt > max)
                        max = cnt;
            }

            else
                if(check){
                    check = false;

                    if(cnt > max)
                        max = cnt;

                    cnt = 0;
                }
        }

        return max;
    }
}
