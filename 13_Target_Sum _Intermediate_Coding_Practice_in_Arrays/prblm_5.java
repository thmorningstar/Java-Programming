//Given an Array 'a' consisting an Integer. Return first value that is repeating in this Array.
//If no value is being repeated, return -1

import java.util.Scanner;

public class prblm_5 {

    static int repeting(int[] arry)
    {
        for(int i=0; i<arry.length; i++)
        {
            for(int j=i+1; j<arry.length; j++)
            {
                if(arry[i] == arry[j])
                {
                    return arry[i];
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int[] arry = new int[n];

        System.out.println("Enter the elements of Array :");
        for(int i=0; i< arry.length; i++)
        {
            arry[i] = sc.nextInt();
        }
        sc.close();
        int ans = repeting(arry);

        System.out.println("First Repeating Number: " +ans);
    }
}
