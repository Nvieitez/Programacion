package boletín18_1;

import javax.swing.JOptionPane;

public class Boletín18_1 {

public static void main(String[] args) {
        
// Declaración de los datos
    double BotónPresionado = 0;
    double TiempoLlamada = 0;
    double TiempoLlamadaTotal = 0;
    
    double PrecioTotal = 0;
    double Precio = 0;
    
// Creación del menú
    do{
        BotónPresionado = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número de la opción que desees:" + "\n1: Iniciar llamada" + "\n" + "\nTiempo en llamada: " + TiempoLlamadaTotal + " horas" + "\n" + "\n2: Ver Factura" + "\n0: Salir"));
        
        // Creación de la llamada
        if(BotónPresionado == 1){
            JOptionPane.showInputDialog("En llamada...");
            TiempoLlamada = Double.parseDouble(JOptionPane.showInputDialog("Escribe la duración de la llamada"));
            TiempoLlamadaTotal = TiempoLlamada + TiempoLlamadaTotal;
        }
        else{
            //Creación de la factura
            if (BotónPresionado == 2){
                if(TiempoLlamadaTotal <= 5){
                    Precio = 1;
                }
                else{
                    if(TiempoLlamadaTotal <= 8){
                        Precio = 1.80;
                    }
                    else{
                        if(TiempoLlamadaTotal <= 10){
                            Precio = 2.50;
                        }
                        else{
                            if(TiempoLlamadaTotal > 10){
                                Precio = (TiempoLlamadaTotal + 2.50) * 0.50;
                            }
                        }
                    }
                }
                
                BotónPresionado = Double.parseDouble(JOptionPane.showInputDialog("¿Que día es hoy?" + "\n1: Día de semana" + "\n2: Domingo"));
                if(BotónPresionado == 2){
                    PrecioTotal = (Precio * 100)/3;
                }
                
                BotónPresionado = Double.parseDouble(JOptionPane.showInputDialog("¿Que hora es?" + "\n1: De mañana" + "\n2: De tarde"));
                if(BotónPresionado == 1){
                    PrecioTotal = (PrecioTotal * 100)/15;
                }
                else{
                    if(BotónPresionado == 2){
                        PrecioTotal = (PrecioTotal * 100)/15;
                    }
                }
                
                JOptionPane.showInputDialog("El precio a pagar es de: " + PrecioTotal);
            }
        }
    }while (BotónPresionado > 0);
    }
    
}
