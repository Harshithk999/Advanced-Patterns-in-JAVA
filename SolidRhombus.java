import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=in.nextInt();

        for(int i=1;i<=n;i++)
        {
            int spaces=n-i;
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}