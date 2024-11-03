//Nested If-else Statement

import java.util.*;
public class Conditionals_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the age:");
         int age = sc.nextInt();

         if(age<12)
         {
            if(age<=5)
            {
                System.out.println("Toodler");
            }
            else
            {
                System.out.println("child");
            }
         }

         else
         {
            System.out.println("Adult");
         }

         sc.close();
        
    }
    
}
