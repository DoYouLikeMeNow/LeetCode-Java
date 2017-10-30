// http://codingbat.com/prob/p194781

package recursionPractice;

public class Triangle {
    public int triangle(int rows) {
        if(rows == 0)
            return 0;

        else
            return rows + triangle(rows - 1);
    }
}
