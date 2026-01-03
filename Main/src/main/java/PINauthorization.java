import java.util.Scanner;

public class PINauthorization {
    Scanner scan = new Scanner(System.in);
    int PIN = 3221;

    PINauthorization(int PIN){
        this.PIN = PIN;
    }

    void logIn(){
        int attempts = 10000;

        this.PIN = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < attempts; i++){
            if (this.PIN != 3221) {
                System.out.println("PIN INCORRECT!");
                System.out.print("Enter your PIN: ");
                this.PIN = scan.nextInt();
                scan.nextLine();
            }else{
                System.out.println("PIN CORRECT!");
                break;
            }

        }
    }
}
