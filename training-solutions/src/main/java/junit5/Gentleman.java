package junit5;

public class Gentleman {
    public String sayHello(String name){
        if (name==null){
            name="Anonymous";
        }
        return "Hello "+name;
    }
}
