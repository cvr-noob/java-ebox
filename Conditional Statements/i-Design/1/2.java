import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        scan.close();

        if (age < 15)
            System.out.println("Child Ticket");
        else
            System.out.println("Adult Ticket");
    }
}
