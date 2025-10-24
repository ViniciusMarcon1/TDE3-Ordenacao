package Algoritmos;

import app.SortAlgorithm;
import app.SortUtils;
import app.Stats;

public class CocktailSort implements SortAlgorithm {
    public String name() { return "Cocktail"; }
    public Stats sort(int[] a) {
        Stats s = new Stats();
        long t0 = System.nanoTime();

        int start = 0, end = a.length - 1;
        boolean trocou = true;
        while (trocou) {
            trocou = false;
            for (int i = start; i < end; i++) {
                s.comps++;
                if (a[i] > a[i + 1]) { SortUtils.swap(a, i, i + 1, s); trocou = true; }
            }
            if (!trocou) break;
            end--;
            trocou = false;
            for (int i = end; i > start; i--) {
                s.comps++;
                if (a[i - 1] > a[i]) { SortUtils.swap(a, i - 1, i, s); trocou = true; }
            }
            start++;
        }

        s.nanos = System.nanoTime() - t0;
        return s;
    }
}
