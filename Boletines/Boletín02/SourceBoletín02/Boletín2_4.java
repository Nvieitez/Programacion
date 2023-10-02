package boletín2_4;

import java.util.Scanner;

public class Boletín2_4 {

public static void main(String[] args) {
       
// Declaración de los datos
    double Num1,Num2;
    double suma,resta,producto,cociente;
            
// Código para pedir los datos
    Scanner sc = new Scanner (System.in);
    System.out.println("Escribe el primer número");
    Num1 = sc.nextDouble();
    System.out.println("Escribe el segundo número");
    Num2 = sc.nextDouble();
    
// Proceso de Cálculo
    suma = Num1 + Num2;
    resta = Num1 - Num2;
    producto = Num1 * Num2;
    cociente = Num1 / Num2;
    
// Resultado
    System.out.println("suma = "+suma);
    System.out.println("resta = "+resta);
    System.out.println("producto = "+producto);
    System.out.println("cociente = "+cociente);
    
// Resultado forma alternativa
    System.out.println("\nsuma = "+suma +"\nresta = "+resta +"\nproducto = "+producto +"\ncociente = "+cociente);
 
    }
    
}
