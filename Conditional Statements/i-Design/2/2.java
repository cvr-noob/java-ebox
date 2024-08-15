import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current balance");
        int bal = scan.nextInt();
        System.out.println("Enter the withdraw amount");
        int amt = scan.nextInt();
        scan.close();
        if (amt <= bal) {
            System.out.println("Transaction Successful");
            System.out.println("Current balance after withdrawing is "+(bal-amt));
        }
        else
            System.out.println("Transaction Unsuccessful");
    }
}
