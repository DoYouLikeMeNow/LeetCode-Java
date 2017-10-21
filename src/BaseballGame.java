import java.util.*;

// https://leetcode.com/problems/baseball-game/description/
public class BaseballGame {
    public int calPoints(String[] ops) {
        int totalScore = 0;
        List<Integer> scoreList = new ArrayList<>();

        for(String score: ops){
            if(score.contains("+")){
                scoreList.add(scoreList.get(scoreList.size()-1)+scoreList.get(scoreList.size()-2));
                totalScore+=scoreList.get(scoreList.size()-1);
            }

            else if(score.contains("D")){
                scoreList.add(scoreList.get(scoreList.size()-1)*2);
                totalScore+=scoreList.get(scoreList.size()-1);
            }

            else if(score.contains("C")){
                totalScore-=scoreList.get(scoreList.size()-1);
                scoreList.remove(scoreList.size()-1);
            }

            else{
                scoreList.add(Integer.parseInt(score));
                totalScore+=scoreList.get(scoreList.size()-1);
            }
        }

        return totalScore;
    }
}
