package boletín6_1;

import javax.swing.JOptionPane;

public class Boletín6_1 {

public static void main(String[] args) {
        
// Declaración de los atributos
    int VelocidadM;
    double AceleraciónM;
    double FrenadaM;
    
    double VelocidadA;
    double VelocidadF;
    
// Creamos el objeto
    Coche ObjCoche = new Coche();
    
// Código para pedir los datos
    VelocidadM = 0;
    AceleraciónM = Double.parseDouble(JOptionPane.showInputDialog("Escribe la aceleración"));
    FrenadaM = Double.parseDouble(JOptionPane.showInputDialog("Escribe la frenada"));
    
// Dar Valores
    VelocidadM = ObjCoche.GetVelocidad(VelocidadM);
    AceleraciónM = ObjCoche.GetAcelerar(AceleraciónM);
    FrenadaM = ObjCoche.GetFrenar(FrenadaM);
    
// Cálculo de las velocidades
    VelocidadA = ObjCoche.GetVelocidad(VelocidadM) + ObjCoche.GetAcelerar(AceleraciónM);
    VelocidadF = VelocidadA - ObjCoche.GetFrenar(FrenadaM);
    
// Resultado

    System.out.println("Siendo la velocidad 0"+ ("\nLa velocidad total contando con la aceleración es "+ VelocidadA+ "\nLa velocidad total contando con la frenada es de "+ VelocidadF));
    }
    
}
