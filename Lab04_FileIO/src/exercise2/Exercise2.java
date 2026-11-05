package exercise2;
import java.io.*;
import java.util.*;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter number of files: ");
        int n = input.nextInt();
        File folder = new File("data/Ex2LuckyNumber");
        if (!folder.exists()) {
            folder.mkdirs();
        }
        for (int i = 1; i <= n; i++) {

            try {
                FileWriter writer = new FileWriter(
                    "data/Ex2LuckyNumber/file" + i + ".csv"
                );
                for (int j = 1; j <= 10; j++) {
                    int number = random.nextInt(100) + 1;
                    writer.write(number + "\n");
                }
                writer.close();
                System.out.println("file" + i + ".csv created.");
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            try {

                BufferedReader reader = new BufferedReader(
                    new FileReader(
                        "data/Ex2LuckyNumber/file" + i + ".csv"
                    )
                );

                String line;
                while ((line = reader.readLine()) != null) {

                    numbers.add(Integer.parseInt(line));
                }

                reader.close();
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        if (!numbers.isEmpty()) {
            int max = Collections.max(numbers);
            int min = Collections.min(numbers);
            System.out.println("\n========== RESULTS ==========");
            System.out.println("All numbers: " + numbers);
            System.out.println("Total numbers: " + numbers.size());
            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
        }
        input.close();
    }
}
