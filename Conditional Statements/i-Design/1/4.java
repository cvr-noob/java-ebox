import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int lastDigit = scan.nextInt() % 10;
        scan.close();

        if (lastDigit == 3 || lastDigit == 8)
            System.out.println("Lucky Winner");
        else
            System.out.println("Not a Lucky Winner");
    }
}
