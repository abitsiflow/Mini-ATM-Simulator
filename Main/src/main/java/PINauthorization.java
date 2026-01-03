import java.util.Scanner;

public class PINauthorization {
    Scanner scan = new Scanner(System.in);
    int PIN = 3221;

    PINauthorization(int PIN){
        this.PIN = 0;
    }

    void logIn(){
        int attempts = 10000;


        for(int i = 0; i < attempts; i++){
            this.PIN = scan.nextInt();

            if (this.PIN != 3221) {
                System.out.println("PIN INCORRECT!");
                System.out.print("Enter your PIN: ");
                System.out.println();
            }else{
                System.out.println("PIN CORRECT!");
                break;
            }

        }
    }
}
