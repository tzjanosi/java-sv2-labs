package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{
    private int passengers;
    private int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.passengers = passengers;
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        this.passengers=passengers>maxPassengers?maxPassengers:passengers;
        return passengers-this.passengers;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
