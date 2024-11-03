//Print the first multiple of 5 which is also multiple of 7
//"Break" Keyword
public class Exercise2 {
    public static void main(String[] args) {
        int res=1;
        int i=1;
        System.err.println("First multiple of 5 which is also a multiple of 7 :");

        //Using For Loop
        for(;i==1;)
        {
            if(res%7==0 && res%5==0)
            {
                System.out.println("Answer Found:"+res);
                break;
            }
            res++;
        }

        //By using While Loop
        // while (true) {

        //     if(res%7==0 && res%5==0)
        //     {
        //         System.out.println("Answer Found:"+res);
        //         break;
        //     }

        //     res++;
           
        // }
    }
    
}
