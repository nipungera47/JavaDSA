import java.util.Scanner;

public class A5CountDigit {
    public static void main(String[] args) {
        /*
         * You've to count the number of digits in a number.
         * 2. Take as input "n", the number for which the digits has to be counted.
         * 3. Print the digits in that number.
         */

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);

    }

}
