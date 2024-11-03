//Print the sum of first n natural numbera where n is the user's input
import java.util.*;
public class While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int i=1;
        int sum=0;

        while (i <= n) {
            sum=sum+i;
            i++;
        }
        System.out.println("\n The sum of first "+n +" natural numbers is "+sum);

        sc.close();
    }
    
}
