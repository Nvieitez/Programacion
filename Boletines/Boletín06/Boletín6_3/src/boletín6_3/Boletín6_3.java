package boletín6_3;

import javax.swing.JOptionPane;

public class Boletín6_3 {

public static void main(String[] args) {
    
// Creación del objeto
    Círculo ObjCírculo = new Círculo();
    
// Declaramos las variables
    double RadioM;
                 
// Código para pedir los datos
    RadioM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor del radio"));

// Damos valores
    RadioM = ObjCírculo.SetRadio(RadioM);
    
// Resultado
    System.out.println("El area del círculo es = "+ ObjCírculo.Area(RadioM)+ "\nY la longitud es "+ ObjCírculo.Longitud(RadioM));
    }
    
}
