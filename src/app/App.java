package app;

/*importamos cada uno de las figulas geometricas:
 * -Circulo
 * -Cuadrado
 * -Rectangulo
 * -TrianguloRectangulo
 */
import model.Circulo;
import model.Cuadrado;
import model.Rectangulo;
import model.TrianguloRectangulo;


/**
 * Esta clase define de tipo App recibe e imprime todos los resultados de los metodos y funcion
 * de cada figura geometrica
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*Se hace un salto de linea para que todo no este pegado */
        System.out.println("");

        /**
         * Importamos la funcion del Circulo y la guardamos en una variable objtCirculo
         * y le damos el valor al radio
         */
        Circulo objtCirculo = new Circulo(6);

        /** Se imprime el resultado del area del Circulo
         * mediante esto, llamamos el metodo calcularArea para poder hacer
         * la ecuacion y botar el resultado
         */
        System.out.println("El area del circulo es " + objtCirculo.calcularArea());
        
        /** Se imprime el resultado del perimetro del Circulo
         * mediante esto, llamamos el metodo calcularPerimetro para poder hacer
         * la ecuacion y botar el resultado
         */
        System.out.println("El perimetro del circulo es " + objtCirculo.calcularPerimetro());

        /*Se hace un salto de linea para que todo no este pegado */
        System.out.println("");

        /* Importamos la funcion de Cuadrado en una variable objtCuadrado y le damos el valor del lado */
        Cuadrado objtCuadrado = new Cuadrado(5);

        /** Se imprime el resultado del area del Cuadrado
         * mediante esto, llamamos el metodo calcularArea para poder hacer
         * la ecuacion y botar el resultado
         */
        System.out.println("El area del cuadrado es " + objtCuadrado.calcularArea());

        /** Se imprime el resultado del perimetro del Cuadrado
         * mediante esto, llamamos el metodo calcularArea para poder hacer
         * la ecuacion y botar el resultado
         */
        System.out.println("El perimetro del cuadrado es " + objtCuadrado.calcularPerimetro());

        /*Se hace un salto de linea para que todo no este pegado */
        System.out.println("");

        /**
         * Importamos la funcion del Rectangulo y la guardamos en una variable objtTriangulo
         * y le damos los valores para base y altura
         */
        Rectangulo objtRectangulo = new Rectangulo(5, 8);

        /** Se imprime el resultado del area del Rectangulo
         * mediante esto, llamamos el metodo calcularArea para poder hacer
         * la ecuacion y botar el resultado
         */
        System.out.println("El area del Rectangulo es " + objtRectangulo.calcularArea());

        /** Se imprime el resultado del perimetro del Rectangulo
         * mediante esto, llamamos el metodo calcularArea para poder hacer
         * la ecuacion y botar el resultado
         */
        System.out.println("El perimetro del Rectangulo es " + objtRectangulo.calcularPerimetro());

        /*Se hace un salto de linea para que todo no este pegado */
        System.out.println("");

        /**
         * Importamos la funcion del Triangulo Rectangulo y la guardamos en una variable objtCirculo
         * y le damos los valores de la base y la altura
         */
        TrianguloRectangulo objTrianguloRectangulo = new TrianguloRectangulo(12, 15);

        /** Se imprime el resultado del perimetro del Triangulo Rectangulo
         * mediante esto, llamamos el metodo calcularArea para poder hacer
         * la ecuacion y botar el resultado
         */
        System.out.println("El perimetro del Triangulo Rectangulo es " + objTrianguloRectangulo.calcularPerimetro());

        /** Se imprime el resultado del la hipotenusa del Triangulo Rectangulo
         * mediante esto, llamamos el metodo calcularArea para poder hacer
         * la ecuacion y botar el resultado
         */
        System.out.println("la hipotenusa del Triangulo Rectangulo es " + objTrianguloRectangulo.calcularHipotenusa());

        /** Se imprime la funcion determinarTipoTriangulo() para poder determinar si el Triangulo Rectangulo es:
         * - Equilatero: si sus tres lados son iguales
         * - Escaleno: si sus tres lados son todos diferentes
         * - Isosceles: si dos de sus lados son iguales y el otro es diferente de los demas
         */
        objTrianguloRectangulo.determinarTipoTriangulo();

        /*Se hace un salto de linea para que todo no este pegado */
        System.out.println("");
    }
}
