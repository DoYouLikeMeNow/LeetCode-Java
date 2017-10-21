import java.util.*;

// https://leetcode.com/problems/baseball-game/description/
public class BaseballGame {
    public int calPoints(String[] ops) {
        int totalScore = 0;
        List<Integer> scoreList = new ArrayList<>();

        for(String score: ops){
            if(score.contains("+")){
                scoreList.add(scoreList.get(scoreList.size()-1)+scoreList.get(scoreList.size()-2));
            }

            else if(score.contains("D")){
                scoreList.add(scoreList.get(scoreList.size()-1)*2);
            }

            else if(score.contains("C")){
                scoreList.remove(scoreList.size()-1);
            }

            else{
                scoreList.add(Integer.parseInt(score));
            }
        }

        for (Integer sc : scoreList) {
            totalScore += sc;
        }

        return totalScore;
    }
}
