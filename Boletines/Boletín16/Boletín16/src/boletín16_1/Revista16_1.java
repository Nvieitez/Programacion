package boletín16_1;

public class Revista16_1 {
    
// Declaración de los datos
    private String CódigoR;
    private String TítuloR;
    private double AñoPublicaciónR;
    
    private double NúmeroRevista;
    
// Constructor por defecto
    public Revista16_1(){
        
    }
    
// Constructor parametrizado
    public Revista16_1 (String Cr, String Tr, double APr, double NR){
        CódigoR = Cr;
        TítuloR = Tr;
        AñoPublicaciónR = APr;
        
        NúmeroRevista = NR;
    }
    
// Métodos de acceso
    public String GetCódigoR (String Cr){
        CódigoR = Cr;
        return CódigoR;
    }
    
    public String GetTítuloR (String Tr){
        TítuloR = Tr;
        return TítuloR;
    }
    
    public double GetAñoTítuloR (double APr){
        AñoPublicaciónR = APr;
        return AñoPublicaciónR;
    }
    
    public double GetNúmeroRevista (double NR){
        NúmeroRevista = NR;
        return NúmeroRevista;
    }
}
