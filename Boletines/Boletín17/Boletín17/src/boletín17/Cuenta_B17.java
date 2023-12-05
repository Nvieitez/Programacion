package boletín17;

public class Cuenta_B17 {
    
// Declaración de los datos
    private double NúmeroCuenta;
    private String TipoDeCuenta;
    
    private double Saldo;
    private double SaldoTotal;

// Constructor por defecto
    public Cuenta_B17(){
        
    }
    
// Constructor parametrizado
    public Cuenta_B17(double NC, double S, double ST, String TDP){
        NúmeroCuenta = NC;
        TipoDeCuenta = TDP;
        
        Saldo = S;
        SaldoTotal = ST;
    }
    
// Métodos de acceso
    public double GetNúmeroCuenta (double NC){
        NúmeroCuenta = NC;
        return NúmeroCuenta;
    }
    
    public double GetSaldo (double S){
        Saldo = S;
        return Saldo;
    } 
    
    public double GetSaldoTotal (double ST){
        SaldoTotal = ST;
        return SaldoTotal;
    }
}