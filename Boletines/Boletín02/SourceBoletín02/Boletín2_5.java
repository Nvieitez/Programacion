package boletín2_5;

import java.util.Scanner;

public class Boletín2_5 {

public static void main(String[] args) {
    
// Declaración de los datos
    double millas,metros;
    
// Código para pedir los datos
    Scanner sc = new Scanner (System.in);
    System.out.println("Escribe la cantidad de millas que quieras convertir a metros");
    millas = sc.nextDouble();
    
// Proceso de cálculo de metros
    metros = millas*1852;
    
// Resultado
    System.out.println("El numero de metros es = "+metros);
    }
    
}
