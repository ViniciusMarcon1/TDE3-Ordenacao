package app;

import Algoritmos.*;

public class Main {
    static void roda(String titulo, int[] base, SortAlgorithm[] algs) {
        System.out.println("\n--->> " + titulo + " <<---");
        for (int i = 0; i < algs.length; i++) {
            int[] v = SortUtils.copia(base);
            Stats s = algs[i].sort(v);
            System.out.println(SortUtils.formata(algs[i].name(), s));
        }
    }

    public static void main(String[] args) {
        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        SortAlgorithm[] algs = new SortAlgorithm[] {
                new CombSort(),
                new GnomeSort(),
                new BucketCountingSort(),
                new BubbleFlagSort(),
                new SelectionSort(),
                new CocktailSort()
        };

        roda("Vetor 1 (aleatório pequeno)", vetor1, algs);
        roda("Vetor 2 (já ordenado)",       vetor2, algs);
        roda("Vetor 3 (decrescente)",       vetor3, algs);
    }
}