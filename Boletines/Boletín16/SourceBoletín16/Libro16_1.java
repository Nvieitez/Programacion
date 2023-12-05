package boletín16_1;

public class Libro16_1 {
    
// Declaración de los datos
    private String CódigoL;
    private String TítuloL;
    private double AñoPublicaciónL;
    
    private String Estado = "NoPrestado";
    
// Constructor por defecto
    public Libro16_1(){
        
    }
    
// Constructor parametrizado
    public Libro16_1 (String Cl, String Tl, double APl, String E){
        CódigoL = Cl;
        TítuloL = Tl;
        AñoPublicaciónL = APl;
        
        Estado = E;
    }
    
// Métodos de acceso
    public String GetCódigoL (String Cl){
        CódigoL = Cl;
        return CódigoL;
    }
    
    public String GetTítuloL (String Tl){
        TítuloL = Tl;
        return TítuloL;
    }
    
    public double GetAñoPublicaciónL (double APl){
        AñoPublicaciónL = APl;
        return AñoPublicaciónL;
    }
    
    public String GetEstado (String E){
        Estado = E;
        return Estado;
    }
}
