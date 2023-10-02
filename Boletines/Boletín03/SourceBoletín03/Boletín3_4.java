package boletín3_4;

import java.util.Scanner;

public class Boletín3_4 {

public static void main(String[] args) {
       
// Declaración de los datos
    double Dinero,B100,B20,B5,E1;
            
// Código para pedir los datos
    Scanner sc = new Scanner (System.in);
    System.out.println("Escribe la cantidad de dinero que quieras desglosar");
    Dinero = sc.nextDouble();
    
// Proceso del cálculo de cambio
    B100 = Dinero/100;
    B20 = Dinero/20;
    B5 = Dinero/5;
    E1 = Dinero;
     
// Resultado
    System.out.println("El desglose en billetes de 100 sería = "+B100 +"\nEn billetes de 20 = "+B20 +"\nEn billetes de 5 = "+B5 +"\nY en monedas de euro = "+E1);
   
    }
    
}
