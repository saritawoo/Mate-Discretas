
package Clase_Agosto_29;

import javax.swing.JOptionPane;


public class Ejercicio_9 {

    public static void main(String[] args) {
      
        System.out.println("Ejercicio 1: Comprobar si un numero es par si y solo si es divisible por 2");
        System.out.println("");
        
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
        System.out.println("El numero que ingreso fue: "+n);
        
        if(n %2 ==0){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }   
    }
}
