//Find the total numbers of pairs of Arrays whose sum is equals to the given value x
// X = 7
// Array[] = {4,6,3,5,8,2} 
import java.util.*;

public class prblm_1 {
    static void sumArray(int[] arry)
    {
        int pair = 0;
        int res[] = new int[2];
        for(int i=0; i<arry.length; i++)
        {
            for(int j=i+1; j<arry.length; j++)
            {
                if(arry[i] + arry[j] == 7 )
                {
                    pair++;
                    res[0] = arry[i];    
                    res[1] = arry[j]; 
                    System.out.println("Pair "+res[0]+" "+res[1]);               
                }
            }
        }
        System.out.println("Total Pairs = "+pair);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int[] sum = new int[n];

        System.out.println("Enter the elements of Array :");
        for(int i=0; i< sum.length; i++)
        {
            sum[i] = sc.nextInt();
        }
        sc.close();
        sumArray(sum);

    }
    
}