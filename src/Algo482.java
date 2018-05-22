// https://leetcode.com/problems/license-key-formatting/description/


public class Algo482
{
    public String licenseKeyFormatting(String S, int K) {
       StringBuilder finalS = new StringBuilder();
       int curr = K;
       char[] arrS = S.toCharArray();

       for(int i = arrS.length - 1; i >= 0; i--)
       {
           if(arrS[i] != '-')
           {
               finalS.append(arrS[i]);
               curr--;
           }

           if(curr == 0 && i != 0 && arrS[i-1] != '-')
           {
               finalS.append('-');
               curr = K;
           }
       }
       return finalS.reverse().toString().toUpperCase();
    }
}
