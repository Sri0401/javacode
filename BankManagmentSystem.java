import java.util.Scanner;
class BankAccount {
    private String AccountHolderName;
    private String AccountNumber;
    private double balance;

    public BankAccount (String AccountHolderName, String AccountNumber, double balance) {
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite successful. New balance : $ " + balance);
        }
        else {
            System.out.println("Invalid deposite amount.");
        }
        
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -=amount;
            System.out.println("Withdraw successful. New balance : $" + balance);
        }
        else {
            System.out.println("Invalid withdraw amount.");

        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder Name : " + AccountHolderName);
        System.out.println("Account Number : " + AccountNumber);
        System.out.println("Balance : " + balance);
    }
}
public class BankManagmentSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the account holder name : ");
        String name = scan.nextLine();
        System.out.print("Enter the account number : ");
        String number = scan.nextLine();
        System.out.print("Enter the initial balance : ");
        double balance = scan.nextDouble();

        BankAccount account = new BankAccount(name, number, balance);

        while (true) {
            System.out.println("\n Choose an option from below.");
            System.out.println("1. Deposite");
            System.out.println("2. Withdraw");
            System.out.println("3. Account information and details.");
            System.out.println("4. Exit");

            System.out.println("Your option: ");
            int choice = scan.nextInt();

            switch(choice) {

                case 1:
                System.out.println("Enter your deposite amount : ");
                double depositamount = scan.nextDouble();
                account.deposit(depositamount);
                break;

                case 2:
                System.out.println("Enter the withdraw amount : ");
                double withdrawamount = scan.nextInt();
                account.withdraw(withdrawamount);
                break;

                case 3:
                account.displayAccountInfo();
                break;

                case 4:
                System.out.println("Exiting......");
                scan.close();
                return;

                default:
                System.out.println("Invalid choice.");


            }
        }
    }   
}

