//Hollow opposite right angles triangle

import java.util.Scanner;
public class prblm__6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();

        for(int i= rows; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                if(j==1 || j==i || i==rows)
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
