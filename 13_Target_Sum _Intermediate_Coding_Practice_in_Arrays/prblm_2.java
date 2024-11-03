//Count the number of triplets whose sum is equal to given value of X
// here X is equal to 12
// Array[]= {1,4,5,6,3}

import java.util.Scanner;

public class prblm_2 {

    static void triplet(int arry[])
    {
        int[] res = new int[3];
        for(int i=0; i<arry.length; i++)
        {
            for(int j=i+1; j<arry.length; j++)
            {
                for(int k=j+1; k<arry.length; k++)
                {
                    if(arry[i] + arry[j]+ arry[k] == 12)
                    {
                        res[0] = arry[i];
                        res[1] = arry[j];
                        res[2] = arry[k];
                        System.out.println("Pair "+res[0]+" "+res[1]+" "+res[2]);               
                    }
                }
            }
        }
    } 
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int[] triplet = new int[n];

        System.out.println("Enter the elements of Array :");
        for(int i=0; i< triplet.length; i++)
        {
            triplet[i] = sc.nextInt();
        }
        sc.close();
        triplet(triplet);
    }

    
}
