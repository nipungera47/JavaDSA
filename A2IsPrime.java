import java.util.*;
  
  public class A2IsPrime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
       // write ur code here
        int t = scn.nextInt();

        for(int i=0 ; i<t;i++ )
        {
            int n = scn.nextInt();
            int count = 0;
            for(int j=2 ; j<=2n/2 ; j++)
            {
                if(n%j == 0)
                {
                    count++;
                }
            }

            if(count == 0)
            {
                System.out.println("prime");
            }
            else
            {
                System.out.println("not prime");
            }
        }
        
   
    }

  
   }
  