package boletín15;

public class SelecciónFútbol {
    
// Declaración de los datos
    private int Id;
    private String Nombre;
    private String Apellido;
    private int Edad;
    
// Constructor por defecto
    public SelecciónFútbol(){
        
    }
    
// Constructor parametrizado
    public SelecciónFútbol (int I, String N, String A, int E){
        Id = I;
        Nombre = N;
        Apellido = A;
        Edad = E;
    }
    
// Métodos de acceso (Get,Set)
    public int GetId (int I){
        Id = I;
        return I;
    }
    
    public String GetNombre (String N){
        Nombre = N;
        return N;
    }
    
    public String GetApellido (String A){
        Apellido = A;
        return Apellido;
    }
    
    public int GetEdad (int E){
        Edad = E;
        return Edad;
    }
}
