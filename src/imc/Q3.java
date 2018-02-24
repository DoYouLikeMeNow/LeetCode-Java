package imc;

public class Q3
{
    public int solution(int[][] A)
    {

        int noOfCountries = 0;

        if(A.length > 0 && A.length <= 300000)
        {
            if(A[0].length > 0 && A[0].length <= 300000)
            {
                int N = A.length;
                int M = A[0].length;
                int[][] B = A;

                for (int row = 0; row < N; row++)
                {
                    for (int col = 0; col < M; col++)
                    {
                        if (B[row][col] >= 0)
                        {
                            checkNeighbor(A, B, row, col, N, M);
                            noOfCountries++;
                        }
                    }
                }
                return noOfCountries;
            }
        }

        return -1;
    }

    private void checkNeighbor(int[][] A, int[][] B, int i,int j, int N, int M)
    {
        if(B[i][j] != -1)
        {
            B[i][j] = -1;

            if (i + 1 < N)
                if (A[i + 1][j] == A[i][j])
                    checkNeighbor(A, B, i + 1, j, N, M);

            if (i - 1 >= 0)
                if (A[i - 1][j] == A[i][j])
                    checkNeighbor(A, B, i - 1, j, N, M);

            if (j + 1 < M)
                if (A[i][j + 1] == A[i][j])
                    checkNeighbor(A, B, i, j + 1, N, M);

            if (j - 1 >= 0)
                if (A[i][j - 1] == A[i][j])
                    checkNeighbor(A, B, i, j - 1, N, M);
        }
    }
}
