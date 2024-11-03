//Find the sum of the following series: S = 1-2+3-4...n

import java.util.*;
public class prblm_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int res=0;

        for(int i=1; i<=num; i++)
        {
            if(i%2==0)
            {
                res=res-i;
            }

            else
            {
                res=res+i;
            }
        }

        System.out.println("Sum of the given series of the number is "+res);
        sc.close();
    }    
    
}
