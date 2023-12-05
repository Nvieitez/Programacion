package boletín9_2;

public class Boletín9_2 {

public static void main(String[] args) {

// Declaración de los datos
    double ContadorNúmeros = 10;
    double CálculoSuma = 0;
    
// Bucle
    while (ContadorNúmeros < 90){
        CálculoSuma += ContadorNúmeros;
        ContadorNúmeros++;
    }

// Resultado
    System.out.println(CálculoSuma);
    
    }    
}
