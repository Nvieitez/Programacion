package boletín9_4;

import javax.swing.JOptionPane;

public class Boletín9_4 {

public static void main(String[] args) {

// Declaración de los datos
    double NúmeroTabla;
    double Resultado;
    double NúmeroMultiplicación = 0;
    double ContadorMultiplicación = 0;
    
// Código para pedir los datos
    NúmeroTabla = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número del que se desee hacer la tabla"));
    
// Cálculo de la tabla
    do{
        Resultado = NúmeroTabla * NúmeroMultiplicación;
        if (NúmeroMultiplicación < 11){
            NúmeroMultiplicación++;
        }
        ContadorMultiplicación++;
        System.out.println(Resultado);
    }while (ContadorMultiplicación < 11);
    }
    
}
