package boletín7_3;

import javax.swing.JOptionPane;

public class Boletín7_3 {

public static void main(String[] args) {

// Declaración de los datos
    double Num1M;
    
// Creación del Objeto
    Condicionales ObjCond = new Condicionales();
    
// Código para pedir los datos
    Num1M = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número que se desee valorar"));

// Dar valores
    Num1M = ObjCond.GetNum1(Num1M);
    
// Resultado
    System.out.println("Su número es "+ ObjCond.GetNum1(Num1M));
    ObjCond.ComprobaciónValor();
    }
    
}
