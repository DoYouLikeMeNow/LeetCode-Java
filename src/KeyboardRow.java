//https://leetcode.com/problems/keyboard-row/description/

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        List<String> finalWords = new ArrayList<>();

        String r1 = "qwertyuiopQWERTYUIOP";    // rNum = 1,    row 1
        String r2 = "asdfghjklASDFGHJKL";    // rNum = 2,     row 2
        String r3 = "zxcvbnmZXCVBNM";    // rNum = 3,       row 3

        int rNum = 0;   // row number
        boolean inLine = true; // all characters are in a line

        for (String word: words) {
            for(int i = 0; i < word.length(); i++){
                if(i==0){
                    if(r1.indexOf(word.charAt(i))>=0){
                        rNum = 1;
                    }

                    else if(r2.indexOf(word.charAt(i))>=0){
                        rNum = 2;
                    }

                    else if(r3.indexOf(word.charAt(i))>=0){
                        rNum = 3;
                    }
                }

                else{
                    if(r1.indexOf(word.charAt(i))>=0){
                        if(rNum!=1){
                            inLine = false;
                            break;
                        }
                    }

                    else if(r2.indexOf(word.charAt(i))>=0){
                        if(rNum!=2){
                            inLine = false;
                            break;
                        }
                    }

                    else if(r3.indexOf(word.charAt(i))>=0){
                        if(rNum!=3){
                            inLine = false;
                            break;
                        }
                    }
                }
            }
            if(inLine){
                finalWords.add(word);
            }

            inLine = true;
            rNum = 0;
        }

        String[] ans = new String[finalWords.size()];
        finalWords.toArray(ans);

        return ans;
    }
}
