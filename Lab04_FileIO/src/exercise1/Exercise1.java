package exercise1;
import java.io.*;
import java.util.*;
public class Exercise1 {
    public static void main(String[] args) {
        Random random = new Random();
        File folder = new File("data");
        if (!folder.exists()) {
            folder.mkdirs();
        }
        try {

            FileWriter writer = new FileWriter(
                "data/LuckyNumber.csv"
            );

            for (int i = 1; i <= 500; i++) {

                int number = random.nextInt(100) + 1;

                writer.write(number + "\n");
            }
            writer.close();

            System.out.println("500 random numbers saved successfully.");

        }
        catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
        try {

            BufferedReader reader = new BufferedReader(
                new FileReader("data/LuckyNumber.csv")
            );
            String line;
            int count = 0;
            System.out.println("\n========== LUCKY NUMBERS ==========");
            while ((line = reader.readLine()) != null) {
                System.out.print(line + "\t");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            reader.close();

            System.out.println("\n\nTotal numbers: " + count);
        }
        catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}
