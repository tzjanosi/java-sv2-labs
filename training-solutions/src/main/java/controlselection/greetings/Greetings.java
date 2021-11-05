package controlselection.greetings;

import java.util.Random;

public class Greetings {
    public String greeting(int hour, int minute){
        if(hour>22 || hour<5 || (hour==5 && minute==0)){
            return "jó éjt";
        }
        if((hour==5 && minute>0) || hour<9){
            return "jó reggelt";
        }
        if(hour<18 || (hour==18 && minute<30)){
            return "jó napot";
        }
        else{
            return "jó estét";
        }
    }

    public static void main(String[] args) {
        Greetings greetings=new Greetings();
        Random rnd = new Random();
        int hour;
        int minute;
        for(int i=0;i<16;i++){
            hour=rnd.nextInt(24);
            minute=rnd.nextInt(60);

            System.out.println(hour+":"+minute+" - "+greetings.greeting(hour,minute));
        }
    }
}
