package algorithmscount;

public class Digits {
    public int getCountOfNumbers(){
        int count=0;
        int firstDigit;
        int secondDigit;
        for(int i=10;i<=99;i++){
            secondDigit=i%10;
            firstDigit=(i-secondDigit)/10;
            if(Math.abs(firstDigit-secondDigit)==5){
                count++;
            }
        }
        return count;
    }
}
