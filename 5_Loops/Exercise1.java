//Print the sum of the stream of integer in the input
//"Break" Keyword
import java.util.*;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any integer:");
        int num=sc.nextInt();
        int res=0;
        int i=0;

        while (i==0) {
            res=res+num;
            num=sc.nextInt();

            if(num==-1)
            {
                break;
            }
            
        }


        System.out.println("The sum of the stream of the integer:"+res);

        sc.close();

    }
    
}
