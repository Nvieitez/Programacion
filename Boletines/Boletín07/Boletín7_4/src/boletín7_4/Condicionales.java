package boletín7_4;

public class Condicionales {
    
// Declaración de los datos
    private String Nombre1;
    private String Nombre2;
    
    private double Peso1;
    private double Peso2;
    
    private double DPeso;
    
// Constructor por defecto
    public Condicionales(){
        
    }
    
// Constructor parametrizado
    public Condicionales(String N1, String N2, double P1, double P2, double DP){
        Nombre1 = N1;
        Nombre2 = N2;
        
        Peso1 = P1;
        Peso2 = P2;
        
        DPeso = DP;
    }
    
// Métodos de acceso
   public String GetNombre1 (String N1){
       Nombre1 = N1;
       return Nombre1;
   }
   
   public String GetNombre2 (String N2){
       Nombre2 = N2;
       return Nombre2;
   }
   
   public double GetPeso1 (double P1){
       Peso1 = P1;
       return Peso1;
   }
   
   public double GetPeso2 (double P2){
       Peso2 = P2;
       return Peso2;
   }
       
// Condicionales
    public void ValoraciónPeso (){
        if (Peso1 > Peso2){
            System.out.println(Nombre1 +" Pesa más");
        }
        else{
            System.out.println(Nombre2+ " Pesa más");
        }
        
        // Cálculo de la diferencia de peso
        DPeso = Peso1 - Peso2;
        System.out.println("La diferencia de peso entre "+ Nombre1+ " y "+ Nombre2+ " es de "+ DPeso);
    }
}
