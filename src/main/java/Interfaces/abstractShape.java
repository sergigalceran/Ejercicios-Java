package Interfaces;

/**
 * Created by Sergi1 on 22/02/2016.
 */
public abstract class abstractShape implements Shape{

    private String tipo;

    public abstractShape(String tipo)
    {
        this.setTipo(tipo);
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "I'm a " + tipo;
    }




}
