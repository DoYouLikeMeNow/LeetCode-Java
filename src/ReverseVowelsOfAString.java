// https://leetcode.com/problems/reverse-vowels-of-a-string/description/

import java.util.Arrays;

// https://leetcode.com/problems/reverse-vowels-of-a-string/description/
public class ReverseVowelsOfAString
{
    public String reverseVowels(String s)
    {
        char[] arr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        char temp;

        int index1 = 0;
        int index2 = arr.length-1;

        while(index1 < index2)
        {
            while (index1 < index2)
            {
                if (vowels.contains(Character.toString(arr[index1])))
                {
                    break;
                }

                index1++;
            }

            while (index1 < index2)
            {
                if (vowels.contains(Character.toString(arr[index2])))
                {
                    break;
                }
                index2--;
            }

            temp = arr[index2];
            arr[index2] = arr[index1];
            arr[index1] = temp;
            index1++;
            index2--;
        }

        String finalString = new String(arr);

        return finalString;
    }
}
