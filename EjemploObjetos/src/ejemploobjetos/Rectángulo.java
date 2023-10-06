package ejemploobjetos;

public class Rectángulo {
    
    // Declaración de los datos
    private float base;
    private float altura;
        // también se puede poner así "private float base,altura;"
   
    // Constructores
        // Constructor por defecto
    public Rectángulo(){
        
    }
    //metodos de acceso
    public void DarValorBase (float b){
        base = b; 
    }
    
    public float DevolverValorBase (){
        return base;
    }
    
    public void DarValorAltura (float a){
        altura = a;
    }
    
    public float DevolverValorAltura (){
        return altura;
    }
    
    public void CalcularArea(float b, float a){
        float area = b * a;
        System.out.println("area = "+ area);
    }
    
    public float CalcularPerimetro (float b, float a){
       float perimetro = 2 * b + 2 * a;
       return perimetro;
    }
        //Constructor parametrizado
    public Rectángulo (float b, float a){
        base = b;
        altura = a;
        
        //Sobrecarga de métodos
    }
}

