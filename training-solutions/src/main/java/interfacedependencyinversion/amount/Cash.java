package interfacedependencyinversion.amount;

public class Cash implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        int output= (int) (5*Math.round(amount/5.0));
        return output;
    }
}
