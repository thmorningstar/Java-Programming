// Count the number of elements strictly greater than 6

import java.util.*;
class Student
{
    int count = 0;
    int [] number = new int[5];
    void Arrys()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of Arrays are :");

        for(int i=0; i < number.length; i++)
        {
            number[i] = sc.nextInt();
        }

        for(int i = 0; i < number.length; i++)
        {
            if(number[i] > 6)
            {
                count ++;
            }
        }

        System.out.println("Number of elements greater than 6 is "+count);

        sc.close();
    }
}

public class Mainn {
    public static void main(String[] args) {
        Student obj = new Student();
        obj. Arrys();
    }
    
}

