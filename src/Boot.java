public class Boot {
    public static void main(String[] args){

        //https://leetcode.com/problems/keyboard-row/description/
        String[] input = {"Hello", "Alaska", "Dad", "Peace"};
        KeyboardRow keyboardRowObj = new KeyboardRow();
        String[] output = keyboardRowObj.findWords(input);
        for(String out: output){
            System.out.println(out);
        }

    }
}
