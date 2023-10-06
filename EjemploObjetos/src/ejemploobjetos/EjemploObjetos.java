package ejemploobjetos;

public class EjemploObjetos {

public static void main(String[] args) {

//creación del objeto
    Rectángulo obxRec = new Rectángulo();
    
// Cálculo base
    obxRec.DarValorBase(5f);
    float ba = obxRec.DevolverValorBase();
    System.out.println("base = "+ ba);

// Cálculo altura
    obxRec.DarValorAltura(10f);
    float al = obxRec.DevolverValorAltura();
    System.out.println("altura = "+ al);
    
// Cálculo area
    obxRec.CalcularArea(6,7);
    
// Cálculo perímetro
    float pe = obxRec.CalcularPerimetro(6, 7);
    System.out.println("perimetro = "+ pe);
    
// instanciamos un rectángulo con el constructor parametrizado
    Rectángulo obxR = new Rectángulo (12,6);
    System.out.println("base = "+ obxR.DevolverValorBase());
    }
}
    
