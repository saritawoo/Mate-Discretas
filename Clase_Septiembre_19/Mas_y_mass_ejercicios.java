package Clase_Septiembre_19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Mas_y_mass_ejercicios {

    public static void main(String[] args) {

        Set<String> conjuntoA = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> conjuntoB = new HashSet<>(Arrays.asList("z", "y", "x"));

        // Pertenece a (verificar si un elemento está en un conjunto)
        String elemento = "a";
        boolean perteneceA = conjuntoA.contains(elemento);
        System.out.println("¿" + elemento + " pertenece a A? " + perteneceA);

        // No pertenece a (verificar si un elemento no está en un conjunto)
        String elemento2 = "w";
        boolean noPerteneceB = !conjuntoB.contains(elemento2);
        System.out.println("¿" + elemento2 + " no pertenece a B? " + noPerteneceB);
    }
}
