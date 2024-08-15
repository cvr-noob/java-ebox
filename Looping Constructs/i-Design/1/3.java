import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), even = 0, odd = 0;
        for (int i=0; i<n; i++)
            if (scan.nextInt() % 2 == 0)
                even++;
            else
                odd++;
        scan.close();
        System.out.println(even + " " + odd);
    }
}
