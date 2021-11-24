package algorithmsmax.sales;

import java.util.List;

public class Sales {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales){
        Salesperson salesPersonWithMaxSalesAmount=sales.get(0);
        int maxAmount=salesPersonWithMaxSalesAmount.getAmount();
        for(Salesperson sale:sales){
            if(sale.getAmount()>maxAmount){
                salesPersonWithMaxSalesAmount=sale;
                maxAmount=salesPersonWithMaxSalesAmount.getAmount();
            }
        }
        return salesPersonWithMaxSalesAmount;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
        Salesperson salesPersonWithMaxDifference=sales.get(0);
        int maxGain=salesPersonWithMaxDifference.getDifferenceFromTarget();
        for(Salesperson sale:sales){
            if(sale.getDifferenceFromTarget()>maxGain){
                salesPersonWithMaxDifference=sale;
                maxGain=salesPersonWithMaxDifference.getDifferenceFromTarget();
            }
        }
        return salesPersonWithMaxDifference;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales){
        Salesperson salesPersonWithMinDifference=sales.get(0);
        int maxLoss=salesPersonWithMinDifference.getDifferenceFromTarget();
        for(Salesperson sale:sales){
            if(sale.getDifferenceFromTarget()<maxLoss){
                salesPersonWithMinDifference=sale;
                maxLoss=salesPersonWithMinDifference.getDifferenceFromTarget();
            }
        }
        return salesPersonWithMinDifference;
    }
}
