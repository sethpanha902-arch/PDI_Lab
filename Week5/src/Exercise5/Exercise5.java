package Exercise5;
import java.math.BigInteger;
public class Exercise5 {
    public static BigInteger factorialLoop(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static BigInteger factorialRecursive(int n) {

        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(n)
                .multiply(factorialRecursive(n - 1));
    }

    public static void main(String[] args) {

        int[] numbers = {3, 6, 10, 50};

        for (int n : numbers) {

            System.out.println("Number: " + n);

            System.out.println(
                "Procedural: " + factorialLoop(n)
            );

            System.out.println(
                "Recursive: " + factorialRecursive(n)
            );

            System.out.println();
        }
    }
}
