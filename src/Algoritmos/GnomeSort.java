package Algoritmos;

import app.SortAlgorithm;
import app.SortUtils;
import app.Stats;

public class GnomeSort implements SortAlgorithm {
    public String name() { return "Gnome"; }
    public Stats sort(int[] a) {
        Stats s = new Stats();
        long t0 = System.nanoTime();

        int i = 1, n = a.length;
        while (i < n) {
            s.comps++;
            if (i == 0 || a[i - 1] <= a[i]) {
                i++;
            } else {
                SortUtils.swap(a, i - 1, i, s);
                i--;
            }
        }

        s.nanos = System.nanoTime() - t0;
        return s;
    }
}