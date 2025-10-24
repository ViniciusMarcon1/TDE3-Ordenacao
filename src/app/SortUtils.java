package app;

public class SortUtils {
    public static int[] copia(int[] v) {
        int[] w = new int[v.length];
        for (int i = 0; i < v.length; i++) w[i] = v[i];
        return w;
    }
    public static void swap(int[] a, int i, int j, Stats s) {
        int t = a[i]; s.moves++;
        a[i] = a[j];  s.moves++;
        a[j] = t;     s.moves++;
    }
    public static String formata(String rotulo, Stats s) {
        long ms = s.nanos / 1_000_000L;
        return rotulo + " -->> tempo: " + s.nanos + " ns (~" + ms + " ms), " +
                "comparações: " + s.comps + ", movimentos: " + s.moves;
    }
}