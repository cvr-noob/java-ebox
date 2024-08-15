import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scan.nextInt();
        System.out.println("Enter m");
        int m = scan.nextInt();
        scan.close();

        System.out.println("The multiplication table of " + n + " is");
        for (int i=1; i<=m; i++)
            System.out.println(i+"*"+n+"="+(n*i));
    }
}
