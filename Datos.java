package adivinanúmero_cod;

import java.util.Random;

public class Datos {
    
// Declaración de los datos
    
    /**
     * Número generado para adivinar
     */
    private double NúmeroAleatorio;
    
    /**
     * Número introducido por el usuario
     */
    private double NúmeroPropuesto;
    
    /**
     * Intentos máximos
     */
    private double IntentosMáximos;
    
    /**
     * Los intentos que el usuario lleva
     */
    private double ContadorIntentos;
    
    /**
     * Número de aciertos en una partida
     */
    private double Puntuación;
            
    /**
     * Nombre del jugador
     */
    private String Alias;
    
    /**
     * Record
     */
    private double Record;
    
    /**
     * Rondas que llevas en una partida
     */
    private double Rondas;
    
    /**
     * Ronda acual
     */
    private double RondaActual;
    

// Creación del Singleton
    
    /**
     * Creamos el contructor privado
     */
    private Datos(){
        
    }
    
    /**
     * Creamos la instancia
     */
    private static Datos Instancia = null;
    
    /**
     * Creamos el método de acceso al bucle y al singleton
     * @return 
     */
    public static Datos GetInstancia(){
        if (Instancia == null){
            Instancia = new Datos();
        }
        return Instancia;
    }
    
// Creación del objeto
    
    /**
     * Creamos el objeto
     */
    Datos MiInstancia = Datos.GetInstancia();
    
 
