import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n;
        char ch;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of lost team's coins left on board");
        n = scan.nextInt();
        if (n < 1 || n > 9)
            System.out.println("Invalid Input");
        else {
            System.out.println("Has winning team pocketed red [y or n] ?");
            ch = scan.next().charAt(0);
            scan.close();
            if (ch == 'y')
                n += 5;
            System.out.println("Points won : "+n);
        }
    }
}
