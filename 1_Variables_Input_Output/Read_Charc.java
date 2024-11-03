//Program to read chracter of a string

import java.util.Scanner;
public class Read_Charc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string:");
        char ch=sc.next().charAt(3);
        System.out.println("3rd character of the string: " +ch);
        sc.close();

    }
    
    
}
