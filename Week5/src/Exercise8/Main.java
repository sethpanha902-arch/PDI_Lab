package Exercise8;


public class Main {
    public static void main(String[] args) {

        SumTask sumTask = new SumTask(100);
        PrimeTask primeTask = new PrimeTask();
        CSVTask csvTask = new CSVTask();

        Thread thread1 = new Thread(sumTask);
        Thread thread2 = new Thread(primeTask);
        Thread thread3 = new Thread(csvTask);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

