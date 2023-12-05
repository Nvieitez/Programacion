package boletín14_1;

import javax.swing.JOptionPane;

public class Boletín14_1 {

public static void main(String[] args) {
        
// Declaración de los datos
    String MarcaM;
    double VelocidadCPUM;
    
    String MonitorM = "Null";
    String TecladoM = "Null";
    String ProcesadorM = "Null";
    double PrecioM = 0;
    
// Creación del objeto
    Ordenador14_1 Ordenador = new Ordenador14_1();
    
// Dar valores
    MonitorM = Ordenador.GetMonitor(MonitorM);
    TecladoM = Ordenador.GetTeclado(TecladoM);
    ProcesadorM = Ordenador.GetProcesador(ProcesadorM);
    PrecioM = Ordenador.GetPrecio(PrecioM);
    
// Código para pedir datos
    MarcaM = JOptionPane.showInputDialog("Escribe la marca de tu ordenador");
    VelocidadCPUM = Double.parseDouble(JOptionPane.showInputDialog("Escribe la velocidad de tu CPU"));
    
    MonitorM = JOptionPane.showInputDialog("Escribe el monitor de tu ordenador");
    TecladoM = JOptionPane.showInputDialog("Escribe el teclado de tu ordenador");
    ProcesadorM = JOptionPane.showInputDialog("Escribe el procesador de tu ordenador");
    PrecioM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el precio de tu ordenador"));
    
// Resultado
    JOptionPane.showInputDialog("Las características de tu ordenador son:" + "\nMarca: " + MarcaM + "\nTeclado: " + Ordenador.GetTeclado(TecladoM) + "\nMonitor: " + Ordenador.GetMonitor(MonitorM) + "\nProcesador: " + Ordenador.GetProcesador(ProcesadorM) + "\nVelocidad CPU: " + VelocidadCPUM + "\n" + "\nPrecio Total: " + Ordenador.GetPrecio(PrecioM));
    }
    
}
