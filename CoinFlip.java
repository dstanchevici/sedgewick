// Program 3.6

import java.util.*;

class CoinFlip {

    static boolean heads ()
    {
        return Math.random () < 0.5;
    }

    public static void main (String[] argv)
    {
        int N = 32;
        int M = 1000;
        int[] f = new int [N+1];
        for (int j=0; j<M; j++) {
            int count = 0;
            for (int i = 0; i <= N; i++) {
                if (heads()) count++;
            }
            f[count]++;
        }
        for (int i=0; i<f.length; i++) {
            if (f[i] == 0) System.out.print(".");
            for (int j = 0; j < f[i]; j+=10) System.out.print("*");
            System.out.println();
        }
    }

}
