package boletín17;

import javax.swing.JOptionPane;

public class Boletín17 {

public static void main(String[] args) {
    
// Declaración de los datos
    double NúmeroPresionado = 0;
    double NúmeroPresionadoCuenta = 0;
    
    double NúmeroCuentaM = 0;
    String TipoDeCuentaM = "Ninguna";
    double ValidaciónCC = 0;
    double ValidaciónCH = 0;
    
    double SaldoM = 0;
    double SaldoTotalM = 0;
    
// Creación de los objetos
    Cuenta_B17 Cuenta = new Cuenta_B17();
    
// Dar Valores
    NúmeroCuentaM = Cuenta.GetNúmeroCuenta(NúmeroCuentaM);
    SaldoM = Cuenta.GetSaldo(SaldoM);
    SaldoTotalM = Cuenta.GetSaldoTotal(SaldoTotalM);
    
// Creación del menú y bucles
    do{
         NúmeroPresionado = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número de la opción que desees" + "\n1: Introducir Saldo" + "\n2: Retirar Saldo" + "\n3: Crear Cuenta" + "\n0: Salir" + "\n" + "\nTipo de cuenta: " + TipoDeCuentaM + "\n" + "\nSaldo Total: " + SaldoTotalM));
         
        // Código para insertar dinero    
        if (NúmeroPresionado == 1){
            do{
            SaldoM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el saldo que quieras insertar"));
            
            // Validación del dinero insertado
            if (SaldoM < 0){
                JOptionPane.showInputDialog("El valor insertado no es válido");
            }
            else{
                SaldoTotalM = SaldoTotalM + SaldoM;
            }
            
            }while (SaldoM < 0);
        }
        else{
            // Código para retirar dinero
            if (NúmeroPresionado == 2){
                do{
            SaldoM = Double.parseDouble(JOptionPane.showInputDialog("Escribe el saldo que quieras retirar"));
            
            // Validación del dinero insertado
            if (SaldoM < 0){
                JOptionPane.showInputDialog("El valor insertado no es válido");
            }
            else{
                // Validación dinero en cuenta
                if (SaldoM > SaldoTotalM){
                    JOptionPane.showInputDialog("No hay suficiente dinero en tu cuenta");
                }
                else {
                    SaldoTotalM = SaldoTotalM - SaldoM;
                }
            }
                }while (SaldoM < 0);
            }
            else{
                // Código para introducir cuentas
                if (NúmeroPresionado == 3){
                    
                    do {
                        NúmeroPresionadoCuenta = Double.parseDouble(JOptionPane.showInputDialog("Escribe el número de la operación que desees" + "\n1: Cuenta Corriente (Interés fijo de 1,5%)" + "\n2: Cuenta de Ahorro (Interés Variable, 1500€ de saldo mínimo)" + "\n0: Salir"));
                        //Código Cuenta Corriente
                        if (NúmeroPresionadoCuenta == 1){
                            
                            // Validación dos cuentas
                            if (ValidaciónCH == 1){
                                JOptionPane.showInputDialog("No se pueden tener dos cuentas a la vez");
                            }
                            
                            if(ValidaciónCC == 1){
                                JOptionPane.showInputDialog("No se pueden tener dos cuentas a la vez");
                            }
                            else{
                                TipoDeCuentaM = "Cuenta Corriente";
                                ValidaciónCC++;
                                SaldoTotalM = (SaldoTotalM * 1.5)/100;
                            }
                        }
                        else{
                            //Código Cuenta Ahorro
                            if (NúmeroPresionado == 2){
                                
                                // Validación dos cuentas
                                if (ValidaciónCC == 1){
                                    JOptionPane.showInputDialog("No se pueden tener dos cuentas a la vez");
                                }
                                
                                if (ValidaciónCH == 1){
                                    JOptionPane.showInputDialog("No se pueden tener dos cuentas a la vez");
                                }
                                    // Validación Saldo
                                if (SaldoTotalM < 1500){
                                    JOptionPane.showInputDialog("No cuentas con el sueldo mínimo");
                                }
                                else{
                                    TipoDeCuentaM = "Cuenta de Ahorros";
                                    ValidaciónCH++;
                                    SaldoTotalM = (SaldoTotalM * 3)/100;
                                }                
                            }
                        }     
                    }while (NúmeroPresionadoCuenta > 0);
                }    
            }
        }   
    }while (NúmeroPresionado > 0);
  }
}