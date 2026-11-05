package exercise3;
import java.io.*;
import java.util.*;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        File folder = new File("data");

        if (!folder.exists()) {
            folder.mkdirs();
        }

     
        try {

            FileWriter writer = new FileWriter(
                "data/StudentData.csv"
            );

      
            writer.write("Name,ID,Gender\n");

      
            for (int i = 1; i <= 3; i++) {

                System.out.println("\nStudent " + i);

                System.out.print("Enter name: ");
                String name = input.nextLine();

                System.out.print("Enter ID: ");
                String id = input.nextLine();

                System.out.print("Enter gender: ");
                String gender = input.nextLine();

     
                writer.write(name + "," + id + "," + gender + "\n");
            }

            writer.close();

            System.out.println("\nStudent data saved successfully.");
        }
        catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
        input.close();
    }
}
