import java.util.Scanner;

public class Array_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of salaries: ");
        int n = scanner.nextInt();
        
        double[] salaries = new double[n];
        
        System.out.println("Enter the salaries:");
        for (int i = 0; i < n; i++) {
            salaries[i] = scanner.nextDouble();
        }
        
        double[] result = findDetails(salaries);
        
        System.out.println("Average salary: " + result[0]);
        System.out.println("Number of salaries greater than the average salary: " + result[1]);
        System.out.println("Number of salaries lesser than the average salary: " + result[2]);
        
        scanner.close();
    }
    
    public static double[] findDetails(double[] salaries) {
        double total = 0.0;
        for (double salary : salaries) {
            total += salary;
        }
        double average = total / salaries.length;
        
        int greaterCount = 0;
        int lesserCount = 0;
        
        for (double salary : salaries) {
            if (salary > average) {
                greaterCount++;
            } else if (salary < average) {
                lesserCount++;
            }
        }
        
        return new double[] {average, greaterCount, lesserCount};
    }
}
