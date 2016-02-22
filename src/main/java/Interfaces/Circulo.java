package Interfaces;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public class Circulo extends abstractShape{

    private double radio;

    public Circulo (double radio)
    {
        super("circulo");
    }
    public double area()
    {
        return (Math.PI*radio*radio);
    }
}
