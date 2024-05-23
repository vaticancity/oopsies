import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String designation;
    double salary;

    public Employee(String name, int age, String designation, double salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }
}

public class Inheritance_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            scanner.nextLine();  // Consume newline

            System.out.print("Designation: ");
            String designation = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            scanner.nextLine();  // Consume newline

            employees[i] = new Employee(name, age, designation, salary);
        }

        System.out.println("\nEmployees with salary greater than 5000:");
        for (Employee emp : employees) {
            if (emp.salary > 5000) {
                System.out.println(emp.name);
            }
        }

        scanner.close();
    }
}
