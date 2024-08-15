import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Country name");
        switch (scan.nextLine()) {
            case "India": System.out.println(91); break;
            case "Pakistan": System.out.println(92); break;
            case "South Africa": System.out.println(27); break;
            case "United States": System.out.println(1); break;
            case "China": System.out.println(86); break;
            case "Australia": System.out.println(61); break;
            case "Japan": System.out.println(81); break;
            default: System.out.println();
        }
        scan.close();
    }
}
