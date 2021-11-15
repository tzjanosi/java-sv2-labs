package introexceptiontrace;
import java.util.Arrays;
import java.util.Random;


public class RandomOperations {
    private Random random = new Random();

    public int[] getNumbers() {
        int lengthOfArray = random.nextInt(10) + 1;
        int[] numbers = new int[lengthOfArray];
        System.out.println("A for ciklusban <= helyett < használva lefut.");
        //for (int i = 0; i <= lengthOfArray; i++) {
        for (int i = 0; i < lengthOfArray; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Az eredeti: "+ Arrays.toString(numbers));
        return numbers;
    }
}
