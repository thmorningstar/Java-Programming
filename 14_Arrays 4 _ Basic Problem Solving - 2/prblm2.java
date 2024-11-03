//Given two values A and B. Swap them using sum and difference method

import java.util.Scanner;

public class prblm2 {

    static void swap(int x, int y)
    {
        System.out.println("Before swapped A = "+x + " B = "+y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapped A = "+x + " B = "+y);

    } 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a, b);
        sc.close();

    }

    
}
