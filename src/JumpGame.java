// https://leetcode.com/problems/jump-game/description/#

public class JumpGame
{
    public boolean canJump(int[] nums) {
        int i = 0, max = 0, temp = 0;

        while(i < nums.length)
        {
            if(nums[i] == 0)
                if(nums.length-1 == i)
                    return true;

                else
                    return false;

            if(i + nums[i] < nums.length-1)
            {
                for(int j = i + 1; j <= i + nums[i]; j++)
                {
                    if(max <= nums[j])
                    {
                        max = nums[j];
                        temp = j;
                    }
                }

                if(temp + nums[temp] >= i + nums[i])
                    i = temp;

                else
                    i = i + nums[i];

                max = 0;
                temp = 0;
            }

            else
                break;
        }

        return true;
    }
}
