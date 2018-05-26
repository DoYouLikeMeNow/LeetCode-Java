public class Algo832
{
    public int[][] flipAndInvertImage(int[][] A) {
        int temp;

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[0].length / 2; j++)
            {
                temp = A[i][j];
                if(A[i][A[0].length - 1 - j] == 0)
                {
                    A[i][j] = 1;
                }

                else
                {
                    A[i][j] = 0;
                }

                if(temp == 0)
                {
                    A[i][A[0].length - 1 - j] = 1;
                }

                else
                {
                    A[i][A[0].length - 1 - j] = 0;
                }

                //A[i][j] = A[i][A[0].length - 1 - j];
                //A[i][A[0].length - 1 - j] = temp;
            }
        }

        return A;
    }
}
