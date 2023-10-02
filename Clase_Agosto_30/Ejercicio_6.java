package Clase_Agosto_30;

import javax.swing.JOptionPane;

public class Ejercicio_6 {

    public static void main(String[] args) {

        // Solicitar información al cliente
        boolean cuentaActiva = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿Tiene una cuenta activa? (true/false)"));
        boolean productoEnStock = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿El producto está en stock? (true/false)"));
        boolean metodoDePagoValido = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿Tiene un método de pago válido registrado? (true/false)"));
        boolean haIniciadoSesion = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿Ha iniciado sesión? (true/false)"));

        // Verificar si el cliente puede realizar una compra
        boolean puedeComprar = cuentaActiva && productoEnStock && metodoDePagoValido && haIniciadoSesion;

        // Mostrar un mensaje de acuerdo al resultado
        if (puedeComprar) {
            JOptionPane.showMessageDialog(null, "El cliente puede realizar una compra en la aplicación.");
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no cumple con las condiciones para realizar una compra.");
        }
    }
}
    
