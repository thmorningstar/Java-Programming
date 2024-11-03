//Reverse an Array consistent of integer values (With creating New Array)

import java.util.*;
public class prblm3 {

    static void InputArray(int[] Array)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of Array :");
        for(int i=0; i< Array.length; i++) // Input Array
        {
            Array[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        for(int i=0; i<Array.length; i++)  //Print Array
        {
            System.out.println(Array[i]);
        }

        sc.close();

    }

    static void reverseArray(int[] arry, int[] ansArry)
    {
        int i = arry.length - 1, j = 0;
        // for(i=arry.length - 1; i>=0; i--)   //Using for loop
        // {
        //     ansArry[j++] = arry[i];
        // }


        while(i>=0)
        {
            ansArry[j++] = arry[i--];
        }

        System.out.println("Reversed Array: ");
        for(i=0; i<ansArry.length; i++)  //Print Array
        {
            System.out.println(ansArry[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int[] arry = new int[n];
        int[] arry2 = new int[n];

        InputArray(arry);
        reverseArray(arry, arry2);

        sc.close();

    }

    
}
