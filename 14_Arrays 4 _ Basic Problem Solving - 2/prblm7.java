// Given Q query, Check the given number is present in the Array or not.By using Frequency Array

import java.util.Scanner;

public class prblm7 {
        static int[] makeFrequencyArray(int[] arry)
        {
            int[] freq = new int[100000];
            for(int i = 0; i < arry.length; i++)
            {
                freq[arry[i]]++;
            }
            return freq;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the Array");
            int n = sc.nextInt();
            int[] arry = new int[n];
            System.out.println("Enter the elements of Array :");
            for(int i=0; i<n; i++)
            {
                arry[i] = sc.nextInt();
            }

            int[] freq = makeFrequencyArray(arry);

            System.out.println("Enter the number Queries: ");
            int q = sc.nextInt();

            while (q>0)
            {
                System.out.println("Enter the number to be searched: ");
                int x = sc.nextInt();

                if(freq[x] > 0)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("NO");
                }
                q--;    
            }
    
        sc.close();
    }
    
}
