package boletín2_3;

import java.util.Scanner;

public class Boletín2_3 {
    
public static void main(String[] args) {
       
// Declaración de los datos
    float cambio,euros,dolares;
    
// Código para pedir los datos
    Scanner sc = new Scanner (System.in);
    System.out.println("Escribe la cantidad en euros que quieras cambiar");
    euros = sc.nextFloat();
    
    System.out.println("Escribe a cuanto está el cambio");
    cambio = sc.nextFloat();
    
// Proceso de cambio de moneda
    dolares = euros*cambio;

// Resultado
    System.out.println("La cantidad en dolares es = "+dolares);
            
    
           


    }
    
}
