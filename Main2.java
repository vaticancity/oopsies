import java.util.Scanner;

class Student {
    private int studentID;
    private double aggregateMarks;
    private final double BASE_STIPEND = 100.0;

    public Student(int studentID, double aggregateMarks) {
        this.studentID = studentID;
        this.aggregateMarks = aggregateMarks;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getAggregateMarks() {
        return aggregateMarks;
    }

    public void setAggregateMarks(double aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }

    public double calculateTotalStipend() {
        double bonusStipend = 0.0;

        if (aggregateMarks >= 85 && aggregateMarks < 90) {
            bonusStipend = 10.0;
        } else if (aggregateMarks >= 90 && aggregateMarks < 95) {
            bonusStipend = 15.0;
        } else if (aggregateMarks >= 95 && aggregateMarks < 100) {
            bonusStipend = 20.0;
        }

        return BASE_STIPEND + bonusStipend;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        System.out.print("Enter aggregate marks: ");
        double aggregateMarks = scanner.nextDouble();

        // Creating a student object
        Student student = new Student(studentID, aggregateMarks);

        // Calculating the total stipend
        double totalStipend = student.calculateTotalStipend();

        // Output
        System.out.printf("The final stipend of %d is $%.1f%n", student.getStudentID(), totalStipend);

        scanner.close();
    }
}

