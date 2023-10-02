package Clase_Agosto_30;

import javax.swing.JOptionPane;

public class Ejercicio_4 {

    public static void main(String[] args) {

        System.out.println("Ejercicio 4: Sistema de Control de Acceso");
        System.out.println("");

        boolean C, I, T;
        String Credenciales, iP, empleado;

        Credenciales = JOptionPane.showInputDialog("¿El usuario tiene credenciales de administrador?");
        iP = JOptionPane.showInputDialog("¿Tiene una direccion IP permitida?");
        empleado = JOptionPane.showInputDialog("¿Es empleado temporal?");

        if (Credenciales.equals("Si") || Credenciales.equals("si")) {
            C = true;
        } else {
            C = false;
        }

        if (iP.equals("Si") || iP.equals("si")) {
            I = true;
        } else {
            I = false;
        }

        if (empleado.equals("Si") || empleado.equals("si")) {
            T = true;
        } else {
            T = false;
        }

        if (C == true || T == true) {
            System.out.println("El usuario puede acceder ya que es un administrador o empleado temporal");
        } else if (I == true) {
            System.out.println("El usuario puede acceder su direccion IP es válida");
        } else {
            System.out.println("El usuario no puede acceder");
        }

    }
}
