import java.util.Scanner;

public class Taking_Input                                                                                                                                                                                            
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // System.out.println("Enter your lucky number");
        // int num=sc.nextInt();
        // System.out.println("Lucky number is "  + num);

        System.out.println("Enter the name: ");
        // String name=sc.nextLine(); /*Use to enter string with space */
        String name=sc.next();  /*Use to enter string without space  */
        System.out.println("Entered name is " + name);

        sc.close();
    }
}

// import java.util.*;

// class Taking_Input {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); // System.in is a standard input stream
//         System.out.print("Enter first number- ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number- ");
//         int b = sc.nextInt();
//         System.out.print("Enter third number- ");
//         int c = sc.nextInt();
//         int d = a + b + c;
//         System.out.println("Total= " + d);
//         sc.close();
//     }
// }
