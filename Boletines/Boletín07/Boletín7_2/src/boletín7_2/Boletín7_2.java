package boletín7_2;

import javax.swing.JOptionPane;

public class Boletín7_2 {

public static void main(String[] args) {

// Declaración de los datos
    short Num1M;
    short Num2M;
    
// Creación el objeto
    Condicionales ObjCond = new Condicionales();
    
// Código para pedir los datos
    Num1M = Short.parseShort(JOptionPane.showInputDialog("Escribe el primer número"));
    Num2M = Short.parseShort(JOptionPane.showInputDialog("Escribe el segundo número"));
    
// Dar valores
    Num1M = ObjCond.GetNum1(Num1M);
    Num2M = ObjCond.GetNum2(Num2M);
    
// Resultado
    System.out.println("El primer número es "+ObjCond.GetNum1(Num1M)+ " y el segundo número es "+ObjCond.GetNum2(Num2M));
    ObjCond.Cálculo();
    }
    
}
