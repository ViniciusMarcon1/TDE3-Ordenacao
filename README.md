# TDE 3 -> Ordenação 
Vinicius Marcon

## Objetivo do projeto
- Comparar o desempenho dos algoritmos de ordenação: Comb Sort, Gnome Sorte e Bucket Sort com bubble sort com flag de parada, selection sort e cocktail sort, utilizando os vetores disponibilizados pelo professor: 
  - int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
  - int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
  - int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

## Estrutura
```
src/
├── app
│   ├── Main.java 
│   ├── SortAlgorithm.java
│   ├── SortUtils.java
│   └── Stats.java
│
├── Algoritmos 
    ├── BubbleFlagSort.java
    ├── BucketCountingSort.java
    ├── CocktailSort.java
    ├── CombSort.java
    ├── GnomeSort.java
    └── SelectionSort.java
```

## Resultados

### Vetor 1
```
+---------+--------------------+--------------+-------------+------------------------------------------+
| Ranking | Algoritmo          | Comparações  | Movimentos  | Observação                              |
+---------+--------------------+--------------+-------------+------------------------------------------+
| 1       | Bucket (Counting)  | 38           | 40          | Mais eficiente no geral                 |
| 2       | Selection Sort     | 190          | 54          | Poucos movimentos                       |
| 3       | Comb Sort          | 129          | 66          | Bom equilíbrio entre comparações/trocas |
| 4       | Cocktail Sort      | 154          | 234         | Eficiência média                        |
| 5       | Bubble (flag)      | 180          | 234         | Similar ao Cocktail                     |
| 6       | Gnome Sort         | 175          | 234         | Mesmo custo de trocas do Bubble         |
+---------+--------------------+--------------+-------------+------------------------------------------+
```
- Melhor em movimentos: Bucket (Counting).
- Menos comparações: Bucket (Counting).

### Vetor 2 
```
+---------+--------------------+--------------+-------------+------------------------------------------+
| Ranking | Algoritmo          | Comparações  | Movimentos  | Observação                               |
+---------+--------------------+--------------+-------------+------------------------------------------+
| 1       | Cocktail Sort      | 19           | 0           | Detectou ordenação rapidamente           |
| 2       | Bubble (flag)      | 19           | 0           | Mesmo desempenho do Cocktail             |
| 3       | Gnome Sort         | 19           | 0           | Excelente em listas ordenadas            |
| 4       | Comb Sort          | 110          | 0           | Poucas comparações, sem trocas           |
| 5       | Selection Sort     | 190          | 0           | Ineficiente neste cenário                |
| 6       | Bucket (Counting)  | 38           | 40          | Sempre linear, mas faz regravações       |
+---------+--------------------+--------------+-------------+------------------------------------------+
```
- Melhor em movimentos: Cocktail / Bubble / Gnome (empatados). 
- Menos comparações: Cocktail / Bubble / Gnome (empatados).

### Vetor 3 
```
+---------+--------------------+--------------+-------------+------------------------------------------+
| Ranking | Algoritmo          | Comparações  | Movimentos  | Observação                              |
+---------+--------------------+--------------+-------------+------------------------------------------+
| 1       | Bucket (Counting)  | 38           | 40          | Excelente, independente da ordem inicial|
| 2       | Selection Sort     | 190          | 30          | Poucos movimentos, custo fixo           |
| 3       | Comb Sort          | 129          | 54          | Bom desempenho geral                    |
| 4       | Cocktail Sort      | 190          | 570         | Elevado número de trocas                |
| 5       | Bubble (flag)      | 190          | 570         | Mesmo padrão do Cocktail                |
| 6       | Gnome Sort         | 399          | 570         | Pior caso para este algoritmo           |
+---------+--------------------+--------------+-------------+------------------------------------------+
```

- Melhor em movimentos: Bucket (Counting).
- Menos comparações: Bucket (Counting).

### Conclusão 
- Para vetores desordenados e aleatórios o melhor algoritmo foi o Bucket (Counting) porque ele identifica rapidamente comparações e faz trocas. Para vetores ordenados (caso do vetor2), os algoritmos Bubble, Cocktail e Gnome, detectam mais rápido as ordenações e fazem menos comparações. E no último caso, para vetores decrescentes, o melhor algoritmo foi o Bucket (Counting), pois segue a lógica de complexidade linear independente da ordem dos dados. 
