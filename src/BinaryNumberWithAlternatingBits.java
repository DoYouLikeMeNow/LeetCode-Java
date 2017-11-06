// https://leetcode.com/problems/binary-number-with-alternating-bits/description/

public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);

        if(binary.length()%2!=0)
            binary = "0" + binary;

        String[] binaryArr = binary.split("");

        for(int i = 0; i < binaryArr.length-1; i++) {
            if(binaryArr[i].equals(binaryArr[i+1]))
                return false;
        }

        return true;
    }
}
