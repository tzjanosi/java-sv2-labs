package algorithmssum;

import java.util.List;

public class SalesAmountSumCalculator {
    public int sumSalesAmount(List<Salesperson> salesPersons){
        int totalSales=0;
        for(Salesperson person:salesPersons){
            totalSales+=person.getAmount();
        }
    return totalSales;
    }
}
