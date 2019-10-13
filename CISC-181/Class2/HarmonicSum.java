public class HarmonicSum {
    public static void main (String[] args) {
        System.out.println(HSLeftToRight(50000));
        System.out.println(HSRightToLeft(50000));
    }

    public static double HSLeftToRight(int maxDenom) {
        double sumL2R = 0.0;
        for (int n=1; n <= maxDenom; n++) {
            sumL2R += (double)(1.0/n);
        }
        return (sumL2R);
    }

    public static double HSRightToLeft(int maxDenom) {
        double sumR2L = 0.0;
        for (int n = maxDenom; n >= 1; n--) {
            sumR2L += (double)(1.0/n);
        }
        return (sumR2L);
    }
}