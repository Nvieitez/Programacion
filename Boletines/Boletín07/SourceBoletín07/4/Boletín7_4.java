package boletín7_4;

import javax.swing.JOptionPane;

public class Boletín7_4 {

public static void main(String[] args) {
    
// Declaración de los datos
    String Nombre1M;
    String Nombre2M;
    
    double Peso1;
    double Peso2;
    
// Creación del objeto
    Condicionales ObjCond = new Condicionales();
    
// Código para pedir los datos
    Nombre1M = JOptionPane.showInputDialog("Escribe el nombre de la primera persona");
    Nombre2M = JOptionPane.showInputDialog("Escribe el nombre de la segunda persona");
    
    Peso1 = Double.parseDouble(JOptionPane.showInputDialog("Escribe el peso de la primera persona"));
    Peso2 = Double.parseDouble(JOptionPane.showInputDialog("Escribe el peso de la segunda persona"));

// Dar valores
    Nombre1M = ObjCond.GetNombre1(Nombre1M);
    Nombre2M = ObjCond.GetNombre2(Nombre2M);
    
    Peso1 = ObjCond.GetPeso1(Peso1);
    Peso2 = ObjCond.GetPeso2(Peso2);
    
// Resultado
    System.out.println("Siendo sus nombres "+ ObjCond.GetNombre1(Nombre1M)+ " y "+ ObjCond.GetNombre2(Nombre2M)+ " y sus respectivos pesos son "+ ObjCond.GetPeso1(Peso1)+ " y "+ ObjCond.GetPeso2(Peso2));
    ObjCond.ValoraciónPeso();
    }
    
}
