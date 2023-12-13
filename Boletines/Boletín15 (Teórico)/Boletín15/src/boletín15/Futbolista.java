package boletín15;

public class Futbolista extends SelecciónFútbol{
    
// Declaración de los datos
    private String Demarcación;
    private int Dorsal;
    
// Constructor por defecto
    public Futbolista(){
        
    }
    
// Constructor parametrizado
    public Futbolista (String D, int Do){
        Demarcación = D;
        Dorsal = Do;
    }
    
// Métodos de acceso (Get,Set)
    public String GetDemarcación (String D){
        Demarcación = D;
        return Demarcación;
    }
    
    public int GetDorsal (int Do){
        Dorsal = Do;
        return Dorsal;
    }
    
// Métodos de acceso 
    public void JugarPartido(){
        
    }
    
    public void Entrenar(){
        
    }
    
// OverRide
    @Override
    public String toString(){
        return "Futbolista{" + "Dorsal=" + Dorsal +", Demarcación=" + Demarcación + '}'; 
    }
}
