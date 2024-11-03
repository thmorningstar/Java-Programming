// Array Matrix

import java.util.Scanner;

class Multi_Array
{
    int [][] arry = new int [5][3];
    int [][] arry_2 = {{10,25,35},{19,20,46},{19,34,67}};
    Scanner sc = new Scanner(System.in);
    void InputArray()
    {
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < arry.length; i++)
        {
            for(int j = 0; j < arry[i].length; j++)
            {
                arry[i][j] = sc.nextInt();
            }
        }
    }

    void printArray()
    {
        System.out.println("Elements of arrys are :");
        for(int i = 0; i<arry.length; i++)
        {
            for(int j=0;j<arry[i].length; j++)
            {
                System.out.print(arry[i][j] +" ");
            }
            System.out.println();
        }
    }

    void printArray2()
    {
        System.out.println("Elements of arrys(2) are :");
        for(int i = 0; i<arry_2.length; i++)
        {
            for(int j=0;j<arry_2[i].length; j++)
            {
                System.out.print(arry_2[i][j] + " ");
            }

            System.out.println();
            
        }
    }


}

public class Main2 {
    public static void main(String[] args) {
        Multi_Array obj = new Multi_Array();
        obj.InputArray();
        obj.printArray();
        obj.printArray2();
        
    }
    
}
