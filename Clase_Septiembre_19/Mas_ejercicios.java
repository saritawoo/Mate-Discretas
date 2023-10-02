package Clase_Septiembre_19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Mas_ejercicios {

    public static void main(String[] args) {

        Set<Integer> conjuntoC = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> conjuntoD = new HashSet<>(Arrays.asList(1, 2, 3));

        // Complemento de conjunto A con respecto al conjunto universal U
        Set<Integer> conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Set<Integer> complemento = new HashSet<>(conjuntoUniversal);
        complemento.removeAll(conjuntoC);
        System.out.println("Complemento de C: " + complemento);

        // Subconjunto o igual (C ⊆ D)
        boolean esSubconjuntoOIgual = conjuntoC.containsAll(conjuntoD);
        System.out.println("C es subconjunto o igual a D: " + esSubconjuntoOIgual);

        // Subconjunto propio (C ⊂ D)
        boolean esSubconjuntoPropio = conjuntoC.containsAll(conjuntoD) && !conjuntoC.equals(conjuntoD);
        System.out.println("C es subconjunto propio de D: " + esSubconjuntoPropio);

        // Conjunto universal (U) en este caso es conjuntoUniversal
        System.out.println("Conjunto Universal: " + conjuntoUniversal);
    }
}
