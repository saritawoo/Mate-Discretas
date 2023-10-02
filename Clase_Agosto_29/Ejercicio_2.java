
package Clase_Agosto_29;

import java.util.*;
import javax.swing.JOptionPane;

public class Ejercicio_2 {


    public static void main(String[] args) {
        
        System.out.println("Ejercicio 2: Sistema autenticación");
        System.out.println("");
        
        String u = "", c = "";
        
        u = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
        System.out.println("nombre usuario: "+u);
        c = JOptionPane.showInputDialog("Ingrese la contraseña");
        System.out.println("contraseña: "+c);
        if(u.equals("usuario123") && c.equals("contraseña456")){
            System.out.println("Acceso concedido");
            
            
        }else{
            System.out.println("Acceso denegado");
    }
        
    }
    
}
