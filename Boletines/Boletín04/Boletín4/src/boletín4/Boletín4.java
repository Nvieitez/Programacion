package boletín4;

public class Boletín4 {

public static void main(String[] args) {
 
// Creamos el objeto
    Libro ObjLib = new Libro();
    
// Declaramos variables
    var Don_Quijote = "Don Quijote";
    var Miguel_De_Cervantes = "Miguel De Cervantes";
    int AñoM = 1605;
    short Número_De_Páginas = 1560;
    float Valoración = 5;
    
// Damos valores 
    Don_Quijote = ObjLib.GetTítulo(Don_Quijote);
    Miguel_De_Cervantes = ObjLib.GetAutor(Miguel_De_Cervantes);
    AñoM = ObjLib.GetAño(AñoM);
    Número_De_Páginas = ObjLib.GetNúmeroPáginas(Número_De_Páginas);
    Valoración = ObjLib.GetValoración(Valoración);
    
// Resultado
    System.out.println("El libro tiene por título "+ ObjLib.GetTítulo(Don_Quijote)+ "\nY fue escrito por "+ ObjLib.GetAutor(Miguel_De_Cervantes)+ "\nSe publicó en el año "+ ObjLib.GetAño(AñoM)+ "\nCuenta con un número de páginas de "+ ObjLib.GetNúmeroPáginas(Número_De_Páginas)+ "\nY tiene una valoración de "+ ObjLib.GetValoración(Valoración)+ " estrellas");
     
    }
    
}
