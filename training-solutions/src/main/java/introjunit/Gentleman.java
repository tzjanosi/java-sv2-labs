package introjunit;

public class Gentleman {
    public String sayHello(String name){
        if (name==null){
            name="Anonymous";
        }
        return "Hello "+name;
    }
}
