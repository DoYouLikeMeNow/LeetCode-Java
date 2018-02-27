import contests.MaxChunksToMakeSortedV1;
import contests.ToeplitzMatrix;
import recursionPractice.*;
import imc.*;

import javax.security.sasl.SaslServer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Boot {
    public static void main(String[] args){
        //////// Timeline moves in chronological order

        /*
        //https://leetcode.com/problems/keyboard-row/description/
        String[] input = {"Hello", "Alaska", "Dad", "Peace"};
        KeyboardRow keyboardRowObj = new KeyboardRow();
        String[] output = keyboardRowObj.findWords(input);
        for(String out: output){
            System.out.println(out);
        }
        */

        /*
        // https://leetcode.com/problems/baseball-game/description/
        String[] input = {"5","-2","4","C","D","9","+","+"};
        BaseballGame baseballGameObj = new BaseballGame();
        int output = baseballGameObj.calPoints(input);
        System.out.println(output);
        */

        /*
        // https://leetcode.com/problems/distribute-candies/description/
        int[] input = {1,1,2,2,3,3};
        DistributeCandies distributeCandiesObj = new DistributeCandies();
        int output = distributeCandiesObj.distributeCandies(input);
        System.out.println(output);
        */

        /*
        // https://leetcode.com/problems/encode-and-decode-tinyurl/description/
        EncodeAndDecodeTinyURL encodeAndDecodeTinyURLObj = new EncodeAndDecodeTinyURL();
        System.out.println(encodeAndDecodeTinyURLObj.decode(encodeAndDecodeTinyURLObj.encode("www.google.com")));
        */

        /*

        */

        /*
        // https://leetcode.com/problems/island-perimeter/
        int[][] input = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        IslandPerimeter islandPerimeterObj = new IslandPerimeter();
        System.out.println(islandPerimeterObj.islandPerimeter(input));
        */

        /*
        // https://leetcode.com/problems/next-greater-element-i/description/
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        NextGreaterElementI nextGreaterElementIObj = new NextGreaterElementI();
        System.out.println(Arrays.toString(nextGreaterElementIObj.nextGreaterElement(nums1,nums2)));
        */

        /*
        // https://leetcode.com/problems/longest-uncommon-subsequence-i/description/
        LongestUncommonSubsequenceI longestUncommonSubsequenceIObj = new LongestUncommonSubsequenceI();
        System.out.println(longestUncommonSubsequenceIObj.findLUSlength("aefawfawfawfaw","aefawfeawfwafwaef"));
        */

        //////////////////////////////////////////////////////////////////
        // Practicing recursion
        // http://codingbat.com/java/Recursion-1

        /*
        // http://codingbat.com/prob/p154669
        Factorial factorialObj = new Factorial();
        System.out.println(factorialObj.factorial(5));
        */

        /*
        // http://codingbat.com/prob/p183649
        BunnyEars bunnyEarsObj = new BunnyEars();
        System.out.println(bunnyEarsObj.bunnyEars(10));
        */

        /*
        // http://codingbat.com/prob/p120015
        Fibonacci fibonacciObj = new Fibonacci();
        System.out.println(fibonacciObj.fibonacci(7));
        */

        /*
        // http://codingbat.com/prob/p107330
        BunnyEars2 bunnyEars2Obj = new BunnyEars2();
        System.out.println(bunnyEars2Obj.bunnyEars2(2));
        */

        /*
        // http://codingbat.com/prob/p194781
        Triangle triangleObj = new Triangle();
        System.out.println(triangleObj.triangle(3));
        */

        /*
        // http://codingbat.com/prob/p163932
        SumDigits sumDigitsObj = new SumDigits();
        System.out.println(sumDigitsObj.sumDigits(123));
        */

        /*
        // http://codingbat.com/prob/p101409
        Count7 count7Obj = new Count7();
        System.out.println(count7Obj.count7(717));
        */

        // http://codingbat.com/prob/p192383

        /////////////////////////////////////////////////////////////////

        // https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

        /*
        // https://leetcode.com/problems/nim-game/description/
        NimGame nimGameObj = new NimGame();
        System.out.println(nimGameObj.canWinNim(8));
        */

        /*
        // https://leetcode.com/problems/single-number/description/
        int[] input = {1,2,3,3,2,1,4};
        SingleNumber singleNumberObj = new SingleNumber();
        System.out.println(singleNumberObj.singleNumber(input));
        */

        /*
        // https://leetcode.com/problems/binary-number-with-alternating-bits/description/
        BinaryNumberWithAlternatingBits binaryNumberWithAlternatingBitsObj = new BinaryNumberWithAlternatingBits();
        System.out.println(binaryNumberWithAlternatingBitsObj.hasAlternatingBits(3));
        */

        /*
        // https://leetcode.com/problems/max-consecutive-ones/description/
        MaxConsecutiveOnes maxConsecutiveOnesObj = new MaxConsecutiveOnes();
        int[] input = {0,0,1,1,0,0,1,1,1};
        System.out.println(maxConsecutiveOnesObj.findMaxConsecutiveOnes(input));
        */

        // https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

        /*
        // https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
        KdiffPairsInanArray kdiffPairsInanArrayObj = new KdiffPairsInanArray();
        int[] input = {3, 1, 4, 1, 5};
        System.out.println(kdiffPairsInanArrayObj.findPairs(input, 2));
*/
        /*
        t1 t1Obj = new t1();
        //System.out.println(t1Obj.numMoves(3214,4321));
        int[] a = {1234,4321};
        int[] m = {2345,3214};
        System.out.println(t1Obj.minimumMoves(a,m));
        */

        /*
        t2 t2Obj = new t2();
        int[] input = {1,2,3};
        System.out.println(t2Obj.subarraySum(input));
        */

        /*
        t3 t3Obj = new t3();
        int[] input = {1,4,5,2,6};
        System.out.println(t3Obj.longestSubSeq(input));
        */

        /*
        // https://leetcode.com/problems/counting-bits/description/

        CountingBits countingBitsObj = new CountingBits();
        int[] res = countingBitsObj.countBits(5);
        System.out.println((Arrays.toString(res)));
        */

        /*
        // https://leetcode.com/problems/assign-cookies/description/
        AssignCookies assignCookies = new AssignCookies();
        int[] g = {2,1};
        int[] s = {3,1,2};
        System.out.println(assignCookies.findContentChildren(g,s));
        */

        /*
        // https://leetcode.com/problems/power-of-four/description/
        PowerOfFour powerOfFour = new PowerOfFour();

        if(powerOfFour.isPowerOfFour(16))
            System.out.println("16 - yes");

        else
            System.out.println("16 - no");

        if(powerOfFour.isPowerOfFour(12))
            System.out.println("12 - yes");

        else
            System.out.println("12 - no");

        if(powerOfFour.isPowerOfFour(256))
            System.out.println("256 - yes");

        else
            System.out.println("256 - no");
        */

        /*
        // https://leetcode.com/problems/reverse-vowels-of-a-string/description/
        ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();
        String str = reverseVowelsOfAString.reverseVowels("hello");
        System.out.println(str);
        */

        /*
        // https://leetcode.com/problems/majority-element-ii/description/
        MajorityElementII majorityElementII = new MajorityElementII();
        int[] nums = {1,1,1,1,2,3,4,5,5,5};
        List<Integer> l;
        l = majorityElementII.majorityElement(nums);
        for (Integer i : l)
        {
            System.out.println(i);
        }
        */

        /*
        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        int n = factorialTrailingZeroes.trailingZeroes(627);
        System.out.println(n);
        */

        /*
        // https://leetcode.com/problems/repeated-string-match/description/
        RepeatedStringMatch repeatedStringMatch = new RepeatedStringMatch();
        int n = repeatedStringMatch.repeatedStringMatch("abcd", "cdabcdabcda");
        System.out.println(n);
        */

        /* //incomplete
        // https://leetcode.com/problems/longest-word-in-dictionary/description/
        LongestWordInDictionary longestWordInDictionary = new LongestWordInDictionary();
        String[] words = {"rac","rs","ra","on","r","otif","o","onpdu","rsf","rs","ot","oti","racy","onpd"};
        String result = longestWordInDictionary.longestWord(words);
        System.out.println(result);
        */

        /*
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        if(toeplitzMatrix.isToeplitzMatrix(matrix))
            System.out.println("True");
        else
            System.out.println("False");
        */

        /*
        MaxChunksToMakeSortedV1 maxChunksToMakeSortedV1 = new MaxChunksToMakeSortedV1();
        int[] arr = {1,2,3,4,5,0};
        System.out.println(maxChunksToMakeSortedV1.maxChunksToSorted(arr));
        */

        /*
        Q1 q1 = new Q1();
        int num = q1.solution("bb12");
        System.out.println(num);
        */

        /*
        Q2 q2 = new Q2();
        int[] A = {200,200,201};
        int[] B = {2,3,5};
        int floorStop = q2.solution(A,B,5,2,200);
        System.out.println(floorStop);
        */

        /*
        Q3 q3 = new Q3();
        int[][] A = {{5,4,4},
                {4,3,4},
                {3,2,4},
                {2,2,2},
                {3,3,4},
                {1,4,4},
                {4,1,1}
                };
        int total = q3.solution(A);
        System.out.println(total);
        */

        /*
        // https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/#
        algo762 algo762Obj = new algo762();
        System.out.println(algo762Obj.countPrimeSetBits(1,3));
        */

        /*// https://leetcode.com/problems/number-of-1-bits/description/
        Algo191 algo191Obj = new Algo191();
        System.out.println(algo191Obj.hammingWeight(111234));*/

        /*
        // https://leetcode.com/problems/reverse-bits/description/
        Algo190 algo190 = new Algo190();
        System.out.println(algo190.reverseBits(1));
        */

        /*
        // https://leetcode.com/problems/reverse-integer/description/
        Algo7 algo7 =  new Algo7();
        System.out.println(algo7.reverse(1999999999));
        */

    }
}
