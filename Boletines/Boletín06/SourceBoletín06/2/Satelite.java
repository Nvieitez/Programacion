package boletín6_2;

public class Satelite {
    
// Declaración de los atributos
    private double Meridiano;
    private double Paralelo;
    private double DistanciaTierra;
    
// Cosntructor por defecto
    public Satelite() {
   
    }
    
// Constructor parametrizado
    public Satelite (double M, double P, double Dt){
    Meridiano = M;
    Paralelo = P;
    DistanciaTierra = Dt;
    }
    
// Métodos
    
    public double SetMeridiano (double M){
        Meridiano = M;
        return Meridiano;
    }
    
    public double SetParalelo (double P){
        Paralelo = P;
        return Paralelo;
    }
    
    public double SetDistanciaTierra (double Dt){
        DistanciaTierra = Dt;
        return DistanciaTierra;
    }
       
}

