// http://codingbat.com/prob/p154669

package recursionPractice;

public class Factorial {
    public int factorial(int n) {
        if(n>0)
            return n*factorial(n-1);

        return 1;
    }
}
