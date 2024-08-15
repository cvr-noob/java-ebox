import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n<10)
            System.out.println("Invalid Number");
        else {
            String nStr = Integer.toString(n);
            System.out.println(Math.abs(Character.getNumericValue(nStr.charAt(0)) - Character.getNumericValue(nStr.charAt(nStr.length() - 1))));
        }
    }
}
