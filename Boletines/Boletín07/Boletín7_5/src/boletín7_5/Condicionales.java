package boletín7_5;

public class Condicionales {

// Declaración de los datos
    private double Num1;
    private double Num2;
    private double Num3;
    
// Constructor por defecto
    public Condicionales(){
        
    }

// Constructor parametrizado
    public Condicionales(double N1, double N2, double N3){
        Num1 = N1;
        Num2 = N2;
        Num3 = N3;
    }
    
// Métodos de acceso 
    public double GetNum1 (double N1){
        Num1 = N1;
        return Num1;
    }
    
    public double GetNum2 (double N2){
        Num2 = N2;
        return Num2;
    }
    
    public double GetNum3 (double N3){
        Num3 = N3;
        return Num3;
    }
    
// Condicionales
    public void ValoraciónDatos (){
        if (Num1 > Num2){
           if (Num1 > Num3){
               System.out.println("El número mayor es " + Num1); 
           }
        }
        else{
            if (Num2 > Num3){
                System.out.println("El número mayor es " + Num2);
            }
        }
        if (Num3 > Num1){
            if (Num3 > Num2){
                System.out.println("El número mayor es " + Num3);
            }
        }
    }
}
        

