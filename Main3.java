import java.util.Scanner;

interface Account {
    void set(String accountNumber, double balance);
    void display();
}

interface Person {
    void store(String name);
    void disp();
}

public class Customer implements Person, Account {
    private String name;
    private String accountNumber;
    private double balance;
    private final double interestRate = 0.05; // Assuming a 5% interest rate

    @Override
    public void set(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }

    @Override
    public void store(String name) {
        this.name = name;
    }

    @Override
    public void disp() {
        System.out.println("Name: " + name);
    }

    private double calculateInterest() {
        return balance * interestRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();

        // Creating a Customer object
        Customer customer = new Customer();

        // Storing and setting information
        customer.store(name);
        customer.set(accountNumber, balance);

        // Displaying the information
        customer.disp();
        customer.display();

        scanner.close();
    }
}

