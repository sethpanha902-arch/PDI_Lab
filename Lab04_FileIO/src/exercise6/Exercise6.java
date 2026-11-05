package exercise6;
import java.io.*;
import java.util.*;
public class Exercise6 {
    public static void readCSV() {
        int total = 0;
        int male = 0;
        int female = 0;
        try {

            BufferedReader reader =
                new BufferedReader(
                    new FileReader("data/CandidatePerformanceTest.csv")
                );

            String line;
            String header = reader.readLine();
            System.out.println(header);
            System.out.println("--------------------------------");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                String gender = data[1].trim();
                System.out.println(line);
                total++;
                if (gender.equalsIgnoreCase("Male")) {
                    male++;
                }
                else if (gender.equalsIgnoreCase("Female")) {
                    female++;
                }
            }
            reader.close();
            double malePercentage = (male * 100.0) / total;
            double femalePercentage = (female * 100.0) / total;
            System.out.println("\n========== SUMMARY ==========");
            System.out.println("Total candidates: " + total);
            System.out.println("Male candidates: " + male);
            System.out.println("Female candidates: " + female);
            System.out.printf("Male percentage: %.2f%%%n",
                malePercentage);
            System.out.printf("Female percentage: %.2f%%%n",
                femalePercentage);
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        readCSV();
    }
}
