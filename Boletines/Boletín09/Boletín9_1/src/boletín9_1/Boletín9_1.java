package boletín9_1;

import java.util.Scanner;

public class Boletín9_1 {

public static void main(String[] args) {

// Declaración de los datos        
    double ContadorNúmerosPositivos = 0;
    double ContadorNúmerosNegativos = 0;
    double ContadorCeros = 0;
    
// Creación del Scanner
    Scanner Scanner = new Scanner (System.in);
    
// Código para pedir los datos
    System.out.println("Escribe 10 números enteros");
    
    int contador = 0;
    while (contador < 10){
        int Número = Scanner.nextInt();
        contador++;
    
// Contadores
        if (Número > 0) {
            ContadorNúmerosPositivos++;
        }
        else {
            if (Número < 0){
                ContadorNúmerosNegativos++;
            }
            else {
                if (Número == 0){
                    ContadorCeros++;
                }
            }
        }
    }
    
// Resultado
    System.out.println("La cantidad de números positivos es " + ContadorNúmerosPositivos + "\nLa cantidad de números negativos es " + ContadorNúmerosNegativos + "\nLa cantidad de ceros es " + ContadorCeros);
    
    }
}
