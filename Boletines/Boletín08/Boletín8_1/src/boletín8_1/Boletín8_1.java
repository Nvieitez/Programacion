package boletín8_1;

import javax.swing.JOptionPane;

public class Boletín8_1 {

public static void main(String[] args) {
    
// Declaración de los datos
    double Ventas_AnualesM;
    
// Creación del objeto
    Condicionales ObjCond = new Condicionales();
      
// Código para pedir los datos
    Ventas_AnualesM = Double.parseDouble(JOptionPane.showInputDialog("Escribe aquí el número de ventas anuales"));
    
// Dar Valores
    Ventas_AnualesM = ObjCond.GetVentas(Ventas_AnualesM);
    
// Resultado
    System.out.println("Siendo tus ventas " + ObjCond.GetVentas(Ventas_AnualesM));
    ObjCond.ValoraciónProductos();
    
    }
    
}
