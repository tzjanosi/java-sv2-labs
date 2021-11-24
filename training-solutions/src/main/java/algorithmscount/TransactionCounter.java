package algorithmscount;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactionList, int limit){
        int count=0;
        for(Transaction transaction:transactionList){
            if(transaction.getAmount()<limit){
                count++;
            }
        }
        return count;
    }
}
