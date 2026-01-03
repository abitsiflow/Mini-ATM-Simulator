import java.util.Scanner;
import java.util.InputMismatchException;
public class Menu{

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        PINauthorization pin = new PINauthorization(3221);
        ATM_function function = new ATM_function();
        int choice = 0;
        boolean mainIsRunning = true;

            System.out.println("*******************");
            System.out.println("Mini ATM Simulator");
            System.out.println("*******************");

            System.out.println("PIN authorization");
            System.out.print("Enter your PIN: ");
            pin.logIn();
        while (mainIsRunning) {
            try{
                System.out.println("*************");
                System.out.println("<<ATM MENU>>");
                System.out.println("*************");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Show Balance");
                System.out.println("4. Exit");
                System.out.print("Enter Your Choice:");
                choice = scan.nextInt();
                scan.nextLine();

                switch(choice){
                    case 1 -> {
                         function.balance += function.deposit(function.balance);
                    }
                    case 2 -> {

                        function.balance = function.balance - function.withdraw(function.balance);
                    }
                    case 3 -> {

                        function.showBalance(function.balance);
                    }
                    case 4 -> {

                        mainIsRunning = false;
                    }
                    default -> System.out.println("Invalid Choice please Try again");
                }

            }catch(InputMismatchException ex){
                System.out.println("Please Input numbers!");
            }

        }

    }
}