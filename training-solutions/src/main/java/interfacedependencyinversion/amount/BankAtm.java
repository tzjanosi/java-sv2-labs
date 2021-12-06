package interfacedependencyinversion.amount;

public class BankAtm implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        return 1000*((amount+999)/1000);
    }
}
