import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Algo804
{
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        Set<String> finalCodes = new HashSet<>();
        String temp = "";

        for(String w : words)
        {
            for(char ch : w.toCharArray())
            {
                temp = temp + morse[alpha.indexOf(ch)];
            }

            finalCodes.add(temp);
            temp = "";
        }

        return finalCodes.size();
    }
}
