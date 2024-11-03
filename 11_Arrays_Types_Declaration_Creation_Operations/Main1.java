//Sum od Array Elements
import java.util.*;
class Student
{
    int res = 0;
    int [] marks = new int[4];
    void sumArrays()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 elements of Array :");

        for(int i=0; i < marks.length; i++)
        {
            marks[i] = sc.nextInt();
        }

        System.out.println("Elements of Array :");

        for(int i=0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        // Sum of Arrays
        for(int i=0; i < marks.length; i++)
        {
            res = res + marks[i]; 
        }

        System.out.println("sum of the elements of Array is : "+res);
        sc.close();
    }

    void maxMarks()
    {
        int max = 0;
        for(int i = 0; i< marks.length; i++ )
        {
            if(max < marks[i])
            {
                max = marks[i];
            }
        }

        System.out.println("Maximun marks : "+max);
    }
}

public class Main1{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.sumArrays();
        obj.maxMarks();
    }
    
}
