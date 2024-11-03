//Given two values A and B. Swap them using temp variables

import java.util.Scanner;

public class prblm1 {

    static void swap(int num1, int num2)
    {
        int temp;

        System.out.println("Before swapped A = "+num1 + " B = "+num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapped A ="+num1 + " B ="+num2);
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
