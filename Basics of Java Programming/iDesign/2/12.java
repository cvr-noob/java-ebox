import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("x value is");
        int x = scan.nextInt();
        System.out.println("y value is");
        int y = scan.nextInt();
        System.out.println("z value is");
        int z = scan.nextInt();
        scan.close();

        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println("The value of z is " + z);
    }
}
