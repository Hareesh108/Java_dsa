package PrimeNumber;

import java.util.Scanner;

public class TiilNnumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count = 0;
        for (int i=2; i<= num; i++){
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count==0) {
                System.out.println(i);
            }
        }
    }
}
