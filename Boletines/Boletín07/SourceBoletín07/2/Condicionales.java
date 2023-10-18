package boletín7_2;

public class Condicionales {

// Declaración de los datos
    private short Num1;
    private short Num2;
    
// Constructor por defecto
    public Condicionales(){
    
    }

// Constructor parametrizado
    public Condicionales(short N1, short N2){
        Num1 = N1;
        Num2 = N2;
    }
    
// Métodos de acceso
    public short GetNum1 (short N1){
        Num1 = N1;
        return Num1;
    }
    
    public short GetNum2 (short N2){
        Num2 = N2;
        return Num2;
    }
    
// Condicional
    public void Cálculo (){
        if (Num1 >= Num2){
            System.out.println("La suma es igual a "+ (Num1 + Num2));
            System.out.println("La resta es igual a "+ (Num1 - Num2));
        }
        else{
            System.out.println("La suma es igual a "+ (Num1 + Num2));
        }
    }
}
