package PrimeNumber;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstNprime {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num=2, i, count=0;
        while (count < n){
            for (i = 2; i<num; i++){
                if(num % i == 0){
                    break;
                }
            }
            if (i == num){
                System.out.println(i);
                count++;
            }
            num++;
        }
    }
}
