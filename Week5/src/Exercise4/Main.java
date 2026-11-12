package Exercise4;


public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(
            101, "Seth", 20, "IT", 500
        );

        System.out.println("Employee Information:");
        emp.displayInfo();
        emp.setSalary(700);

        System.out.println("\nUpdated Salary: $" + emp.getSalary());
    }
}
