import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int count = 0;
        while (n > 0) {
            int r = n % 10;
            if (r == 4)
                count++;
            n /= 10;
        }

        System.out.println(count);
    }
}
