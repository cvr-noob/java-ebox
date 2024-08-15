import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input value");
        System.out.println((int)scan.next().charAt(0));
        scan.close();
    }
}
