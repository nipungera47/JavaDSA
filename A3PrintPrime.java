import java.util.Scanner;

public class A3PrintPrime {
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Scanner scn1 = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int i = low ; i <= high ; i++)
        {
            int cnt = 0;
            for(int j = 2 ; j*j <= i ; j++)
            {
                if(i % j == 0)
                {
                    cnt++;
                    break;
                }
            }

            if(cnt == 0)
            {
                System.out.println(i);
            }
        }
    }
}
