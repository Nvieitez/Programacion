package boletín3_3;

import java.util.Scanner;

public class Boletín3_3 {

public static void main(String[] args) {
       
// Declaración de los datos
    double Total,B100,B20,B5,E1;
            
// Código para pedir los datos
    Scanner sc = new Scanner (System.in);
    System.out.println("Escribe el número de billetes de 100 que quieres convertir");
    B100 = sc.nextDouble();
    System.out.println("Escribe el número de billetes de 20 que quieres convertir");
    B20 = sc.nextDouble();
    System.out.println("Escribe el número de billetes de 5 que quieres convertir");
    B5 = sc.nextDouble();
    System.out.println("Escribe el número de monedas de 1 que quieres convertir");
    E1 = sc.nextDouble();
    
// Proceso del cálculo de cambio
    Total = (B100*100)+(B20*20)+(B5*5)+(E1);
    
// Resultado
    System.out.println("El dinero total es = "+Total);
   
    }
    
}
