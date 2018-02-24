package imc;

import com.sun.deploy.util.StringUtils;

import java.util.List;
import java.util.regex.Pattern;

public class Q1
{
    public int solution(String S) {


        Pattern isAlphaNum = Pattern.compile("[^a-zA-Z0-9]");
        Pattern hasCaps = Pattern.compile("[*A-Z]");
        int maxLength = 0;

        if(S != null && !S.isEmpty())
        {
            if(S.length() <= 200)
            {
               if(!isAlphaNum.matcher(S).find())
               {
                   if(hasCaps.matcher(S).find())
                   {
                       String[] splitted = S.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

                       for (String str : splitted)
                       {
                           if(hasCaps.matcher(S).find())
                           {
                               if(maxLength < str.length())
                                   maxLength = str.length();
                           }
                       }

                       return maxLength;
                   }
               }
            }
        }
        return -1;
    }
}
