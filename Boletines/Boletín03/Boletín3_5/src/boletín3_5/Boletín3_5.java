package boletín3_5;

import java.util.Scanner;

public class Boletín3_5 {

public static void main(String[] args) {
      
// Declaración de los datos
    float sueldo,sueldoB,sueldoL,ventas,díasT,KmR;
    
// Codígo para pedir los datos (Sueldo Bruto)
    Scanner sc = new Scanner (System.in);
    System.out.println("Escribe tu sueldo");
    sueldo = sc.nextFloat();
    System.out.println("Escribe el número de dias trabajados al mes");
    díasT= sc.nextFloat();
    System.out.println("Escribe los kilometros que recorres para ir al trabajo");
    KmR = sc.nextFloat();
    System.out.println("Escribe el número de ventas que realizas en un mes");
    ventas = sc.nextFloat();
            
// Proceso para cálculo del sueldo bruto
    sueldoB = sueldo - (díasT*30) - (KmR*2)- (ventas*(5/100));
            
// Proceso para calcular el sueldo líquido
    sueldoL = sueldoB - (sueldo*18/100) - 36;
            
// Resultado
    System.out.println("El sueldo bruto aproximado es = "+sueldoB +"\nEl sueldo líquido aproximado es = "+sueldoL);
    

    
    
    
    
    }
    
}
