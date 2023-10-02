package boletín3_2;

import java.util.Scanner;

public class Boletín3_2 {

public static void main(String[] args) {
        
// Declaración de los datos
    double centigrados,kelvin,fahrenheit;
    
// Código para pedir los datos
    Scanner sc = new Scanner (System.in);
    System.out.println("Escribe los grados centigrados que se desean convertir");
    centigrados = sc.nextDouble();
    
// Proceso del cálculo de conversión
    kelvin = centigrados + 273.15;
    fahrenheit = (centigrados * 9/5)+32;
    
// Resultado
    System.out.println("kelvin = "+kelvin +"\nfahrenheit = "+fahrenheit);
    }
    
}
