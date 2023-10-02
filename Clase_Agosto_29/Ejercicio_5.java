package Clase_Agosto_29;

import java.util.*;
import javax.swing.JOptionPane;

public class Ejercicio_5 {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 5: Comprobar si un numero entero es negativo");
        System.out.println("");
        
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
        System.out.println("El numero que ingreso fue: "+n);
        
        if(n>0){
            System.out.println("Número válido");
        }else{
            System.out.println("Número inválido");

    }
    
}
}
