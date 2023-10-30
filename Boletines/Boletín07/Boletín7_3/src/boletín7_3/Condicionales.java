package boletín7_3;

public class Condicionales {
    
// Declaración de los datos
    private double Num1;
    
// Constructor por defecto
    public Condicionales(){
        
    }
    
// Constructor parametrizado
    public Condicionales (double N1){
        Num1 = N1;
    }
    
// Métodos de acceso 
    public double GetNum1 (double N1){
        Num1 = N1;
        return Num1;
    }
    
// Condicional
    public void ComprobaciónValor (){
        if (Num1 > 0){
            System.out.println("Su número es positivo");
        }
        else {
            if (Num1 == 0){
                System.out.println("Su número es 0");
            }
            else{
                System.out.println("Su número es negativo");
            }    
        }
    }
}
