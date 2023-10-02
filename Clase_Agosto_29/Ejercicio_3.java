
package Clase_Agosto_29;

import java.util.*;
import javax.swing.JOptionPane;

public class Ejercicio_3 {
   
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 3: Comprobar si el numero ingresado es par o multiplo de 3");
        System.out.println("");
        
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
        System.out.println("El numero que ingreso fue: "+n);
        
        if(n %2 ==0 || n %3 ==0){
            System.out.println("Es par o múltiplo de 3");
        }else{
            System.out.println("No es ni par ni múltiplo de 3");
        } 
    }
}

