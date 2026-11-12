package Exercise7;


public class Main {
    public static void main(String[] args) {

        SumThread thread1 = new SumThread(100);
        PrimeThread thread2 = new PrimeThread();
        CVSThread thread3 = new CVSThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
