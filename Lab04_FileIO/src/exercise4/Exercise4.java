package exercise4;
import java.io.*;
import java.util.*;
public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

      
        try {

            BufferedReader reader = new BufferedReader(
                new FileReader("data/StudentData.csv")
            );

            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                students.add(line);

            }

            reader.close();

            System.out.println("Student data loaded successfully.");

        }
        catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }
        System.out.println("\n========== STUDENT INFORMATION ==========");

        System.out.println("Name\t\tID\tGender");

        for (String student : students) {

            String[] data = student.split(",");

            String name = data[0].trim();
            String id = data[1].trim();
            String gender = data[2].trim();

            System.out.println(
                name + "\t\t" + id + "\t" + gender
            );
        }

        System.out.println("\nTotal students: " + students.size());

    }
}
