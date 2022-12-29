public class ClosePoint {

    public static void main(String[] args) {
        int cnt = 0, N = 32;
        double d = 2.5;
        Point[] a = new Point [N];
        for (int i = 0; i < N; i++) {
            a[i] = new Point ();
        }
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (a[i].distance(a[j]) < d) cnt++;
            }
        }
        System.out.println(cnt + " pairs ");
        System.out.println("closer than " + d);
    }
}
