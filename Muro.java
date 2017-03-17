import java.util.ArrayList;

/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
   
    private ArrayList<Entrada> entradas;
    
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        
        entradas = new ArrayList<>();
    }

    public void addEntradas(Entrada entradasNuevas){
        entradas.add(entradasNuevas);              
    }
   

    public String toString()
    {
        String cadenaADevolver = "";

        for (Entrada entrada : entradas)
        {
            cadenaADevolver += entrada + "\n ";
        }
        

        return cadenaADevolver;
    }

    public void mostrar()
    {
        System.out.println(this);
    }

}








