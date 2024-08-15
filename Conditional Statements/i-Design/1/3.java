import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        scan.close();

        if (age < 15 || age > 60)
            System.out.println("Not Allowed");
        else
            System.out.println("Allowed");
    }
}
