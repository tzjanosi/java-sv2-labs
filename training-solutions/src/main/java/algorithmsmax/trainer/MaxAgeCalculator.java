package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    Trainer getTrainerWithMaxAge(List<Trainer> trainers){
        int maxAge=trainers.get(0).getAge();
        Trainer theOldestTrainer=trainers.get(0);
        for(Trainer trainer:trainers){
            if(trainer.getAge()>maxAge){
                maxAge=trainer.getAge();
                theOldestTrainer=trainer;
            }
        }
        return theOldestTrainer;
    }
}
