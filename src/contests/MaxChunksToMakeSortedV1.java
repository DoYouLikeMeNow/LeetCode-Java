package contests;

public class MaxChunksToMakeSortedV1
{
    public int maxChunksToSorted(int[] arr)
    {
        int high = arr[0];
        int cnt = 1;
        int prev = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > high)
            {
                prev = high;
                high = arr[i];
                cnt++;
            }

            if (arr[i] < prev)
            {
                cnt = 1;
            }
        }

        return cnt;
    }
}
