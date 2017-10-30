// https://leetcode.com/problems/longest-uncommon-subsequence-i/description/

public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        if(a.length()>=b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (!b.contains(a.substring(0, a.length() - i))) {
                    return a.length() - i;
                }
            }
        }

        else{
            for (int i = 0; i < b.length(); i++) {
                if (!a.contains(b.substring(0, b.length() - i))) {
                    return b.length() - i;
                }
            }
        }

        return -1;
    }
    /*
    public int findLUSlength(String a, String b) {
         if(a.equals(b))
            return -1;

        else if (a.length()==b.length())
            return a.length();

        else
            if(a.length()>b.length())
                return a.length();

            else
                return b.length();
    }
     */
}

