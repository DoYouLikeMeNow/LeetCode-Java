package GoldmanSachs;

public class Q2
{
    public long countSteps(int n)
    {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;

        long one_step_before = 3;
        long two_steps_before = 2;
        long three_steps_before = 1;
        long all_ways = 0;

        for(int i=2; i<n; i++){
            all_ways = one_step_before + two_steps_before + three_steps_before;
            three_steps_before = two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
    }
}
