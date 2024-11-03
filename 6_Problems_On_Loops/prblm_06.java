//Given two number "a" and "b". Find "a" raise to the power "b"

import java.util.*;
public class prblm_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res=1;

        for(int i=1; i<=b; i++)
        {
            res = res*a;
        }

        System.err.println("The result is "+res);
        sc.close();

    }

}
