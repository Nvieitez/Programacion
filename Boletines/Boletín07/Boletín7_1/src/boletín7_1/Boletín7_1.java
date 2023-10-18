package boletín7_1;

import javax.swing.JOptionPane;

public class Boletín7_1 {

public static void main(String[] args) {
    
// Declaración de los atributos
    int Num1M;

// Creación del objeto
    Condicionales ObjCond = new Condicionales();
    
// Código para pedir los datos
    Num1M = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número"));
    
// Dar Valores
    Num1M = ObjCond.GetNum(Num1M);
    
// Resultado
    System.out.println("Tú número es "+Num1M);
    ObjCond.Positivo();
    }
    
}
