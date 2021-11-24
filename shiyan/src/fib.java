import java.math.BigInteger;

public class fib {
    public static void main(String[] args) {

        BigInteger[] b = new BigInteger[101];
        b[1] = BigInteger.valueOf(1);
        b[2 ]= BigInteger.valueOf(1);
        for (int i = 3; i <=100; i++) {
            b[i] = b[i - 1].add(b[i - 2]);
        }
        for (int i = 1; i <=100; i++) {
            System.out.print(b[i]+" ");
            if(i%5==0) System.out.println();
        }

    }
}
