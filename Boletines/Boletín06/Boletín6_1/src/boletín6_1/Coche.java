package boletín6_1;

public class Coche {

// Declaración de los atributos 
    private int Velocidad;
    private double Acelerar;
    private double Frenar;
    
// Constructor por defecto
    public Coche(){
         
    }
    
// Constructor parametrizado
    public Coche (int V, double A, double F, double Va, double Vf){
        Velocidad = V;
        Velocidad = 0;
        Acelerar = A;
        Frenar = F;
    }

// Métodos de acceso 
    public int GetVelocidad(int V){
        Velocidad = V;
        return Velocidad;
    }
    
    public double GetAcelerar(double A){
        Acelerar = A;
        return Acelerar;
    }
    
    public double GetFrenar(double F){
        Frenar = F;
        return Frenar;
    }
    

}


