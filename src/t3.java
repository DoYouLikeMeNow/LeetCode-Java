import java.util.Arrays;

public class t3 {
    public int longestSubSeq(int[] s){
        int length = 0;

        if(s.length>0 && s.length <= 1000) {
            int[] max = new int[s.length];
            Arrays.fill(max, 1);

            length = 1;
            for (int i = 0; i < s.length; i++) {
                if(s[i] > 0 && s[i] <= 1000000) {
                    for (int j = 0; j < i; j++) {
                        if (s[i] > s[j]) {
                            max[i] = Math.max(max[i], max[j] + 1);
                        }
                    }
                    length = Math.max(max[i], length);
                }
            }
        }

        return length;
    }
}
