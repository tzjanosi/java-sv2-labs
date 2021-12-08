package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> shipList=new ArrayList<>();
    private int waitingPersons;
    private int waitingCargo;

    public void addShip(Ship ship){
        shipList.add(ship);
    }

    public void loadShip(int passengers, int cargoWeight){
        for(int i=0;i<shipList.size();i++){
            if(passengers>0 && shipList.get(i) instanceof CanCarryPassengers){
                passengers=((CanCarryPassengers) shipList.get(i)).loadPassenger(passengers);
            }
            if(cargoWeight>0 && shipList.get(i) instanceof CanCarryGoods){
                cargoWeight=((CanCarryGoods) shipList.get(i)).loadCargo(cargoWeight);
            }
        }
        waitingPersons=passengers;
        waitingCargo=cargoWeight;
    }

    public int getWaitingPeople() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
