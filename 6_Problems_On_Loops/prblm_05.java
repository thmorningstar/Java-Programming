//Print the first n factorial numbers

import java.util.*;


public class prblm_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");
        int num=sc.nextInt();
        int fact=1;

        for(int i=1; i<=num; i++)
        {
            fact=fact*i;
            System.out.println("Factorial of "+i +" is "+fact);
        }
        sc.close();
    }
    

    
}
