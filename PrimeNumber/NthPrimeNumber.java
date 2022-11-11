package PrimeNumber;

public class NthPrimeNumber {
    public static int Nth(int num){
        int i,j;
        int count = 0;
        for (i=2; i>1; i++ ) {
            int flage = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flage = 1;
                    break;
                }
            }
            if (flage == 0) {
                count++;
            }
            if (count == num) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = Nth(10);
        System.out.println(n);
    }
}
