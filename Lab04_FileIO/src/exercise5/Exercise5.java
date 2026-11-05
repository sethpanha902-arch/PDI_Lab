package exercise5;
import java.io.*;
import java.util.*;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
            System.out.println("Existing student data loaded.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            input.close();
            return;
        }
        System.out.println("\n========== ADD 3 STUDENTS ==========");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nStudent " + i);
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter ID: ");
            String id = input.nextLine();
            System.out.print("Enter gender: ");
            String gender = input.nextLine();
            students.add(name + "," + id + "," + gender);
        }
        Collections.sort(students, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String name1 = s1.split(",")[0].trim();
                String name2 = s2.split(",")[0].trim();
                return name1.compareToIgnoreCase(name2);
            }
        });
        try {
            FileWriter writer = new FileWriter(
                "data/StudentData.csv"
            );
            writer.write("Name,ID,Gender\n");
            for (String student : students) {
                writer.write(student + "\n");
            }
            writer.close();
            System.out.println("\nStudent data updated successfully.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\n========== SORTED STUDENT LIST ==========");
        for (String student : students) {
            String[] data = student.split(",");
            System.out.println(
                data[0] + "\t" + data[1] + "\t" + data[2]
            );
        }
        System.out.println("\nTotal students: " + students.size());
        input.close();
    }
}
