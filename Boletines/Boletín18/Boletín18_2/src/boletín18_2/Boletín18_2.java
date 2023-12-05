package boletín18_2;

import javax.swing.JOptionPane;

public class Boletín18_2 {

public static void main(String[] args) {
        
// Declaración de los datos
    double BotónPresionado = 0;
    
    double PesoPaquete;
    double Precio = 0;
    
// Creación del menú
    do{
        PesoPaquete = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto pesa tú paquete?"));
        if(PesoPaquete > 5){
            JOptionPane.showInputDialog("Tu paquete pesa demasiado para ser transportado");
        }
        else{
            do{
                BotónPresionado = Double.parseDouble(JOptionPane.showInputDialog("¿A donde quieres enviar tu paquete?" + "\n1: América del norte" + "\n2: América Central" + "\n3: América del sur" + "\n4: Europa" + "\n5: Asia" + "\n0: Salir"));
                if (BotónPresionado == 1){
                    Precio = (PesoPaquete * 24);
                }
                else{
                    if(BotónPresionado == 2){
                        Precio = (PesoPaquete * 20);
                    }
                    else{
                        if(BotónPresionado == 3){
                            Precio = (PesoPaquete * 21);
                        }
                        else{
                            if(BotónPresionado == 4){
                                Precio = (PesoPaquete * 10);
                            }
                            else{
                                if(BotónPresionado == 5){
                                    Precio = (PesoPaquete * 18);
                                }
                            }
                        }
                    }
                    JOptionPane.showInputDialog("El precio a pagar es de: " + Precio + " €");
                }
            }while (BotónPresionado > 0);        
        }
    }while(PesoPaquete < 5);
    
    }
    
}
