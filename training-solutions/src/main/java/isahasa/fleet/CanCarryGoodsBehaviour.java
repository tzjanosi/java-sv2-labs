package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods{
    private int cargoWeight;
    private int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.cargoWeight = cargoWeight;
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        this.cargoWeight=cargoWeight>maxCargoWeight?maxCargoWeight:cargoWeight;
        return cargoWeight-this.cargoWeight;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
