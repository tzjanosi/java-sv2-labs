package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan(List<BankAccount> bankAccountList,int limit){
        int count=0;
        for(BankAccount bankAccount:bankAccountList){
            if(bankAccount.getBalance()>limit){
                count++;
            }
        }
        return count;
    }
}
