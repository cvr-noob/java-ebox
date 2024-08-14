import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer");
        int n = scan.nextInt();

        System.out.println("Number is "+n);
        System.out.println("Number is "+n+n);
        System.out.println("Number is "+2*n);
        System.out.println(n+" is the number");
        System.out.println(2*n+" is the number");
    }
}
