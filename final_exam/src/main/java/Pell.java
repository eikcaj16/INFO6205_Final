public class Pell {
    public Pell() {
    }

    public long get(int n) {
        long res = 0;
        // Bottom-up method.
        // Avoid the repeated calculation of the same value when doing top-down algorithm.
        long last = 1;
        long lastlast = 0;
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");
        else if (n == 0) {
            res = lastlast;
        } else if (n == 1) {
            res = last;
        } else {
            // Bottom-up method
            for (int i = 2; i <= n; i++) {
                res = 2 * last + lastlast;
                lastlast = last;
                last = res;
            }
        }
        return res;
    }
}
