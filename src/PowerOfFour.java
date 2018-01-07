// https://leetcode.com/problems/power-of-four/description/

public class PowerOfFour
{
    public boolean isPowerOfFour(int num) {
        /*
        // using loop
        boolean powerOfFour = false;

        while (num >= 4)
        {
            if(num%4 == 0)
                num = num/4;
                    if(num == 1)
                        powerOfFour = true;

            else
                powerOfFour = false;
        }

        return powerOfFour;
        */

        /*
        // faster
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        */

        // fastest
        return num > 0 && (num & (num - 1)) == 0 && (num - 1) % 3 == 0;
    }
}
