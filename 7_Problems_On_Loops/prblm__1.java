// //Print rectangle pattern

import java.util.*;

public class prblm__1 {

    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number columns:");
        int c = sc.nextInt();

        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

}
