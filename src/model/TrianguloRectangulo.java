package model; // Paquete model

/**
 * Esta clase define de tipo Triangulo Rectangulo con una
 * base y una altura como atributos.
 * @version 1.2/2023
 */
public class TrianguloRectangulo {
    private int base; // Atributo que define la base de un triangulo rectangulo
    private int altura; // Atributo que define la altura de un triangulo rectangulo

    /**
     * Constructor de la clase TrianguloRectangulo
     * 
     * @param base   Parametro que define la base de un triangulo
     *               rectangulo
     * @param altura Parametro que define la altura de un triangulo
     *               rectangulo
     */
    public TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo que calcula y devuelve el perimetro de un triangulo
     * rectangulo como la suma de la base, la altura y la hipotenusa
     * 
     * @return Perimetro de un triangulo rectangulo
     */
    public double calcularPerimetro(){
        return (base * altura + calcularHipotenusa()); /**Invoca al metodo calcular hipotenusa */
    }

    /**
     * Metodo que calcula y devuelve la hipotenusa de un triangulo
     * rectangulo utilizando el teorema de Pitagoras
     * @return Hipotenusa de un trinagulo rectangulo
     */
    public double calcularHipotenusa(){ //en esta parte agregue el public por sin el no puedo tranferir el resultado a App
        return Math.pow(base * base + altura * altura, 0.5);
    }

    /**
     * Metodo que determina si un triangulo es:
     * - Equilatero: si sus tres lados son iguales
     * - Escaleno: si sus tres lados son todos diferentes
     * - Isosceles: si dos de sus lados son iguales y el otro es diferente de los demas
     */
    public void determinarTipoTriangulo(){
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("Es un triangulo equilatero"); /* Tods sus lados son iguales */
        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            System.out.println("Es un triangulo escaleno"); /* Todos sus lados son diferentes */
        } else{
            System.out.println("Es un triangulo isosceles"); /* De otra manera, es isosceles */
        } 
    }
}

