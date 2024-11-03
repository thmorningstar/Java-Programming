//Print rectangular border
import java.util.*;
public class prblm__2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the rectangle:");
        int len = sc.nextInt();
        System.out.println("Enter length of the rectangle:");
        int wid = sc.nextInt();

        for(int i=1; i<=len; i++)
        {
            for(int j=1; j<=wid; j++)
            {
                if(i==1 || i==len || j==1 || j==wid)
                {
                    System.out.print("*");
                }

                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        sc.close();
    }
}
