package algorithmsdecision;

public class Prime {
    public boolean isPrime(int number){
        boolean prim=true;
        if(number<2) {
            return false;
        }
        else {
            long i = 2;
            while (prim && i <= Math.sqrt(number)) {
                if ((number % i) == 0) {
                    prim = false;
                }
                i++;
            }
            return prim;
        }
    }
}
