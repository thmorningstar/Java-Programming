// Reverse the digit of a number

import java.util.Scanner;

public class prblm_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int temp = num;
        int rem;
        int rev = 0;

        while(temp!=0)
        {
            rem = temp%10;
            rev = (rev*10) + rem;
            temp = temp/10;
        }

        System.out.println("Reverse of the digits of a given number "+num +" is "+rev);
        sc.close();

    }
    
}
