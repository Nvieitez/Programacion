package boletín8_1;

public class Condicionales {
    
// Declaración de los datos
    private double Ventas_Anuales;
    
// Constructor por defecto
    public Condicionales(){
        
    }
 
// Constructor parametrizado
    public Condicionales(double Vt){
        Ventas_Anuales = Vt;
    }
    
// Métodos de acceso
    public double GetVentas (double Vt){
        Ventas_Anuales = Vt;
        return Ventas_Anuales;
    }
    
// Condicionales
    public void ValoraciónProductos(){
        if (Ventas_Anuales < 100){
            System.out.println("Tu producto se clasifica como de bajo consumo");
        }
        else {
            if (Ventas_Anuales > 100 && Ventas_Anuales <= 500){
                System.out.println("Tu producto se clasifica como de medio consumo");
            }
            else{
                if (Ventas_Anuales > 500 && Ventas_Anuales <= 1000){
                    System.out.println("Tu producto se clasifica como de alto consumo");
                }
                else{
                    if (Ventas_Anuales > 1000){
                        System.out.println("Tur producto se clasifica como de primera necesidad");
                    }
                }
            }
        }
    }
        
        
    
}
