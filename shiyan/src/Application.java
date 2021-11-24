public class Application {
    public static int isPrime(int n) {
        if (n == 2 || n == 3) return 1;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return 0;
        }
        return 1;
    }

    public static void judgement(int n, int m) {
        for (int i = n; i < m; i++) if (isPrime(i) == 1) System.out.print(i + "  ");
    }

    public static void main(String[] args) {
        judgement(2, 100);
    }


}