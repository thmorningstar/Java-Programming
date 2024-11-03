//Count the number of digit for a given number n

import java.util.Scanner;

public class prblm_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int x =num;
        int count=0;

        while (num!=0) {
            num=num/10;
            count++;
        }

        System.out.println("Number of digits for a given number "+x +" is "+count);
        sc.close();
    }
    
}
