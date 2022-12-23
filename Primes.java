// More changes Dec 23

<<<<<<< HEAD
//package ch3;
// Changes on home laptop
=======
// Add a comment to see how changes are reflected in GitHub repo

package ch3;
>>>>>>> c67af9479f03393b567806299a870e3884c127c7

public class Primes {
    public static void main(String[] args) {
        int N = 32;
        boolean[] a = new boolean [N];
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
