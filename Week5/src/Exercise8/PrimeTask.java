package Exercise8;


public class PrimeTask implements Runnable {

    @Override
    public void run() {

        System.out.println("Prime numbers from 1 to 100:");

        for (int number = 2; number <= 100; number++) {

            boolean isPrime = true;

            for (int i = 2; i * i <= number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
}

