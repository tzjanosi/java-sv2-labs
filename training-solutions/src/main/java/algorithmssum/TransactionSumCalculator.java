package algorithmssum;

import java.util.List;

public class TransactionSumCalculator {
    public int sumAmountOfCreditEntries(List<Transaction> transactions){
        int totalAmount=0;
        for(Transaction transaction:transactions){
            if(transaction.getTransactionOperation()==TransactionOperation.CREDIT){
                totalAmount+= transaction.getAmount();
            }
        }
    return totalAmount;
    }
}
