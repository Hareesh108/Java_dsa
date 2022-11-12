package IntermediatePrograms;

public class Recursion {
    public static void main(String[] args) {
        int n = 4;
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println(fact);

        System.out.println(Factorial(4));

        System.out.println(Multiplication(25));

        System.out.println(Addition(555));

        System.out.println(FibonacciNth(10));

        int number = 1221;
        int reverseNumber = Palindrome(number);
        System.out.println(reverseNumber == number);
    }

    public static int Factorial(int num)
    {
        if (num == 0) return 1;

        else return (num * Factorial(num-1));
    }

    public static int Multiplication(int num)
    {
        if (num == 0) return 1;

        else return (num % 10 * Multiplication(num/10));
    }

    public static int Addition(int num)
    {
        if (num == 0) return 0;

        else return (num % 10 + Addition(num/10));
    }

    public static int FibonacciNth(int num)
    {
        if(num <= 1) return num;
        else return FibonacciNth(num-1) + FibonacciNth(num-2);
    }

    public static int Palindrome(int num)
    {
        if (num == 0) return 0;

        else return (num % 10 + Palindrome(num-1));
    }




}
