package boletín6_2;

import javax.swing.JOptionPane;
        
public class Boletín6_2 {

public static void main(String[] args) {

// Creamos el objeto
    Satelite ObjSatelite = new Satelite();    

// Declaramos las variables
    double MeridianoM;
    double ParaleloM;
    double DistanciaTierraM;
    
// Código para pedir datos
    MeridianoM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor del meridiano"));
    ParaleloM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor del paralelo"));
    DistanciaTierraM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de la distancia a la tierra"));
       
// Damos valores
    MeridianoM = ObjSatelite.SetMeridiano(MeridianoM);
    ParaleloM = ObjSatelite.SetParalelo(ParaleloM);
    DistanciaTierraM = ObjSatelite.SetDistanciaTierra(DistanciaTierraM);
    
// Resultado
     System.out.println("El satelite se encuentra en el meridiano "+ MeridianoM +"\nEn el paralelo "+ParaleloM + "\nY a una distancia de la tierra de "+DistanciaTierraM);
            
  }
}
