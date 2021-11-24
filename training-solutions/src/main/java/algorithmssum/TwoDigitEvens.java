package algorithmssum;

public class TwoDigitEvens {
    public int getSum(){
        int total=0;
        for(int i=11; i<=99; i+=2){
            if(i%5!=0){
                total+=i;
            }
        }
    return total;
    }
}
