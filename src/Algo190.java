// https://leetcode.com/problems/reverse-bits/description/

import javax.swing.*;

public class Algo190
{
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        /*String bitStr = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        bitStr = new StringBuilder(bitStr).reverse().toString();

        n = Integer.parseInt(bitStr,2);

        return n;*/

        n = n >>> 16 | n<<16;

        n = (n & 0xff00ff00) >>> 8 | (n & 0x00ff00ff) << 8;
        n = (n & 0xf0f0f0f0) >>> 4 | (n & 0x0f0f0f0f) << 4;
        n = (n & 0xcccccccc) >>> 2 | (n & 0x33333333) << 2;
        n = (n & 0xaaaaaaaa) >>> 1 | (n & 0x55555555) << 1;

        return n;
    }
}
