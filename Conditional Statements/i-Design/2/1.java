import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        scan.close();

        System.out.print("The given number is ");
        if (n > 7)
            System.out.print("above 7");
        else if (n < 7)
            System.out.println("below 7");
        else
            System.out.println("equal to 7");
    }
}
