import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the card picked up by Johnny:");
        int n = scan.nextInt();
        scan.close();

        int even = 0, odd = 0;
        while (n>0) {
            int digit = n % 10;
            if (digit % 2 == 0)
                even += digit;
            else
                odd += digit;
            n /= 10;
        }
        
        if (even == odd)
            System.out.println("Johnny will win the Card Game");
        else
             System.out.println("Johnny will not win the Card Game");
    }
}
