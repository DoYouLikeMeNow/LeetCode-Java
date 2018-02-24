// https://leetcode.com/problems/longest-word-in-dictionary/description/

import java.util.Arrays;
import java.util.Collections;

public class LongestWordInDictionary
{
    public String longestWord(String[] words)
    {
        Arrays.sort(words);

        String prev = words[0];
        String result = "";

        for (String str : words)
        {
            if (str.length() == prev.length() + 1 && str.contains(prev))
            {
                if (str.length() > result.length())
                {
                    result = str;
                }

                prev = str;
            }

            else if(str.length() == 1)
            {
                prev = str;
            }

            else
            {
                prev = "";
            }
        }

        return result;
    }
}
