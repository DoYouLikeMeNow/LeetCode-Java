import GoldmanSachs.Q1;
import GoldmanSachs.Q2;
import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
import contests.MaxChunksToMakeSortedV1;
import contests.ToeplitzMatrix;
import recursionPractice.*;
import imc.*;
import temp.Rough1;
import temp.Rough2;

import javax.security.sasl.SaslServer;
import java.lang.reflect.Array;
import java.util.*;
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

        /*
        // https://leetcode.com/problems/word-pattern/description/
        Algo290 algo290 = new Algo290();
        if(algo290.wordPattern("jquery", "jquery"))
            System.out.println("True");

        else
            System.out.println("False");
        */

        /*
        // https://leetcode.com/problems/repeated-dna-sequences/description/
        Algo187 algo187 = new Algo187();
        System.out.println(algo187.findRepeatedDnaSequences("AAAAAAAAAAAA"));
        */

        /*
        Algo674 algo674 = new Algo674();
        int[] input = {2};
        System.out.println(algo674.findLengthOfLCIS(input));
        */

        /*
        // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
        Algo121 algo121 = new Algo121();
        int[] input = {6,6,6,7,6,6};
        System.out.println(algo121.maxProfit(input));
        */

        /*
        // https://leetcode.com/problems/total-hamming-distance/description/
        Algo477 algo477 = new Algo477();
        int[] input = {346450570,966562973,457581303,222998192,364627507,169160189,954431542,221061882,240341464,2245441,231904888,735611889,365662644,741343641,855432971,6410579,954376059,436042748,1757003,612662010,619293283,756454019,412485671,362438559,34216799,142080553,739017385,767259094,477271201,645653662,266228943,301408300,648353405,543652957,779813961,33523464,581122512,963411206,25440862,235321881,537459840,564290176,530181458,643091781,951346494,264772743,242353595,253371384,100262534,923703199,520381430,497283426,629165236,170643624,116719823,850474028,58812742,416255752,301680516,135541845,719123095,56870927,992425752,194127615,675165512,203169436,169712122,493351238,319895999,340486752,309900187,844598934,307377068,388210841,397263679,76973008,693168540,777845383,514392792,423470900,514610142,136010125,792549045,323715552,111204613,498136379,79844425,353928756,743878480,863304173,946695057,190460954,119598426,632009346,519938738,292388501,523930549,810762921,501651610,30789726,732344533,285785174,63479657,750706287};
        System.out.println(algo477.totalHammingDistance(input));
        */

        /*
        // https://leetcode.com/problems/ugly-number/description/
        Algo263 algo263 = new Algo263();
        System.out.println(algo263.isUgly(-2147483648));
        */

        /*
        Q1 q1 = new Q1();
        int[] input = {0,0,0,0,0,0,0,0};
        System.out.println(q1.secondSmallest(input));
        */

        /*
        Q2 q2 = new Q2();
        System.out.println(q2.countSteps(5));
        */

        /*
        // https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
        int[] input = {4,3,2,7,8,2,3,1,2,2,2};
        Algo442 algo442 = new Algo442();
        System.out.println(algo442.findDuplicates(input));
        */

        /*
        // https://leetcode.com/problems/number-of-segments-in-a-string/description/
        Algo434 algo434 = new Algo434();
        System.out.println(algo434.countSegments(", , , ,        a, eaefa"));
        */

        /*
        Algo96 algo96 = new Algo96();
        System.out.println(algo96.numTrees(100));
        */

        /*
        Rough1 rough1 = new Rough1();
        String[] input = {"GoCardinals","Doge","nExTcapITalxnextcapital","ThreeSThree"};
        String[] output = rough1.passModify(input);

        for(String str : output)
        {
            System.out.println(str);
        }
        */

        /*
        Rough2 rough2 = new Rough2();
        int[][] input = {{1,10},{1,6},{2,8},{3,5}};
        System.out.println(rough2.maxFlorists(9,input));
        */

        /*
        // https://leetcode.com/problems/valid-square/description/
        Algo593 algo593 = new Algo593();
        int[] p1 = {0,0}, p2 = {1,1}, p3 = {1,0}, p4 = {0,1};

        if(algo593.validSquare(p1, p2, p3, p4))
        {
            System.out.println("True");
        }

        else
        {
            System.out.println("False");
        }
        */

        /*
        // https://leetcode.com/problems/license-key-formatting/description/
        Algo482 algo482Obj = new Algo482();
        String outS = algo482Obj.licenseKeyFormatting("5F3Z-2e-9-w",4);
        System.out.println(outS);
        */

        Algo565 algo565 = new Algo565();
        int[] input = {5,4,0,3,1,6,2};
        System.out.println(algo565.arrayNesting(input));
    }
}