
public class Primes {
    public static void main(String[] args) {
        int N = 32;
        boolean[] a;
        try {
            a = new boolean [N];
        }
        catch (OutOfMemoryError e) {
            System.out.println ("Out of memory");
            return;
        }
        for (int i = 2; i < N; i++) a[i] = true;

        for (int i = 2; i < N; i++)
            if (a[i] != false)
                for (int j = i; j * i < N; j++)
                    a[i*j] = false;

        for (int i = 2; i < N; i++)
            if (i > N - 100)
                if (a[i]) System.out.println(" " + i);

        System.out.println();
    }
}
