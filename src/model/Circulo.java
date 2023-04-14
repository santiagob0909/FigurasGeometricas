package model; //poquete model 

/**
 * Esta clase define objetos de tipo circulo con su radio como atributo
 * 
 * //@version 1.0/2023
 * se define un atributo llamado radio de tipo entero
 * Para de tipo Global en la clase...
 */
public class Circulo {
    private int radio;

    /**
     * constructor de la clase Circulo 
     * @param radio Parametro que define el radio de un Circulo
     */
    public Circulo(int radio){
        this.radio = radio;
    }

    /**
     * Constructor de la clase Circulo sin parametros o esta vacio
     */
    public Circulo(){

    }

    /**
     * metodo que calcula y devuelve el area de un circulo como pi multiplicado por
     * el radio al cuadrado
     * @return Area de un circulo
     */
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }  

    /**
     * Metodo que calcula y devuelve el perimetro de un circulo como la 
     * multiplicacion de pi por el radio por 2
     * @return Perimetro de un circulo
     */
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}
