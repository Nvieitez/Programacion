package boletín3_1;

import java.util.Scanner;

public class Boletín3_1 {

public static void main(String[] args) {
       
// Declaración de los datos
    float tarifa,pago,descuento;
    
// Código para pedir datos
    Scanner sc = new Scanner (System.in); 
    System.out.println("Escribe la tarifa");
    tarifa = sc.nextFloat();
    System.out.println("Escribe lo que se ha pagado por el producto");
    pago = sc.nextFloat();
    
// Proceso de cálculo de descuento
    descuento = (pago/tarifa)*100;
    
// Resultado 
    System.out.println("El decuento es de = "+descuento);
            
    
    }
    
}
