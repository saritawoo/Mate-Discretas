package Clase_Agosto_29;

import javax.swing.JOptionPane;

public class Ejercicio_8 {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 8: Determine si el jugador puede abrir la puerta");
        System.out.println("");
        
        String j = "";
               
        j = JOptionPane.showInputDialog("¿El jugador tiene la llave? (Sí/No):");
        System.out.println("¿El jugador tiene la llave?: "+j);
        
        if(j.equalsIgnoreCase("Si")){
            
            System.out.println("Puede abrir la puerta");
        }else{
            System.out.println("No puede abrir la puerta");
        }
    }
}
      