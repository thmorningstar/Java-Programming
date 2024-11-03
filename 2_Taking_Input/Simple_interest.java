import java.util.Scanner;

public class Simple_interest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter Priniple amount");
        float p=sc.nextInt();
        System.out.println("Enter Time period");
        float t=sc.nextInt();
        System.out.println("Enter Rate of interest");
        float r=sc.nextInt();

        float interest= (p*r*t)/100;
        System.out.println("Total interst on the given amount is " +interest); 

        sc.close();

        
    }

    
}
