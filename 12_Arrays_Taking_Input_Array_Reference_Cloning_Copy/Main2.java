// Program to demonstrate how to return an Array
import java.util.*;

public class Main2 {
    static int [] arry = new int[5];
    static void PrintArrys()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of Arrays are :");

        for(int i=0; i < arry.length; i++)
        {
            arry[i] = sc.nextInt();
        }
        sc.close();
    }

    static int[] smallestAndLargestElement(int[] arry)
    {
        Arrays.sort(arry);  // Sorting of Array
        int[] ans = {arry[0], arry[arry.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        PrintArrys();

        int[] res = smallestAndLargestElement(arry);
        System.out.println("Smallest elemnts of the given Array is "+res[0]);
        System.out.println("Largest elemnts of the given Array is "+res[1]);
    }
    
}

