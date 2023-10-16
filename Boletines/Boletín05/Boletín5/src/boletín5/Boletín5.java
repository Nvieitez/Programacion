package boletín5;

import java.util.Scanner;

public class Boletín5 {
    
public static void main(String[] args) {
    
// Creación del objeto
    Consumo ObjCons = new Consumo();
    
// Declaración de los datos
    double TiempoM;
    double KilometrosM;
    double LitrosGasolinaM;
    double ValorGasolinaM;
    
    double VelocidadMediaM;
    double ConsumoMedioM;
    double PrecioConsumidoM;
    
// Código para pedir los datos
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe la duración del recorrido");
    TiempoM = sc.nextDouble();
    System.out.println("Escribe los kilometros recorridos");
    KilometrosM = sc.nextDouble();
    System.out.println("Escribe los litros de gasolina que se consumen");
    LitrosGasolinaM = sc.nextDouble();
    System.out.println("Escribe el precio de la gasolina");
    ValorGasolinaM = sc.nextDouble();
    
    
// Damos valores
    TiempoM = ObjCons.GetTiempo(TiempoM);
    KilometrosM = ObjCons.GetKilometros(KilometrosM);
    LitrosGasolinaM = ObjCons.GetLitros(LitrosGasolinaM);
    ValorGasolinaM = ObjCons.GetPrecioGasolina(ValorGasolinaM);
    
// Cálculo de los datos
    VelocidadMediaM = ObjCons.GetKilometros(KilometrosM)/ObjCons.GetTiempo(TiempoM);
    ConsumoMedioM = (ObjCons.GetLitros(LitrosGasolinaM)/ObjCons.GetKilometros(KilometrosM))*100;
    PrecioConsumidoM = ValorGasolinaM*ObjCons.GetKilometros(KilometrosM);
    
// Resultado
    System.out.println("Dados los datos anteriores: \nLa velocidad media es de "+ VelocidadMediaM+ " Km/h"+ "\nEl consumo medio de gasolina cada 100Km es de "+ ConsumoMedioM+ "L"+ "\nEl Precio de la gasolina consumida es de "+ PrecioConsumidoM+ "€");
    
    }
}
    
    
            
    

   
    
    
    
    
