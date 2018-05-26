//https://leetcode.com/problems/self-dividing-numbers/description/

public class Algo832
{
    public int[][] flipAndInvertImage(int[][] A) {
        int temp;

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < (float) A[0].length / 2; j++)
            {
                temp = A[i][j];

                if(j != A[0].length - 1 - j)
                {
                    if (A[i][A[0].length - 1 - j] == 0)
                    {
                        A[i][j] = 1;
                    }

                    else
                    {
                        A[i][j] = 0;
                    }

                    if (temp == 0)
                    {
                        A[i][A[0].length - 1 - j] = 1;
                    }

                    else
                    {
                        A[i][A[0].length - 1 - j] = 0;
                    }
                }

                else
                {
                    if(A[i][j] == 0)
                    {
                        A[i][j] = 1;
                    }

                    else
                    {
                        A[i][j] = 0;
                    }
                }
            }
        }

        return A;
    }
}
