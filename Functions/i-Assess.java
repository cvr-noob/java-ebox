import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = scan.nextInt();
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        System.out.println("The result is\n"+calculate(x, n));
    }
    public static int calculate(int x,int n) {
        if (n == 0)
            return 0;
        return (int)Math.pow(x, n) + calculate(x, n-1);
    }
}
