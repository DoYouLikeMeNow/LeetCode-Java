// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        char[] digitsArray = digits.toCharArray();

        char[] two = {'a','b','c'};
        char[] three = {'d','e','f'};
        char[] four = {'g','h','i'};
        char[] five = {'j','k','l'};
        char[] six = {'m','n','o'};
        char[] seven = {'p','q','r','s'};
        char[] eight = {'t','u','v'};
        char[] nine = {'w','x','y','z'};

        List<String> result = new ArrayList<>();
        return result;

    }
}
