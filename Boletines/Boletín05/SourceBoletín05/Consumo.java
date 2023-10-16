package boletín5;

public class Consumo {

// Declaración de atributos
    private double Tiempo; 
    private double Kilometros;
    private double Litros;
    private double PrecioGasolina;
    
// Constructor por defecto
    public Consumo(){
        
    }
    
// Cosntructor parametrizado
    public Consumo (double T, double Km, double L, double Pg){
        Tiempo = T;
        Kilometros = Km;
        Litros = L;
        PrecioGasolina = Pg;
  
    }
    
// Métodos
    
    // Tiempo
    public double GetTiempo(double T){
        Tiempo = T;
        return Tiempo;
    }
    
    // Kilometros
    public double GetKilometros (double Km){
        Kilometros = Km;
        return Kilometros;
    }
    
    // Litros
    public double GetLitros (double L){
        Litros = L;
        return Litros;
    }
    
    // Precio gasolina
    public double GetPrecioGasolina (double Pg){
        PrecioGasolina = Pg;
        return PrecioGasolina;
    }
    
}