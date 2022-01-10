package collectionsset;

import java.util.*;

public class QuestionGame {
    private List<RightAnswer> answersList=new ArrayList<>();
    private Random rnd=new Random(1984);

    public QuestionGame(List<RightAnswer> answersList) {
        this.answersList = answersList;
    }

    public void add(RightAnswer rightAnswer){
        answersList.add(rightAnswer);
    }

    public Set<String> drawWinners(){
        RightAnswer rightAnswer;
        Set<String> winners=new HashSet<>();
        for(int i=1;i<=5;i++){
            if(answersList.isEmpty()){
                throw new IllegalArgumentException("Not enough right answers!");
            }
            int chosen=rnd.nextInt(answersList.size());
            rightAnswer=answersList.get(chosen);
            winners.add(rightAnswer.getName());
            removeNameFromAnswersList(rightAnswer);
        }
        return winners;
    }
    private void removeNameFromAnswersList(RightAnswer rightAnswerToRemove){
        while(answersList.contains(rightAnswerToRemove)){
            answersList.remove(rightAnswerToRemove);
        }
    }
}
