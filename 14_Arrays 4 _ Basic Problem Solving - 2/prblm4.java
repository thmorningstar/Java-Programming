//Inplace Reverse an Array consistent of integer values(Reverse the Array without creating new Array)
import java.util.Scanner;;
public class prblm4 {

    static void swap(int arry[], int i, int j)
    {
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
    }

    static void reverse(int[] Arry)
    {
        int i = 0;
        int j = Arry.length - 1;

        while(i < j)
        {
            swap(Arry,i,j);
            i++;
            j--;
        }
    }

    static void printArray(int arry[])
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
        reverse(arry);
        System.out.println("Rerversed Array: ");
        printArray(arry);
        sc.close();
    }

    
}
