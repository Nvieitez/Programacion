package boletín9_5;

import javax.swing.JOptionPane;

public class Boletín9_5 {

public static void main(String[] args) {
        
// Declaración de los datos
    double Sueldo;
    
    double NúmeroPulsado = 0;
    
    double Contador1000a1750 = 0;
    double ContadorMenos1000 = 0;
    
    double PorcentajeMenos1000;
    
// Creación del bucle
    do{
            Sueldo = Double.parseDouble(JOptionPane.showInputDialog("Escribe el sueldo de tu trabajador" + "\n0: Resultados"));
            if (Sueldo < 1000){
                ++ContadorMenos1000;
            }
            else {
                if (Sueldo >= 1000 && Sueldo <= 1750){
                        ++Contador1000a1750;
                }
                else {
                    JOptionPane.showInputDialog("El valor introducido no es válido");
                }
            }
            
            if (Sueldo == 0){
                PorcentajeMenos1000 = (Contador1000a1750 * ContadorMenos1000)/100;
                JOptionPane.showInputDialog("Los resultados son: " + "\nEl número de trabajadores que cobran menos de 1000 es de: " + ContadorMenos1000 + "\nEl número de trabajadores que cobran entre 1000 y 1750 es de: " + Contador1000a1750 + "\nY el porcentaje de trabajadores que cobran menos de 1000 es del: " + PorcentajeMenos1000 + "%");
            }
            
    }while (Sueldo > 0);
    }
}
       