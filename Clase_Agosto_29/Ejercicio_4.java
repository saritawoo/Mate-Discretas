package Clase_Agosto_29;

import java.util.*;
import javax.swing.JOptionPane;

public class Ejercicio_4 {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 4: Sistema de permisos");
        System.out.println("");
        
        String u = "";
        int p;
        
        u = JOptionPane.showInputDialog("Ingrese su cargo");
        System.out.println("El cargo del usuario es: "+u);
        
        p = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntosde experiencia"));
        System.out.println("puntos de experiencia: "+p);
        
        if(u.equals("administrador") || p>1000 ){
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Acceso denegado");
        }        
    }    
}
