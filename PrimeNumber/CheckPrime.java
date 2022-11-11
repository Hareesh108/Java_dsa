package PrimeNumber;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int flage = 0;
        for (int i = 2; i< num/2; i++)
        {
            if (num % i == 0){
                flage = 1;
                System.out.println("This is not a number");
                break;
            }
        }
        if(flage == 0)
        {
            System.out.println("This is prime number");
        }
    }
}
