//Print the sum of first n natural numbera where n is the user's input
import java.util.*;
public class Do_While_Loop {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            int i=1;
            int sum=0;

            do{
                sum=sum+i;
                i++;
            }
            while(i<=n);
    
            System.out.println("\nThe sum of first "+n +" natural numbers is "+sum);
    
            sc.close();
        }
    
    
}