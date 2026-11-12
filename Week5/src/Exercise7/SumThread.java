package Exercise7;


public class SumThread extends Thread {

    private int n;

    public SumThread(int n) {
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
