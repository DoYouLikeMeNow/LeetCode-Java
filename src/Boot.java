public class Boot {
    public static void main(String[] args){
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

        // https://leetcode.com/problems/distribute-candies/description/
        int[] input = {1,1,2,2,3,3};
        DistributeCandies distributeCandiesObj = new DistributeCandies();
        int output = distributeCandiesObj.distributeCandies(input);
        System.out.println(output);
    }
}
