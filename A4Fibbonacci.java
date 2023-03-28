import java.util.Scanner;

public class A4Fibbonacci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
    
        System.out.println(a);
        System.out.println(b);
        for(int i = 0 ; i<n ; i++)
        {
            int c = a+b;
            a = b;
            b = c;
    
            System.out.println(c);
        }
        
        
    }
   
   
}
