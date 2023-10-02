
package Clase_Agosto_29;

import javax.swing.JOptionPane;

public class Ejercicio_10 {

    public static void main(String[] args) {
       
        System.out.println("Ejercicio 2: Sistema autenticación de dos factores");
        System.out.println("");
        
        String u = "", c = "";
        
        u = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
        System.out.println("nombre usuario: "+u);
        c = JOptionPane.showInputDialog("Ingrese el codigo de verificación");
        System.out.println("contraseña: "+c);
        
        if(u.equals("usuario123") && c.equals("codigo456")){
            System.out.println("Acceso concedido");
           
        }else{
            System.out.println("Acceso denegado");
        }
    }      
}
