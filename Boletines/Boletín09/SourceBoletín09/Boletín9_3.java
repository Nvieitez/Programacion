package boletín9_3;

import javax.swing.JOptionPane;

public class Boletín9_3 {

public static void main(String[] args) {

// Declaración de los datos
    double Base;
    double Altura;
    
    double Area;
    
// Comprobación de los números
    do {
        Base = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de la base de tu rectángulo"));
        if (Base < 0){
           System.out.println("El valor de la altura introducido no es válido"); 
        }
    } while (Base < 0);
    
    do {
        Altura = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de la altura de tu rectángulo"));
        if (Altura < 0){
            System.out.println("El valor de la base introducido no es válido");
        }
    } while (Altura < 0);
    
// Cálculo
    Area = Base * Altura;
    
// Resultado
    System.out.println("Siendo el valor de la base " + Base + " y el de la altura " + Altura + "\nEl resultado del Area es " + Area);
     
    }
    
}
