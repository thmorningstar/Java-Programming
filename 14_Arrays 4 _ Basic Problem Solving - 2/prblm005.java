//Rotate the given Array "A"  by "K" steps, where "K is non negative number".
// Note: "K" can be greater than "N" as well. Here "N" is the size of Array.

import java.util.Scanner;

public class prblm005 {
    static int[] rotate(int[] arry,int k)
    {
        int n = arry.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-k; i < n; i++)
        {
            ans[j++] = arry[i];
        }

        for(int i = 0; i < n-k; i++)
        {
            ans[j++] = arry[i];
        }

        return ans;
    }

    static void printArray(int[] arry)
    {
        for(int i = 0; i < arry.length; i++)
        {
            System.err.println(arry[i]);
        }
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

        System.out.println("Original Array: ");
        printArray(arry);

        System.err.println("Enter the number of Rotations: ");
        int k = sc.nextInt();
        int ans [] = rotate(arry,k);
        System.out.println("Rotated Array: ");
        printArray(ans);
        sc.close();

    }

    
}
