import java.util.*;
public class Primes {
    public static void main(String[] args) {
        int N = 31;
        int[] primes = new int [N];
        int count = 0;

        for (int i=2; i<=N; i++) {
            boolean prime = true;
            for (int j=0; j<count; j++) {
                if (i % primes[j] == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes[count++] = i;
            }

        }
        System.out.println(Arrays.toString(primes));

    }
}