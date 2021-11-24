import java.util.Random;

public class MySeason {

    public static final int SORING=0;

    public static void main(String[] args) {
        System.out.println(MySeason.SORING);
        int a;
        a = new Random().nextInt(4);
        int b = (int) (4 * Math.random());
        System.out.println(a);
    }
}

