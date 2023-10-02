package Clase_Agosto_30;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static void main(String[] args) {

        System.out.println("Ejercicio 3: Diseño de seguridad en una red de computadoras");
        System.out.println("");

        // Valores de verdad para las proposiciones
        boolean P; // Si un usuario tiene acceso a los servidores internos, entonces debe tener autenticación de dos factores
        boolean Q; // Si un usuario tiene autenticación de dos factores, entonces tiene acceso a ciertos recursos confidenciales
        boolean R; // Si un usuario tiene acceso a ciertos recursos confidenciales, entonces se registra su actividad

        // Comprobar si el evento es un éxito
        String D;
        D = JOptionPane.showInputDialog("¿El usuario tiene acceso a los servidores?");

        if (D.equals("Si") || D.equals("si")) {
            P = true;
            Q = true;
            R = true;
            System.out.println("El usuario tiene acceso a los servidores internos, "
                    + "por lo tanto tiene autenticación de dos factores y tiene "
                    + "acceso a ciertos recursos confidenciales");

        } else {
            P = false;
            Q = false;
            R = false;
            System.out.println("El usuario no cuenta con autenticacion de dos factores "
                    + "por lo tanto no tiene acceso a ciertos recursos confidenciales y "
                    + "no se registra su actividad");

        }

    }
}
