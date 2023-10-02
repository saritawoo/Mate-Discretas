package Clase_Agosto_30;

import javax.swing.JOptionPane;

public class Ejercicio_2 {

    public static void main(String[] args) {

        System.out.println("Ejercicio 2: Planificación de eventos en una organización");
        System.out.println("");

        // Valores de verdad para las proposiciones
        boolean P; // Si se contrata a un buen orador
        boolean Q; // Si el evento es interesante
        boolean R; // Si hay una alta asistencia

        // Comprobar si el evento es un éxito
        String D;
        D = JOptionPane.showInputDialog("¿Se contrata un buen orador?");

        if (D.equals("Si") || D.equals("si")) {
            P = true;
            Q = true;
            R = true;
            System.out.println("Se contrata a un buen orador, entonces el evento será interesante");
            System.out.println("Como el evento es interesante habra alta asistencia");
            System.out.println("Al haber muchos asistentes se obtuvieron patrocinadores");

        } else {
            P = false;
            Q = false;
            R = false;
            System.out.println("No se contrata un buen orador por lo tanto el evento no es interesante");
            System.out.println("Si el evento no interesante, habra poca asistencia");
            System.out.println("Al haber pocos asistentes, no se obtienen patrocinadores");
        }

    }
}
