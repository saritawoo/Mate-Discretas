
package Clase_Agosto_29;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static void main(String[] args) {
     
        System.out.println("Ejercicio 1: Comprobar si el numero ingresado es divisible por 5 y 3");
        System.out.println("");
        
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
        System.out.println("El numero que ingreso fue: "+n);
        
        if(n %3 ==0 && n %5 ==0){
            System.out.println("Es divisible por 3 y 5");
        }else{
            System.out.println("No es divisible por 3 y 5");

    }
    
}
}
