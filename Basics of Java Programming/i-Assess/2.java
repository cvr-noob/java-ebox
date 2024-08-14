import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of the left bottom vertex");
        int x = scan.nextInt();
        System.out.println("Enter the y-coordinate of the left bottom vertex");
        int y = scan.nextInt();
        System.out.println("Enter the length of a side");
        int half_side = (scan.nextInt()) / 2;
        scan.close();

        System.out.println("The centre of the room is at ("+(x+half_side)+","+(y+half_side)+")");
    }
}
