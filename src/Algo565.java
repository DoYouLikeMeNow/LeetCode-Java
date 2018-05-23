
public class Algo565
{
    public int arrayNesting(int[] nums) {

        /*
        // brute force
        int in;
        int len = 0;
        int maxLength = 0;
        ArrayList<Integer> found = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
        {
            in = nums[i];

            while(in != -1)
            {
                if(!found.contains(nums[in]))
                {
                    found.add(nums[in]);
                    len++;
                    in = nums[in];
                }

                else
                {
                    in = -1;
                }
            }

            if(maxLength < len)
            {
                maxLength = len;
            }

            len = 0;
            found.clear();
        }

        return maxLength;
        */

        int maxLength = 0;
        int start;
        int len;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != Integer.MAX_VALUE)
            {
                start = nums[i];
                len = 0;

                while (nums[start] != Integer.MAX_VALUE)
                {
                    int temp = start;
                    start = nums[start];
                    len++;
                    nums[temp] = Integer.MAX_VALUE;
                }
                if(maxLength < len)
                {
                    maxLength = len;
                }
            }
        }
        return maxLength;
    }
}


