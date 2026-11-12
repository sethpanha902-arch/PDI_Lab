package Exercise8;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Exercise7.Student;

public class CSVTask implements Runnable {

    @Override
    public void run() {

        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader reader =
             new BufferedReader(new FileReader("student.csv"))) {

            String line;

            reader.readLine(); 

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 4) {

                    String name = data[0].trim();
                    String id = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    String gender = data[3].trim();

                    students.add(
                        new Student(name, id, age, gender)
                    );
                }
            }

            System.out.println("Student List:");

            for (Student student : students) {
                student.displayInfo();
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid student age in CSV file.");
        }
    }
}

