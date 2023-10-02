
package Clase_Agosto_29;

import javax.swing.JOptionPane;

public class Ejercicio_6 {

    public static void main(String[] args) {
        
    System.out.println("Ejercicio 6: Aprobar examen");
        System.out.println("");
        
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el puntaje del examen del estudiante"));
        System.out.println("El puntaje del estudiante es: "+n);
        
        if(n<60){
            System.out.println("Estudiante no aprobado");
        }else{
            System.out.println("Estudiante aprobado");

    }
    
}
}
