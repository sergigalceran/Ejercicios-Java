package Interfaces;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Principal {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circulo(2.5);
        shapes[1] = new Rectangulo(3, 5);

        for (Shape shape : shapes)
            System.out.println( shape + " with area = " + shape.area());
    }

}
