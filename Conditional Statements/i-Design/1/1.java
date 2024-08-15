import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        scan.close();

        System.out.println("Welcome to the show");
        if (age < 15)
            System.out.println("Please note that you should be accompanied by an adult");
    }
}
