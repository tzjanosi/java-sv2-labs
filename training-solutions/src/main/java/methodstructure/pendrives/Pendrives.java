package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> pendrivesList){
        Pendrive winner= pendrivesList.get(0);
        for(Pendrive pendrive:pendrivesList){
            if(pendrive.comparePricePerCapacity(winner)==-1){
                winner=pendrive;
            }
        }
        return winner;
    }
    public Pendrive getCheapest(List<Pendrive>pendrivesList){
        Pendrive winner= pendrivesList.get(0);
        for(Pendrive pendrive:pendrivesList){
            if(pendrive.isCheaperThan(winner)){
                winner=pendrive;
            }
        }
        return winner;
    }
    public void risePriceWhereCapacity(List<Pendrive> pendrivesList, int percent, int capacity){
        for(Pendrive pendrive:pendrivesList){
            if(pendrive.getCapacity()==capacity){
                pendrive.risePrice(percent);
            }
        }
    }
}

