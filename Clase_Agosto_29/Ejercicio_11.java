
package Clase_Agosto_29;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_11 {

    public static void main(String[] args) {
        
      // Solicitar si el usuario tiene credenciales de administrador
        String credencialesAdministrador = JOptionPane.showInputDialog("¿Tiene credenciales de administrador? (Sí/No):");

        // Solicitar si la dirección IP está permitida
        String ipPermitida = JOptionPane.showInputDialog("¿Su dirección IP está permitida? (Sí/No):");

        // Verificar las condiciones
        boolean condicion1 = credencialesAdministrador != null && credencialesAdministrador.equalsIgnoreCase("Sí");
        boolean condicion2 = ipPermitida != null && ipPermitida.equalsIgnoreCase("Sí");

        if ((condicion1 || condicion2) && !(condicion1 && condicion2)) {
            JOptionPane.showMessageDialog(null, "Acceso concedido.");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado.");
        }
    }
}
  
    

