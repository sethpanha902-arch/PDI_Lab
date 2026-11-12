package Exercise11;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Exercise11 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3, 8};
        int max = IntStream.of(numbers)
                           .max()
                           .orElseThrow();
        int min = IntStream.of(numbers)
                           .min()
                           .orElseThrow();
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }   
}
