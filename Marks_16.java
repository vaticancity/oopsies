/*
 * 16.	 We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A 
 * and in four subjects (each out of 100) by student B. 
 * Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
 * It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. 
 * The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
 *  Create an object for eac of the two classes and print the percentage of marks for both the students.
*/

import java.util.Scanner;

abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private int mark1, mark2, mark3;

    public A(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    public double getPercentage() {
        int total = mark1 + mark2 + mark3;
        return (total / 3.0);
    }
}

class B extends Marks {
    private int mark1, mark2, mark3, mark4;

    public B(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    public double getPercentage() {
        int total = mark1 + mark2 + mark3 + mark4;
        return (total / 4.0);
    }
}

public class Marks_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for student A
        System.out.println("Enter marks for student A in three subjects:");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        A studentA = new A(a1, a2, a3);

        // Input for student B
        System.out.println("Enter marks for student B in four subjects:");
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int b3 = scanner.nextInt();
        int b4 = scanner.nextInt();
        B studentB = new B(b1, b2, b3, b4);

        // Print percentages
        System.out.printf("Percentage of marks for student A: %.2f%%\n", studentA.getPercentage());
        System.out.printf("Percentage of marks for student B: %.2f%%\n", studentB.getPercentage());

        scanner.close();
    }
}
