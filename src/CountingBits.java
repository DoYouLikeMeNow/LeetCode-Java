// https://leetcode.com/problems/counting-bits/description/
public class CountingBits {
    /*
    public int[] countBits(int num) {

        int cnt = 0;
        int[] result = new int[num+1];

        for (int i = 0; i <= num; i++) {
            String binaryRep = Integer.toBinaryString(i);

            for (char ch : binaryRep.toCharArray()) {
                if (ch == '1')
                    cnt++;
            }

            result[i] = cnt;
            cnt = 0;
        }

        return result;
    }
    */
    public int[] countBits(int num) {

        int cnt = 0;
        int[] result = new int[num+1];

        for (int i = 0; i <= num; i++) {
            String binaryRep = Integer.toBinaryString(i);

            for (char ch : binaryRep.toCharArray()) {
                if (ch == '1')
                    cnt++;
            }

            result[i] = cnt;
            cnt = 0;
        }

        return result;
    }
}
