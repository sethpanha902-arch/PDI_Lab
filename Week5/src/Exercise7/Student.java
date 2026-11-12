package Exercise7;


public class Student {

    private String name;
    private String id;
    private int age;
    private String gender;

    public Student(String name, String id, int age, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println(
            name + " | " + id + " | " + age + " | " + gender
        );
    }
}

