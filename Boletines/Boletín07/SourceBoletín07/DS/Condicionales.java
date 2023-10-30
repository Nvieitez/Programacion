package ejerciciodiasemana;

public class Condicionales {
    
// Declaración de los datos
    private double Num;

    
// Constructor por defecto 
    public Condicionales(){
        
    }
    
// Constructor parametrizado
    public Condicionales(double N){
        Num = N;

    }
    
// Métodos de acceso
    public double GetNum (double N){
        Num = N;
        return Num;
    }
    
// Condicionales
    public void ValoraciónSemana (){
        if (Num == 1){
            System.out.println("El día de la semana es Lunes");
        }
        else{
            if (Num == 2){
                System.out.println("El día de la semana es Martes");
            }
            else{
                if (Num == 3){
                    System.out.println("El día de la semana es Miércoles");
                }
                else{
                    if (Num == 4){
                        System.out.println("El día de la semana es Jueves");
                    }
                    else{
                        if (Num == 5){
                            System.out.println("El día de la semana es Viernes");
                        }
                        else{
                            if (Num == 6){
                                System.out.println("El día de la semana es Sabado");
                            }
                            else{
                                if (Num == 7){
                                    System.out.println("El día de la semana es Domingo");
                                }
                                else {
                                    System.out.println("Tu numero no corresponde a ningún día de la semana");
                                }
                            }
                        }
                    }
                }
            }
        }
    }                   
}
                        
                    