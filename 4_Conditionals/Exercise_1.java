//Write a program to print the value if it is even and divisible by 3

import java.util.*;
public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num%2==0 && num%3==0)
        {
            System.out.println("Found answer " +num);
        }

//Write a program to print the value if it is even and divisible by 3

        System.out.println("Enter another number");
        int num2 = sc.nextInt();

        if(num2%3==0 || num2%5==0)
        {
            System.out.println("Found answer " +num2);
        }

        sc.close();

    }
    
}
