//Rotate the given Array "A"  by "K" steps, where "K is non negative number without using extra space".
// Note: "K" can be greater than "N" as well. Here "N" is the size of Array.

import java.util.Scanner;

public class prblm6 {

    static void swap(int arry[], int i, int j)
    {
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
    }

    static void reverse(int arry[], int i, int j)
    {
        while(i<j)
        {
            swap(arry, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arry,int k)
    {
        int n = arry.length;
        k = k % n;
        reverse(arry, 0, n-k-1);
        reverse(arry, n-k, n-1);
        reverse(arry, 0, n-1);

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
        rotateInPlace(arry,k);
        System.out.println("Rotated Array: ");
        printArray(arry);
        sc.close();

    }
}
