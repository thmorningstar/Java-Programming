// Program to add to number
import java.util.*;

class Addition {
     public int sum(int a,int b) {
        int ans = a + b;
        return ans;
    }

    
}

public class Main___1 {
    public static void main(String[] args) {
        Addition obj = new Addition();
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); 
        int y = sc.nextInt(); 
        System.out.println("Sum of the given two number is "+obj.sum(x,y));
        sc.close();;
    }
    
}
