//Print the sum of first n natural numbera where n is the user's input
import java.util.*;
public class For_Loop {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            int sum=0;
    
            for (int i=1; i<= n; i++) {
                sum=sum+i;
            }
            System.out.println("\n The sum of first "+n +" natural numbers is "+sum);
    
            sc.close();
        }
    
    
}