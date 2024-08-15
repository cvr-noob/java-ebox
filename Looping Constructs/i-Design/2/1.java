import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = scan.nextLine();
       
        System.out.println("Enter 4 subject marks");
        int avg = 0;
        for (int i=0; i<4; i++)
            avg += scan.nextInt() / 4;
        scan.close();
        
        System.out.println("Student Result");
        String remark;
        if (avg < 0 || avg > 100)
            remark = "Invalid";
        else if (avg >= 80)
            remark = "Distinction";
        else if (avg >= 70)
            remark = "First Class";
        else if (avg >= 50)
            remark = "Pass";
        else
            remark = "Fail";
        
        System.out.println(name + " - " + remark);
    }
}
