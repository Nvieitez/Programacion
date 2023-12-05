package boletín11_1;

import javax.swing.JOptionPane;

import java.util.Random;

public class Boletín11_1 {

public static void main(String[] args) {

// Declaración de los datos
    double NúmeroAdivinanza = 1;
    double NúmeroAdivinado;
    
    double NúmeroDeIntentos = 5;
    double FinJuego = 1;
    double BotónPresionado;
    
    double NúmeroAleatorio;
    double Diferencia;

// Creación del menú y bucle
    do{
        // Menú
        BotónPresionado = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número de la acción que desees" + "\n1: Jugar contra una persona" + "\n2: Jugar contra un ordenador" + "\n0: Salir"));
        
        // Creación del juego (2 personas)
        if (BotónPresionado == 1){
            do{
                do {
                     NúmeroAdivinanza = Double.parseDouble(JOptionPane.showInputDialog("(Jugador 1): Escribe el número a adivinar (0-50)"));
                     if(NúmeroAdivinanza > 50){
                         JOptionPane.showInputDialog("El valor introducido no es válido");
                     }
                     else{
                         if(NúmeroAdivinanza < 0){
                            JOptionPane.showInputDialog("El valor introducido no es válido"); 
                         }
                     }
                }while(NúmeroAdivinanza < 0);
            }while(NúmeroAdivinanza > 50);
            
            
            NúmeroDeIntentos = 5; 
            FinJuego = 1;
            
            do{
                NúmeroAdivinado = Double.parseDouble(JOptionPane.showInputDialog("(Jugador 2): Escribe el número a adivinar"));
                if(NúmeroAdivinado < NúmeroAdivinanza){
                    JOptionPane.showInputDialog("El número insertado es menor que la respuesta, te quedan " + NúmeroDeIntentos + " intentos restantes");
                    NúmeroDeIntentos--;
                }
                else{
                    if (NúmeroAdivinado > NúmeroAdivinanza){
                        JOptionPane.showInputDialog("El número introducido es mayor que la respuesta, te quedan " + NúmeroDeIntentos + " intentos restantes");
                        NúmeroDeIntentos--;
                    }
                    else {
                        if (NúmeroAdivinado == NúmeroAdivinanza){
                         JOptionPane.showInputDialog("El número insertado es correcto, Ganaste");
                         FinJuego--;
                        }    
                    }
                }
                
                if(NúmeroDeIntentos < 0){
                    JOptionPane.showInputDialog("No quedan más intentos, Perdiste");
                }
            }while (NúmeroDeIntentos > -1 && FinJuego > 0);
        }   
        
        // Creación del juego (Contra el ordenador)
        if (BotónPresionado == 2){
                
            // Creación del número aleatorio
            Random Random = new Random();
            
            NúmeroAleatorio = Random.nextInt(50) + 1;
            
            System.out.print(NúmeroAleatorio);
            
            // Interacción Humana
            NúmeroDeIntentos = 5; 
            FinJuego = 1;
            
            do{
                NúmeroAdivinado = Double.parseDouble(JOptionPane.showInputDialog("(Jugador): Escribe el número a adivinar"));
                Diferencia = NúmeroAleatorio - NúmeroAdivinado;
                    if (NúmeroAdivinado == NúmeroAleatorio){
                        JOptionPane.showInputDialog("El número insertado es correcto, Ganaste");
                        FinJuego--;
                    }
                    else{
                        if(Diferencia > 20){
                            JOptionPane.showInputDialog("El número insertado está muy lejos de la respuesta, te quedan " + NúmeroDeIntentos + " intentos restantes");
                            NúmeroDeIntentos--;
                        }
                        else{
                            if (Diferencia > 10 && Diferencia < 20){
                                JOptionPane.showInputDialog("El número introducido está lejos de la respuesta, te quedan " + NúmeroDeIntentos + " intentos restantes");
                                NúmeroDeIntentos--;
                            }
                            else{
                                if (Diferencia > 5 && Diferencia < 10){
                                    JOptionPane.showInputDialog("El número introducido está cerca de la respuesta, te quedan " + NúmeroDeIntentos + " intentos restantes");
                                    NúmeroDeIntentos--;
                                }
                                else{
                                    if (Diferencia < 5){
                                        JOptionPane.showInputDialog("El número introducido está muy cerca de la respuesta, te quedan " + NúmeroDeIntentos + " intentos restantes");
                                        NúmeroDeIntentos--;
                                    }   
                                }
                            }
                        }
                    }
                if(NúmeroDeIntentos < 0){
                    JOptionPane.showInputDialog("No quedan más intentos, Perdiste");
                }
                
            }while (NúmeroDeIntentos > -1 && FinJuego > 0);
        }             
    }while (BotónPresionado > 0);
  }
}