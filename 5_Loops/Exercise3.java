//Print all the values between 1 and 50 except for the multiple of 3
//"Continue" Keyword
public class Exercise3 {
    public static void main(String[] args) {
    
        System.out.println("Values between 1 and 50 except multiple of 3:");

        // myloop: for(int i=1; i<=50; i++)
        // {
        //     if(i%3==0)
        //     {
        //         continue myloop;
        //     }
        //     System.out.println(i);

        // }

        //Using while loop
        int num=1;
         while (num<=50) {
            if(num%3==0)
            {
                num++;
                continue;
            }
            System.out.println(num);
            num++;

         }
    }
    
}


//We can use label  with "continue" and "break" keyword : eg is given above