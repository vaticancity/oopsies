import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String designation;
    double salary;

    Employee(String name, int age, String designation, double salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        // Accepting data for 5 employees
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            System.out.print("Designation: ");
            String designation = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume the newline

            employees[i] = new Employee(name, age, designation, salary);
        }

        // Displaying names of employees with salary greater than 5000
        System.out.println("Employees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.salary > 5000) {
                System.out.println(employee.name);
            }
        }

        scanner.close();
    }
}
