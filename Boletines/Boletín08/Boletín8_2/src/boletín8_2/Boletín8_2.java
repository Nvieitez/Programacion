package boletín8_2;

import javax.swing.JOptionPane;

public class Boletín8_2 {

public static void main(String[] args) {
        
// Declaración de los datos
    int Opción = 0;
    
    double LadoCuadrado;
    double AreaCuadrado;
    
    double BaseTriángulo;
    double AlturaTriángulo;
    double AreaTriángulo;
    
    final double Pi = 3.14;
    double RadioCírculo;
    double AreaCírculo;
    
    
// Creación del menú
    do{
        
    Opción = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número del area quieres calcular" + "\n1: Cuadrado" + "\n2: Triángulo" + "\n3: Círculo" + "\n" + "\n0: Salir"));

    switch (Opción){
        
        case 0 -> {
            JOptionPane.showInputDialog("Apagando...");
        }
        case 1 -> {
            LadoCuadrado = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor del lado de tu cuadrado"));
            AreaCuadrado = LadoCuadrado * LadoCuadrado;
            JOptionPane.showInputDialog("El area de tu cuadrado es: " + AreaCuadrado);
        }
        case 2 -> {
            BaseTriángulo = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de la base de tu triángulo"));
            AlturaTriángulo = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de la altura de tu triángulo"));
            AreaTriángulo = (BaseTriángulo * AlturaTriángulo)/2;
            JOptionPane.showInputDialog("El area de tu Triángulo es: " + AreaTriángulo);
        }
        
        case 3 -> {
            RadioCírculo = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor del radio de tu círculo"));
            AreaCírculo = Pi * (RadioCírculo * RadioCírculo);
            JOptionPane.showInputDialog("El area de tu círculo es: " + AreaCírculo);
        }
        
        default -> {
            JOptionPane.showInputDialog("El número que has insertado no es válido");
        }
        
    }
    
    } while (Opción > 0);
    
    }
}