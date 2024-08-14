import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number of people");
        int n = scan.nextInt();
        int x =(int)( (2.0 / 7) * n);
        System.out.println("Number of attendees on day1 : " + x);
        System.out.println("Number of attendees on day2 : " + (2 * x));
        System.out.println("Number of attendees on day3 : " + (x / 2));
    }
}
