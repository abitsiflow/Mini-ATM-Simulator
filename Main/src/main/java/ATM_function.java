import java.util.Scanner;

public class ATM_function {
    double balance = 0;
    Scanner scan = new Scanner(System.in);

    double deposit(double balance){
        double amount;

        System.out.print("Enter amount: ");
        amount = scan.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }else{
            balance = amount += balance;
            System.out.println("Deposit Successfully!");

        }

        return amount;
    }

    double withdraw(double balance){
        double amount;
        System.out.println("Enter amount: ");
        amount = scan.nextDouble();

        if(amount > balance){
            System.out.println("Your Balance is Insufficient funds");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }else{
            balance = amount - balance;
            System.out.println("Withdraw Successfully!");
        }

        return amount;
    }

    void showBalance(double balance){
        System.out.println("Balance: " + "$" + balance );
    }
}
