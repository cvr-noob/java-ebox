import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer");
        int a = scan.nextInt();
        System.out.println("Enter double");
        double b = scan.nextDouble();
        scan.close();

        System.out.println(a + " is an integer value");
        System.out.printf("%.2f is a double value", b);
    }
}
