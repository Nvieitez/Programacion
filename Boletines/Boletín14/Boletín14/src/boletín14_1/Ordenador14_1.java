package boletín14_1;

public class Ordenador14_1 {
    
// Declaración de los datos
    private String Monitor;
    private String Teclado;
    private String Procesador;
    private double Precio;
    
// Constructor por defecto
    public Ordenador14_1(){
        
    }
    
// Constructor parametrizado
    public Ordenador14_1(String M, String T, String P, double Pr){
        Monitor = M;
        Teclado = T;
        Procesador = P;
        Precio = Pr;
    }
    
// Métodos de acceso
    public String GetMonitor (String M){
        Monitor = M;
        return Monitor;
    }
    
    public String GetTeclado (String T){
        Teclado = T;
        return Teclado;
    }
    
    public String GetProcesador (String M){
        Procesador = M;
        return Procesador;
    }
    
    public double GetPrecio (double Pr){
        Precio = Pr;
        return Precio;
    }    
}
