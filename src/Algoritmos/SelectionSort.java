package Algoritmos;

import app.SortAlgorithm;
import app.SortUtils;
import app.Stats;

public class SelectionSort implements SortAlgorithm {
    public String name() { return "Selection"; }
    public Stats sort(int[] a) {
        Stats s = new Stats();
        long t0 = System.nanoTime();

        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                s.comps++;
                if (a[j] < a[minIdx]) minIdx = j;
            }
            if (minIdx != i) SortUtils.swap(a, i, minIdx, s);
        }

        s.nanos = System.nanoTime() - t0;
        return s;
    }
}
