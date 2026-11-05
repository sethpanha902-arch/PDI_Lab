package exercise7;
import java.io.*;
import java.util.*;
public class Exercise7 {
    static ArrayList<String> groupA = new ArrayList<>();
    static ArrayList<String> groupB = new ArrayList<>();
    static ArrayList<String> groupC = new ArrayList<>();
    static ArrayList<String> groupD = new ArrayList<>();

    public static void readCSV() {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("data/CandidatePerformanceTest.csv"));

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String group = line.split(",")[2].trim();

                if (group.contains("A")) groupA.add(line);
                else if (group.contains("B")) groupB.add(line);
                else if (group.contains("C")) groupC.add(line);
                else if (group.contains("D")) groupD.add(line);
            }

            br.close();
            System.out.println("CSV loaded successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void processGroup(String name,
                                    ArrayList<String> students) {
        int male = 0, female = 0;

        for (String student : students) {
            String gender = student.split(",")[1].trim();

            if (gender.equalsIgnoreCase("Male")) male++;
            else if (gender.equalsIgnoreCase("Female")) female++;
        }

        int total = students.size();
        double malePercent = total == 0 ? 0 : male * 100.0 / total;
        double femalePercent = total == 0 ? 0 : female * 100.0 / total;

        System.out.println("\n" + name);
        System.out.println("Total students: " + total);
        System.out.println("Male: " + male);
        System.out.println("Female: " + female);
        System.out.printf("Male percentage: %.2f%%\n", malePercent);
        System.out.printf("Female percentage: %.2f%%\n", femalePercent);

        try {
            File folder = new File("data/Exercise7");
            folder.mkdirs();

            String fileName = name.replace(" ", "").toLowerCase() + ".csv";
            FileWriter fw = new FileWriter(new File(folder, fileName));
            fw.write("Name,Gender,Group\n");

            for (String student : students) {
                fw.write(student + "\n");
            }
            fw.write("\nSUMMARY\n");
            fw.write("Total Students," + total + "\n");
            fw.write("Male," + male + "\n");
            fw.write("Female," + female + "\n");
            fw.write(String.format("Male Percentage,%.2f%%\n", malePercent));
            fw.write(String.format("Female Percentage,%.2f%%\n", femalePercent));
            fw.close();
            System.out.println(fileName + " created successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        readCSV();
        processGroup("Group A", groupA);
        processGroup("Group B", groupB);
        processGroup("Group C", groupC);
        processGroup("Group D", groupD);
        System.out.println("\nAll group files created successfully.");
    }
}
