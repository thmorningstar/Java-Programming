//Binary to Decimal
import java.util.*;
public class conversion_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number:");
        int b_num = sc.nextInt();
        int ans = 0;
        int pw = 1; //2^0 =1

        while(b_num>0)
        {
            int unit_digit = b_num%10;  //to get unit digit
            ans = ans + (unit_digit * pw);
            b_num = b_num/10;  //to get remaimg binary digit
            pw = pw * 2;
        }

        System.out.println("Converted into Decimal No. :" +ans);
        sc.close();
        
    }

    
}