package Exercise10;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise10 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

   
        try (BufferedReader reader =
             new BufferedReader(new FileReader("student.csv"))) {

            String line;

      
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                names.add(line.trim());
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
            return;
        }

 
        System.out.println("Student names in A-Z order:");

        names.stream()
             .filter(name -> !name.isEmpty())
             .sorted(String.CASE_INSENSITIVE_ORDER)
             .forEach(name -> System.out.println(name));
    }
}

