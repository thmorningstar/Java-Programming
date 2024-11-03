//Find the sum of digits in a given number n

import java.util.*;
public class prblm_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp = num;
        int count=0;
        int x;

        while (temp!=0) {
            x=temp%10;
            count=count+x;
            temp=temp/10;
        }

        System.out.println("Sum of the digits in a given number "+num +" is "+count);
        sc.close();
        
    }
    
}
