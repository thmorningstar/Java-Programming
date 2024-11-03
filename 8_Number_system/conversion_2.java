//Decinamal To Binary

import java.util.Scanner;

public class conversion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Decimal number: ");
        int D_num = sc.nextInt();
        int ans = 0;
        int pw = 1;

        while(D_num > 0)
        {
            int pr = D_num % 2;
            ans = ans + (pr * pw);
            pw = pw * 10;
            D_num = D_num/2;
        }

        System.out.println("Converted into Binary No. :"+ans);
        sc.close();
    
    }
    
}
