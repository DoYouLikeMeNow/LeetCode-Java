// https://leetcode.com/problems/word-pattern/description/

import java.util.HashMap;

public class Algo290
{
    public boolean wordPattern(String pattern, String str) {

        String[] strArr = str.split(" ");

        if(strArr.length == pattern.length())
        {
            HashMap<Character, String> map = new HashMap<>();

            for (int i = 0; i < pattern.length(); i++)
            {
                if (map.get(pattern.charAt(i)) == null)
                    if (!map.containsValue(strArr[i]))
                        map.put(pattern.charAt(i), strArr[i]);

                    else
                        return false;

                else if (!map.get(pattern.charAt(i)).equals(strArr[i]))
                    return false;
            }

            return true;
        }
        return false;
    }
}
