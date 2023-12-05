package boletín16_1;

import javax.swing.JOptionPane;

public class Boletín16_1 {

public static void main(String[] args) {
        
// Declaración de los datos
    double BotónPresionado;
    double LibrosDisponibles = 5;
    double RevistasDisponibles = 5;
    double ComprobaciónDevoluciónL = 0;
    double ComprobaciónDevoluciónR = 0;
    
    String CódigoLM = "Null";
    String TítuloLM = "Null";
    double AñoPublicaciónLM = 0;
    String EstadoM = "Nada que devolver";
    
    String CódigoRM = "Null";
    String TítuloRM = "Null";
    double AñoPublicaciónRM = 0;
    double NúmeroRevistaM = 0;
    
// Creación de los objetos
    Libro16_1 Libro = new Libro16_1();
    Revista16_1 Revista = new Revista16_1();
    
// Dar valores
    CódigoLM = Libro.GetCódigoL(CódigoLM);
    TítuloLM = Libro.GetTítuloL(TítuloRM);
    AñoPublicaciónLM = Libro.GetAñoPublicaciónL(AñoPublicaciónRM);
    EstadoM = Libro.GetEstado(EstadoM);
    
    CódigoRM = Revista.GetCódigoR(CódigoRM);
    TítuloRM = Revista.GetTítuloR(TítuloRM);
    AñoPublicaciónRM = Revista.GetAñoTítuloR(NúmeroRevistaM);
    NúmeroRevistaM = Revista.GetNúmeroRevista(NúmeroRevistaM);
    
// Creación del Menú
    do{
        BotónPresionado = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número de la opción que desees: " + "\n1:Ingresar libro" + "\n2:Retirar Libro" + "\n" + "\nLibros Disponibles: " + LibrosDisponibles + "\nEstado: " + EstadoM + "\n" + "\n3:Ingresar Revista" + "\n4:Retirar Revista" + "\n" + "\nRevistas Disponibles: " + RevistasDisponibles + "\n" + "\n0:Salir"));
        
        // Insertar libro
        if (BotónPresionado == 1){
            if(ComprobaciónDevoluciónL == 0){
                JOptionPane.showInputDialog("No cuentas con ningún libro para devolver");
            }
            else{
                CódigoLM = JOptionPane.showInputDialog("Escribe el código del libro que quieres ingresar");
                TítuloLM = JOptionPane.showInputDialog("Escribe el título del libro que quieres ingresar");
                AñoPublicaciónLM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el año de publicación del libro que quieres ingresar"));
                ComprobaciónDevoluciónL--;
                LibrosDisponibles++;  
            }
            if(LibrosDisponibles == 5){
                EstadoM = "Nada que devolver";
                }
        }
        else{
            // Retirar Libro
            if(BotónPresionado == 2){
                if(LibrosDisponibles == 0){
                    JOptionPane.showInputDialog("No hay libros que poder retirar");
                }
                else{
                    CódigoLM = JOptionPane.showInputDialog("Escribe el código del libro que quieres retirar");
                    TítuloLM = JOptionPane.showInputDialog("Escribe el título del libro que quieres retirar");
                    AñoPublicaciónLM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el año de publicación del libro que quieres retirar"));
                    ComprobaciónDevoluciónL++;
                    LibrosDisponibles--;
                    EstadoM = "Cuentas con libros para devolver";         
                }
            }
            else{
                // Insertar Revista
                if(BotónPresionado == 3){
                    if(ComprobaciónDevoluciónR == 0){
                JOptionPane.showInputDialog("No cuentas con ninguna revista para devolver");
                    }
                    else{
                        CódigoLM = JOptionPane.showInputDialog("Escribe el código de la revista que quieres ingresar");
                        TítuloLM = JOptionPane.showInputDialog("Escribe el título de la revista que quieres ingresar");
                        AñoPublicaciónLM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el año de publicación de la revista que quieres ingresar"));
                        ComprobaciónDevoluciónR--;
                        RevistasDisponibles++;  
                        if(RevistasDisponibles == 5){
                        JOptionPane.showInputDialog("No cuentas con ninguna revista para devolver");
                        }       
                    }
                }
                else{
                    // Retirar Revista
                    if(BotónPresionado == 4){
                        if(RevistasDisponibles == 0){
                            JOptionPane.showInputDialog("No hay revistas que poder retirar");
                        }
                        else{
                            CódigoLM = JOptionPane.showInputDialog("Escribe el código de la revista que quieres retirar");
                            TítuloLM = JOptionPane.showInputDialog("Escribe el título de la revista que quieres retirar");
                            AñoPublicaciónLM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el año de publicación de la revista que quieres retirar"));
                            ComprobaciónDevoluciónR++;
                            RevistasDisponibles--;      
                        }
                    }
                }
            }   
        }
             
    }while(BotónPresionado > 0);
    }
    
}
