package boletín17;

public class Persona_B17 {

// Declaración de los datos
    private String Nombre;
    private String Apellidos;
    private String NIF;
    
// Constructor por defecto
    public Persona_B17(){
        
    }
    
// Constructor parametrizado
    public Persona_B17(String N, String A, String NI){
        Nombre = N;
        Apellidos = A;
        NIF = NI;
    }
    
// Métodos de acceso
    public String GetNombre (String N){
        Nombre = N;
        return Nombre;
    }
    
    public String GetApellidos (String A){
        Apellidos = A;
        return Apellidos;
    }
    
    public String GetNIF (String NI){
        NIF = NI;
        return NIF;
    }
    
// Creación de cliente
    
    
}
