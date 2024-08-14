import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scan.nextInt();
        System.out.println( (age > 18? "E": "Not e") + "ligible to vote" );
    }
}
