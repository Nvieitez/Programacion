package ejerciciodiasemana;

import javax.swing.JOptionPane;

public class EjercicioDiaSemana {

public static void main(String[] args) {

// Declaración de los datos
    double NumM;
    
// Creamos el objeto
    Condicionales ObjCond = new Condicionales();
    
// Código para pedir los datos
    NumM = Double.parseDouble(JOptionPane.showInputDialog("Escibe el número de la semana"));
    
// Damos valores
    NumM = ObjCond.GetNum(NumM);
    
// Resultado
    System.out.println("Tu número es "+NumM);
    ObjCond.ValoraciónSemana(); 
    }
    
}
