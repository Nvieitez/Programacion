package boletín15;

public class Masajista extends SelecciónFútbol{
    
// Declaración de los datos
    private int AñosExperiencia;
    private String Titulación;
    
// Constructor por defecto
    public Masajista(){
        
    }
    
// Constructor parametrizado
    public Masajista (int AE, String T){
        AñosExperiencia = AE;
        Titulación = T;
    }
    
// Métodos de acceso (Get,Set)
    public int GetAñosExperiencia (int AE){
        AñosExperiencia = AE;
        return AñosExperiencia;
    }
    
    public String GetDorsal (String T){
        Titulación = T;
        return Titulación;
    }
    
// Métodos de acceso 
    public void DarMasajes (){
        
    }
    
// OverRide
    @Override
    public String toString(){
        return "Masajista{" + "Titulación=" + Titulación +", AñosExperiencia=" + AñosExperiencia + '}';
    }
    
}
