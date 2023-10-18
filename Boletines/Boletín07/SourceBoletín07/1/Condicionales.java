package boletín7_1;

public class Condicionales {
    
// Declaración de los atributos
    private int Num1;
    
// Constructor por defecto
    public Condicionales(){
        
    }
    
// Constructor parametrizado
    public Condicionales(int N){
        Num1 = N;
    }
    
// Método
    
   // Valor Número
    public int GetNum(int N){
        Num1 = N;
        return Num1;
    }
    
    // Condicional
    public int Positivo(){
        if (Num1 > 0){
            System.out.println("Tu número es positivo");
        }
        return Num1;
    }
}
