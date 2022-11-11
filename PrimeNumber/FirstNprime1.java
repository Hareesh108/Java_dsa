package PrimeNumber;

import java.util.Scanner;

public class FirstNprime1 {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 2, i;
        while (n > 0) {
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                System.out.println(i);
                n--;
            }
            if(n == 0) break;
            num++;
        }
    }
}
