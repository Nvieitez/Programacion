package boletín7_5;

import javax.swing.JOptionPane;

public class Boletín7_5 {

public static void main(String[] args) {
        
// Declaración de los datos
    double Num1M;
    double Num2M;
    double Num3M;
   
// Creamos el objeto
    Condicionales ObjCond = new Condicionales();
    
// Código para pedir los datos
    Num1M = Double.parseDouble(JOptionPane.showInputDialog("Escribe el primer número"));
    Num2M = Double.parseDouble(JOptionPane.showInputDialog("Escribe el segundo Número"));
    Num3M = Double.parseDouble(JOptionPane.showInputDialog("Escribe el tercer número"));

// Dar valores
    Num1M = ObjCond.GetNum1(Num1M);
    Num2M = ObjCond.GetNum2(Num2M);
    Num3M = ObjCond.GetNum3(Num3M);
    
// Resultado
    System.out.println("Siendo los números "+ ObjCond.GetNum1(Num1M)+ ", "+ ObjCond.GetNum2(Num2M)+ " y "+ ObjCond.GetNum3(Num3M));
    ObjCond.ValoraciónDatos();
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
