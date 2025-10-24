package Algoritmos;

import app.SortAlgorithm;
import app.Stats;

public class BucketCountingSort implements SortAlgorithm {
    public String name() { return "Bucket(Counting)"; }
    public Stats sort(int[] a) {
        Stats s = new Stats();
        long t0 = System.nanoTime();

        if (a.length <= 1) { s.nanos = System.nanoTime() - t0; return s; }

        int min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            s.comps++; if (a[i] < min) min = a[i];
            s.comps++; if (a[i] > max) max = a[i];
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (int i = 0; i < a.length; i++) {
            int idx = a[i] - min;
            count[idx]++; s.moves++; // gravação no balde
        }

        int k = 0;
        for (int v = 0; v < range; v++) {
            int c = count[v];
            while (c > 0) {
                a[k] = v + min; s.moves++;
                k++; c--;
            }
        }

        s.nanos = System.nanoTime() - t0;
        return s;
    }
}
