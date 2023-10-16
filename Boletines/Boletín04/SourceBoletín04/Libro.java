package boletín4;

public class Libro {
    
// Declaración de atributos
    private String Título;
    private String Autor;
    private int Año;
    private short NúmeroPáginas;
    private float Valoración;
    
// Constructor por defecto
    public Libro(){
        
    }

// Constructor parametrizado
    public Libro (String T, String Au, int A, short Np, float V){
        Título = T;
        Autor = Au;
        Año = A;
        NúmeroPáginas = Np;
        Valoración = V;
    }
    
// Métodos
    
    //Título
    public String GetTítulo (String T){
        Título = T;
        return Título;
    }
    
    //Autor
    public String GetAutor (String Au){
        Autor = Au;
        return Autor;        
    }
          
    // Año
    public int GetAño (int A){
        Año = A;
        return Año; 
    }
    
    // Número de páginas
    public Short GetNúmeroPáginas (short Np){
        NúmeroPáginas = Np;
        return NúmeroPáginas; 
    }
    
    // Valoración
    public float GetValoración (float V){
        Valoración = V;
        return Valoración;
    } 
}