import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first ASCII value");
        int a = scan.nextInt();
        System.out.println("Enter the second ASCII value");
        int b = scan.nextInt();
        System.out.println(a+b);
    }
}
