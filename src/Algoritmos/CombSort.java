package Algoritmos;

import app.SortAlgorithm;
import app.SortUtils;
import app.Stats;

public class CombSort implements SortAlgorithm {
    public String name() { return "Comb"; }
    public Stats sort(int[] a) {
        Stats s = new Stats();
        long t0 = System.nanoTime();

        int n = a.length, gap = n;
        boolean sorted = false;
        double shrink = 1.3;

        while (!sorted) {
            gap = (int)(gap / shrink);
            if (gap <= 1) { gap = 1; sorted = true; }
            for (int i = 0; i + gap < n; i++) {
                s.comps++;
                if (a[i] > a[i + gap]) {
                    SortUtils.swap(a, i, i + gap, s);
                    sorted = false;
                }
            }
        }

        s.nanos = System.nanoTime() - t0;
        return s;
    }
}