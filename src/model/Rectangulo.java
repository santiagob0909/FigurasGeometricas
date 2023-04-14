package model; // Paquete model

/**
 * Esta clase define objetos de tipo Rectangulo con una base y una
 * altura como atributos.
 * 
 * @version 1.2/2023
 */
public class Rectangulo {
    private int base;
    private int altura;

    /**
     * Constructor de la clase Rectangulo
     * 
     * @param base Parametro que define la base de un rectangulo
     * @param altura Parametro que define la altura de un rectangulo
     */
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo que calcula y devuelve el area de un rectangulo como la
     * multiplicacion de la base por la altura
     * 
     * @return Area de un rectangulo
     */
    public double calcularArea(){
        return base * altura;
    }

    /**
     * Metodo que calcula y devuelve el perimetro de un rectangulo
     * como (2 * base) + (2 * altura)
     * 
     * @return Perimetro de un rectangulo
     */
    public double calcularPerimetro(){
        return (2 * base) + (2 * altura);
    }
    
}
