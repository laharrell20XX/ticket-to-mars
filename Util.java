import java.util.Random;

public class Util {
    public static int randint(int low, int hi) {
        return (int) Math.floor(Math.random() * (hi - low)) + low;
    }

    public static int randint(int hi) {
        return randint(0, hi);
    }

    public static <A> A choice(A[] things) {
        return things[randint(things.length - 1)];
    }
}