package Exercise8;


public class SumTask implements Runnable {

    private int n;

    public SumTask(int n) {
        this.n = n;
    }

    @Override
    public void run() {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum from 1 to " + n + " = " + sum);
    }
}
