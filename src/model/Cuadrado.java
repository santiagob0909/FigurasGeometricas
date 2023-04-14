package model; // Paquete model

/**
 * Esta clase define objetos de tipo Cuadrado con un lado como atributos.
 * 
 * @version 1.2/2023
 */
public class Cuadrado {
   int lado; // Atributo que define el lado de un cuadrado
   
   /**
    * Constructor de la clase Cuadrado
    *
    @param lado Parametro que define la longitud de la base de un 
    *           cuadrado
    */
    public Cuadrado(int lado){
        this.lado = lado;
    }

    /**
     * Metodo que calcula y devuelve el area de un cuadrado como el
     * lado elevado al cuadrado
     * 
     * @return Area de un Cuadrado
     */
    public double calcularArea(){
        return lado * lado;
    }

    /**
     * Metodo que calcula y devuelve el perimetro de un cuadrado como
     * cuatro veces su lado
     * 
     * @return Perimetro de un cuadrado
     */
    public double calcularPerimetro(){
        return (4 * lado);
    }
}
