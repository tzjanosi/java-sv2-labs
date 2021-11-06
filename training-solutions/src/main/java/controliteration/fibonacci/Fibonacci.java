package controliteration.fibonacci;

public class Fibonacci {
    int calculateFibonacci(int n){
        if(n==0 || n==1) {
            return n;
        }
        else{
            int n_2=0;
            int n_1=1;
            int actualValue=1;
            for(int i=2;i<=n;i++){
                actualValue=n_2+n_1;
                n_2=n_1;
                n_1=actualValue;
            }
            return actualValue;
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        System.out.println("0 -> "+fibonacci.calculateFibonacci(0));
        System.out.println("1 -> "+fibonacci.calculateFibonacci(1));
        System.out.println("2 -> "+fibonacci.calculateFibonacci(2));
        System.out.println("3 -> "+fibonacci.calculateFibonacci(3));
        System.out.println("5 -> "+fibonacci.calculateFibonacci(5));
        System.out.println("10 -> "+fibonacci.calculateFibonacci(10));
        System.out.println("20 -> "+fibonacci.calculateFibonacci(20));
        System.out.println("40 -> "+fibonacci.calculateFibonacci(40));
        System.out.println("46 -> "+fibonacci.calculateFibonacci(46));
    }
}
