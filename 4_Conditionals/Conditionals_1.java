//If-else Conditionals

import java.util.*;
public class Conditionals_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num= sc.nextInt();

        // if(num%2==0)
        // {
        //     System.out.println("Number is even");
        // }
        // else
        // {
        //     System.out.println("Number is odd");
        // }

        //Alternating method(Ternary Operator) 

        String res;
        res = (num%2==0)?"even":"odd";
        System.out.println("The number is " +res);

        sc.close();
    }
    
}
