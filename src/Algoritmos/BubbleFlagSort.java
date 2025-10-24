package Algoritmos;

import app.SortAlgorithm;
import app.SortUtils;
import app.Stats;

public class BubbleFlagSort implements SortAlgorithm {
    public String name() { return "Bubble(flag)"; }
    public Stats sort(int[] a) {
        Stats s = new Stats();
        long t0 = System.nanoTime();

        boolean trocou = true;
        int n = a.length;
        while (trocou) {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                s.comps++;
                if (a[i] > a[i + 1]) {
                    SortUtils.swap(a, i, i + 1, s);
                    trocou = true;
                }
            }
            n--;
        }

        s.nanos = System.nanoTime() - t0;
        return s;
    }
}
