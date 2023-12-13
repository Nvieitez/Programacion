package boletín15;

public class Entrenador extends SelecciónFútbol{
    
// Declaración de los datos
    private String IdFederación;
    
// Constructor por defecto
    public Entrenador(){
        
    }
    
// Constructor parametrizado
    public Entrenador (String  I){
        IdFederación = I;
    }
    
// Métodos de acceso (Get,Set)
    public String GetIdFederación (String I){
        IdFederación = I;
        return IdFederación;
    }
    
// Métodos de acceso 
    public void DirigirPartido(){
        
    }
   
    public void DirigirEntrenamiento(){
        
    }
    
// OverRide
    @Override
    public String toString(){
        return "Entrenador{" + "IdFederación=" + IdFederación + '}';
    }
}
