//Find the 2nd largest element in the given Array [9,8,9,6,9,5,8] [0-2,0,-3,0,-4,-1]

import java.util.Scanner;

public class prblm_4 {

    static int findMax(int[] arry)
    {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arry.length; i++)
        {
            if(arry[i]>max)
            {
                max = arry[i];
            }
        }
        return max;
    }

    static int findSecondMax(int[] arry)
    {
        int max = findMax(arry);

        for(int i=0; i<arry.length; i++)
        {
            if(arry[i] == max)
            {
                arry[i] = Integer.MIN_VALUE;
            }
        }
         int secondMax = findMax(arry);

         return secondMax;
        
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

        int res = findMax(arry);
        System.out.println("Largest Number in the given Array: "+res);

        int ress = findSecondMax(arry);
        System.out.println("2nd Largest Number in the given Array: "+ress);

    }

}
