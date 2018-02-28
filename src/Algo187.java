// https://leetcode.com/problems/repeated-dna-sequences/description/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algo187
{
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> output = new ArrayList<>();

        if(s.length() > 10)
        {
            Set<String> seq = new HashSet<>();

            String currentSeq;

            for (int i = 0; i < s.length() - 9; i++)
            {
                currentSeq = s.substring(i, i + 10);

                if (seq.contains(currentSeq))
                {
                    if (!output.contains(currentSeq))
                    {
                        output.add(currentSeq);
                    }
                }

                else
                {
                    seq.add(currentSeq);
                }
            }
        }

        return output;
    }
}
