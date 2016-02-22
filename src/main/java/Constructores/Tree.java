package Constructores;

/**
 * Created by Sergi1 on 17/02/2016.
 */
public class Tree{
    String tipo;
    int altura;

    public Tree()
    {
        altura=0;
        tipo=null;
    }
    public Tree(int h,String t)
    {
        tipo=t;
        altura=h;
    }
    public Tree(String t)
    {
        tipo=t;
        altura=0;
    }
    public Tree(int h)
    {
        altura=h;
        tipo=null;
    }

    public void arbol()
    {
        if(this.altura<=0 && this.tipo==null)
            System.out.println("Un arbol");
        if(altura>0 && this.tipo==null)
            System.out.println("Un arbol de "+ this.altura+" metros");
        if(altura<=0 && this.tipo!=null)
            System.out.println("Un "+ this.tipo+"");
        if(altura>0 && this.tipo!=null)
            System.out.println("Un "+this.tipo+" de "+ this.altura+" metros");
    }


    public static void main( String[] args )
    {
        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1]=new Tree("Roble");
        arboles[2]=new Tree();
        arboles[3]=new Tree(5,"Pino");
        for (Tree t : arboles)
            t.arbol();

    }
}