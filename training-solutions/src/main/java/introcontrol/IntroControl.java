package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number){
        int output=(number<=10?number:number-10);
        return output;
    }
    public String describeNumber(int number){
        String output=(number==0?"zero":"not zero");
        return output;
    }
    public String greetingToJoe(String name){
        String output=(name.equals("Joe")?"Hello Joe":"");
        return output;
    }
    public int calculateBonus(int sale){
        int output=(sale>=1000000?sale/10:0);
        return output;
    }
    public int calculateConsumption(int prev, int next){
        int output=(next>=prev?next-prev:10000-prev+next);
        return output;
    }
    public void printNumbers(int max){
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }
    public void printNumbersBetween(int min, int max){
        int lowerLimit;
        int upperLimit;
        if(min>max) {
            int temp=min;
            lowerLimit=max;
            upperLimit=temp;
        }
        else{
            lowerLimit=min;
            upperLimit=max;
        }
        lowerLimit=lowerLimit<0?0:lowerLimit;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b){
        if(a<=b) {
            for (int i = a; i <= b; i++) {
                if(i>=0){
                    System.out.println(i);
                }
            }
        }
        else{
            for (int i = a; i >= b; i--) {
                if(i>=0){
                    System.out.println(i);
                }
            }
        }
    }
    public void printOddNumbers(int max){
        for (int i = 1; i <= max; i++) {
            if(i%2==1) {
                System.out.println(i);
            }
        }
    }
}
