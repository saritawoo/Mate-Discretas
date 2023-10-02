package Clase_Agosto_30;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static void main(String[] args) {

        System.out.println("Ejercicio 1: Lógica en la programación de videojuegos");
        System.out.println("");

        // Valores de verdad para las proposiciones     
        boolean P; // Si el dragón es amigable
        boolean Q; // Si se puede hablar con el dragón
        boolean R; // Si se revela el camino secreto

        // Verificar si el jugador puede avanzar
        
        String D;
        D = JOptionPane.showInputDialog("¿El dragon es amistoso?");

        if (D.equals("Si") || D.equals("si")) {
            P = true;
            Q = true;
            R = true;
            System.out.println(" El dragon es amigable por lo que se puede hablar con el");
            System.out.println(" Al hablar con el dragon se revela el camino secreto");
            System.out.println(" El jugador puede avanzar");

        } else {
            P = false;
            Q = false;
            R = false;
            System.out.println(" El dragon no es amigable por lo que no se puede hablar con el");
            System.out.println(" El dragon no revela el camino secreto");
            System.out.println(" El jugador no puede avanzar");
        }
    }
}
