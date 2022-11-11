package PrimeNumber;

public class Range {
        public static void Range(int n1, int n2){
            for (int i=n1; i<n2; i++ ) {
                int flage = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flage = 1;
                        break;
                    }
                }
                if (flage == 0) {
                    System.out.println(i);
                }
            }

        }

        public static void main(String[] args) {
            Range(10,100);
        }

}
