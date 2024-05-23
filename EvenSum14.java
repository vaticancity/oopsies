import java.util.Scanner;

public class EvenSum14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        // Initialize the array
        int[] numbers = new int[n];
        
        // Prompt the user to enter the elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Calculate the sum of even numbers
        int sum = calculateSumOfEvenNumbers(numbers);
        
        // Print the result
        System.out.println("Sum of all even numbers: " + sum);
    }

    public static int calculateSumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}