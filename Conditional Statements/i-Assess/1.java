import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        scan.close();
        double hra, da;
        if (base < 15000) {
            hra = (15.0/100) * base;
            da = (90.0/100) * base;
        } else {
            hra = 5000;
            da = (98.0/100) * base;
        }
        System.out.printf("%.2f", base+hra+da);
    }
}
