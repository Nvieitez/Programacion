package boletín12_1;

import javax.swing.JOptionPane;

public class Garaje12_1 {
    
// Declaración de los datos
    private String Matrícula;
    private String Marca;
    
    private double TiempoAparcado;
    private double PrecioPagar;
    private double DineroIntroducido;
    
    private double BotónPresionado;
    
    private double ContadorPlazas = 5;
    
// Constructor por defecto
    public Garaje12_1 (){
        
    }
    
// Constructor parametrizado
    public Garaje12_1 (String M, String Ma){
        Matrícula = M;
        Marca = Ma;
    }
    
// Métodos de acceso
    public String GetMatrícula (String M){
        Matrícula = M;
        return Matrícula;
    }
    
    public String GetMarca (String Ma){
        Marca = Ma;
        return Marca;
    }
        
// Bucles
    public void BuclePedirCoches (){
        
        // Creación del menú
        do{
            BotónPresionado = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número de la acción que desees" + "\n1: Introducir coche" + "\n2: Retirar coche" + "\n0: Salir" + "\n" + "\nNúmero de plazas disponibles: " + ContadorPlazas));
            
            // Introducción de coche
            if(BotónPresionado == 1){
                Marca = JOptionPane.showInputDialog("Escribe la marca de tu vehículo");
                Matrícula = JOptionPane.showInputDialog("Escribe la matrícula de tu vehículo");
                TiempoAparcado = Double.parseDouble(JOptionPane.showInputDialog("Escribe el tiempo que el vehículo ha estado estacionado en horas"));
                
                // Cálculo de la factura
                if(TiempoAparcado <= 3){
                    PrecioPagar = 1.5;
                }
                else{
                    PrecioPagar = 1.5 +(0.25 * TiempoAparcado);
                }
                
                // Creación de la factura
                JOptionPane.showInputDialog("Factura simplificada:" + "\nMarca: " + Marca + "\nMatrícula: " + Matrícula + "\nTiempo Aparcado: " + TiempoAparcado + " horas" + "\nPrecio a Pagar: " + PrecioPagar + " €");
                
                // Pago y devolución de cambio
                do{
                    DineroIntroducido = Double.parseDouble(JOptionPane.showInputDialog("Escribe el dinero que desees introducir: " + "\nPrecio a pagar: " + PrecioPagar + " €"));

                    if (DineroIntroducido == PrecioPagar){
                        JOptionPane.showInputDialog("Coche Introducido Correctamente");
                        ContadorPlazas--;
                    }
                    else{
                        if (DineroIntroducido > PrecioPagar){
                            JOptionPane.showInputDialog("El cambio a devolver es de: " + (DineroIntroducido - PrecioPagar) + " €");
                            JOptionPane.showInputDialog("Coche Introducido Correctamente");
                            ContadorPlazas--;
                            
                        }
                        else{
                            if (DineroIntroducido < PrecioPagar){
                                JOptionPane.showInputDialog("El dinero introducido no cubre la factura");
                            }
                        }
                    }   
                }while (DineroIntroducido < PrecioPagar);
                
            }
            else{
                if(BotónPresionado == 2){
                    if (ContadorPlazas > 0 && ContadorPlazas < 5){
                        ContadorPlazas++;
                    }
                    else{
                        if(ContadorPlazas == 5){
                            JOptionPane.showInputDialog("El Parking está vacío");
                        }  
                    }
                }
            }
                
        }while(BotónPresionado > 0);   
    }
}
