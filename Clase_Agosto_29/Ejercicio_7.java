
package Clase_Agosto_29;

import javax.swing.JOptionPane;

public class Ejercicio_7 {

    public static void main(String[] args) {
      
        System.out.println("Ejercicio 7: Solicitar tarjeta de crédito");
        System.out.println("");
        
        int n;
        String d = "";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los ingresos mensuales"));
        System.out.println("Sus ingresos mensuales son: "+n);
        
        d = JOptionPane.showInputDialog("¿Tiene deudas pendientes? (Sí/No):");
        System.out.println("Tiene deudas: "+d);
        
        if(n>2000 && d.equalsIgnoreCase("No")){
            
            System.out.println("Puede solicitar una tarjeta de crédito");
        }else{
            System.out.println("No puede solicitar una tarjeta de crédito");
        }
    }
}
   
    

