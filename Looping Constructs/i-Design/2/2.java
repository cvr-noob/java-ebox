import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int m = scan.nextInt();
        System.out.println("Enter the number of subjects");
        int n = scan.nextInt();
        scan.nextLine();
        String[] names = new String[m];
        int[] avgs = new int[m];
        for (int i=0; i<m; i++)
        {
            System.out.println("Enter the name of student " + (i+1));
            names[i] = scan.nextLine();
       
            System.out.println("Enter the " + n + " subject marks of student " + (i+1));
            avgs[i] = 0;
            for (int j=0; j<n; j++) {
                avgs[i] += scan.nextInt() / n;
               if (i < 3)
                    scan.nextLine();
            }
        }
        scan.close();
        
        System.out.println("Student Results");
        for (int i=0; i<m; i++)
        {
            String remark;
            if (avgs[i] < 0 || avgs[i] > 100)
                remark = "Invalid";
            else if (avgs[i] >= 80)
                remark = "Distinction";
            else if (avgs[i] >= 70)
                remark = "First Class";
            else if (avgs[i] >= 50)
                remark = "Pass";
            else
                remark = "Fail";
            System.out.println(names[i] + " - " + remark);
        }
    }
}
