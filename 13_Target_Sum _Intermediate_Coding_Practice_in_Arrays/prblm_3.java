//Find the unique number in the given Array where all the elements are being repeated twice with one value being Unique
// Array[] = {1,2,3,4,2,1,3} 

import java.util.Scanner;

public class prblm_3 {
    static int unique(int array[])
    {
        int ans = -1;
        for(int i=0; i<array.length; i++)
        {
            for(int j=i+1; j<array.length; j++)
            {
                if(array[i] == array[j])
                {
                    array[i]=-1;
                    array[j]=-1;
                }
            }

            for(int k=0; k<array.length; k++)
            {
                if(array[i] > 0)
                {
                    ans = array[i];
                }
            }
        }
        return ans;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int[] unique = new int[n];

        System.out.println("Enter the elements of Array :");
        for(int i=0; i< unique.length; i++)
        {
            unique[i] = sc.nextInt();
        }
        sc.close();
        int res = unique(unique);
        System.out.println("Unique element int he given Array is "+res);
    }    
}
