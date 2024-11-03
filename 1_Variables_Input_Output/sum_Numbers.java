import java.util.Scanner;

public class sum_Numbers {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st numbers:");
    int a=sc.nextInt();

    System.out.println("Enter 2nd numbers:");
    int b=sc.nextInt();

    int sum = a + b;

    System.out.println("Sum of these two numbers is " +sum);

    sc.close();
   } 
}
