package Clase_Agosto_30;

import javax.swing.JOptionPane;

public class Ejercicio_5 {

    public static void main(String[] args) {

        // Solicitar la edad del usuario
        String edadStr = JOptionPane.showInputDialog(null, "Por favor, ingrese su edad:");
        int edad = Integer.parseInt(edadStr);

        // Solicitar la dirección de correo electrónico del usuario
        String correoElectronico = JOptionPane.showInputDialog(null, "Por favor, ingrese su dirección de correo electrónico:");

        // Solicitar si el usuario tiene multas pendientes
        int opcion = JOptionPane.showConfirmDialog(null, "¿Tiene multas pendientes en su cuenta de la biblioteca?", "Multas Pendientes", JOptionPane.YES_NO_OPTION);
        boolean tieneMultasPendientes = opcion == JOptionPane.YES_OPTION;

        // Verificar si el usuario cumple con las condiciones de registro
        boolean puedeRegistrarse = (edad > 18) && (correoElectronico.contains("@")) && (!tieneMultasPendientes);

        // Mostrar un mensaje de acuerdo al resultado
        if (puedeRegistrarse) {
            JOptionPane.showMessageDialog(null, "El usuario puede registrarse en la biblioteca.");
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no cumple con las condiciones para registrarse en la biblioteca.");
        }
    }
}
