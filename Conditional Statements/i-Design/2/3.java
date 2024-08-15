import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Red status");
        int red = scan.nextInt();
        System.out.println("Enter Yellow status");
        int yellow = scan.nextInt();
        System.out.println("Enter Green status");
        int green = scan.nextInt();
        scan.close();

        if (red == 1)
            if (green == 1)
                System.out.println("MAKE WAY, AMBULANCE BEHIND YOU");
            else
                System.out.println("STOP");
        else if (yellow == 1)
            System.out.println("GET READY");
        else
            System.out.println("GO");
    }
}
