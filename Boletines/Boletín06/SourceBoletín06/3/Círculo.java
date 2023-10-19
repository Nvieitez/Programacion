package boletín6_3;

public class Círculo {
    
// Declaración de los atributos
    private double Radio;
    private double Area;
    private double Longitud;
    
    
// Constructor por defecto
    public Círculo(){
        
    }

// Constructor parametrizado
    public Círculo (double R, double Pi){
        Radio = R;
        Pi = 3.14;
    }
    
// Métodos 
    public double SetRadio(double R){
        Radio = R;
        return Radio;
    }
    
// Cálculo del area
    public double Area (double A){
        Area = Math.PI*Math.pow(Radio, 2d) ;
        return Area;
    }
    
// Calculo de la longitud
    public double Longitud (Double L){
        Longitud = (2*Math.PI)* Radio;
        return Longitud;
    }
    
}
