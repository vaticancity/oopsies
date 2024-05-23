/*
 * 18.	All the banks operating in India are controlled by RBI. RBI has set a well defined guideline 
 * (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. 
 * For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; 
 * however, banks are free to use 4% interest rate or to set any rates above it. 
Write a JAVA program to implement bank functionality in the above scenario and demonstrate the dynamic polymorphism concept. 
Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). 
Assume and implement required member variables and functions in each class.
Hint: Class Customer {
 //Personal Details ... // Few functions ... 
} 
Class Account { 
// Account Detail ... // Few functions ...
 } 
Class RBI { Customer c; //hasA relationship Account a;
 //hasA relationship .. 
Public double GetInterestRate() { }
 Public double GetWithdrawalLimit() { }
 } 
Class SBI: public RBI {
 //Use RBI functionality or define own functionality. 
} 
Class ICICI: public RBI { //Use RBI functionality or define own functionality. }]
*/


import java.util.Scanner;

// Class to represent a Customer
class Customer {
    private String name;
    private int age;
    private String address;

    public Customer(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods for Customer details
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

// Class to represent an Account
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods for Account details
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

// Base class RBI
class RBI {
    private Customer customer;
    private Account account;

    public RBI(Customer customer, Account account) {
        this.customer = customer;
        this.account = account;
    }

    public double getInterestRate() {
        return 4.0; // Minimum interest rate set by RBI
    }

    public double getWithdrawalLimit() {
        return 50000; // Example withdrawal limit
    }
}

// Derived class SBI
class SBI extends RBI {
    public SBI(Customer customer, Account account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 4.5; // SBI-specific interest rate
    }

    @Override
    public double getWithdrawalLimit() {
        return 60000; // SBI-specific withdrawal limit
    }
}

// Derived class ICICI
class ICICI extends RBI {
    public ICICI(Customer customer, Account account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 5.0; // ICICI-specific interest rate
    }

    @Override
    public double getWithdrawalLimit() {
        return 55000; // ICICI-specific withdrawal limit
    }
}

// Derived class PNB
class PNB extends RBI {
    public PNB(Customer customer, Account account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 4.75; // PNB-specific interest rate
    }

    @Override
    public double getWithdrawalLimit() {
        return 58000; // PNB-specific withdrawal limit
    }
}

public class Bank_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Customer Details
        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        System.out.println("Enter customer age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter customer address:");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, age, address);

        // Input Account Details
        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter account balance:");
        double balance = scanner.nextDouble();

        Account account = new Account(accountNumber, balance);

        // Input Bank Choice
        System.out.println("Enter the bank (SBI, ICICI, PNB):");
        scanner.nextLine(); // Consume newline
        String bankChoice = scanner.nextLine();

        RBI bank = null;

        switch (bankChoice.toUpperCase()) {
            case "SBI":
                bank = new SBI(customer, account);
                break;
            case "ICICI":
                bank = new ICICI(customer, account);
                break;
            case "PNB":
                bank = new PNB(customer, account);
                break;
            default:
                System.out.println("Invalid bank choice.");
                System.exit(0);
        }

        /*
         if(choice.toUpperCase().equals("SBI")) {
            bank=new SBI(customer, account);
        } 
        else if(choice.toUpperCase().equals("ICICI")) {
            bank= new ICICI(customer, account);
        } 
        else if(choice.toUpperCase().equals("PNB")) {
            bank= new PNB(customer, account);
        }
        else {
            System.out.println("invalid choice");
            System.exit(0);
        }

        */

        // Display interest rate and withdrawal limit based on bank choice
        System.out.printf("Bank: %s\n", bankChoice);
        System.out.printf("Interest Rate: %.2f%%\n", bank.getInterestRate());
        System.out.printf("Withdrawal Limit: %.2f\n", bank.getWithdrawalLimit());

        scanner.close();
    }
}
