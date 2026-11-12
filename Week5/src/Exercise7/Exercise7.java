package Exercise7;

import java.util.*;
import java.io.*;

class SumThread extends Thread {

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

class PrimeThread extends Thread {

    @Override
    public void run() {

        System.out.println("Prime numbers from 1 to 100:");

        for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

class StudentThread extends Thread {

    @Override
    public void run() {

        ArrayList<String> students = new ArrayList<>();

        try (BufferedReader br =
             new BufferedReader(new FileReader("students.csv"))) {

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                students.add(line);
            }

            System.out.println("Student Information:");

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total students: " + students.size());

        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
    }
}
public class Exercise7 {
    public static void main(String[] args) {
        SumThread t1 = new SumThread(100);
        PrimeThread t2 = new PrimeThread();
        StudentThread t3 = new StudentThread();
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads completed.");
    }
}