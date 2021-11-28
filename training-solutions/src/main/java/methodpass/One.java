package methodpass;

public class One {
    public static void main(String[] args) {
        One one=new One();
        int number=69;
        System.out.println(number);
        number++;
        System.out.println(number);
        System.out.println(one.addOne(number));
        System.out.println(number);
    }
    public int addOne(int number){
        number++;
        return number;
    }
}
