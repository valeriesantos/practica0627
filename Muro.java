import java.util.ArrayList;
import java.lang.*;

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
    public Muro  ()
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

    /*
     * Metodo que devuelve el total de los datos asociados a Entrada 
     * de las clases texto foto y grupo
     */
    public void verCantidadDatosPorEntrada(){
        for(Entrada entrada : entradas){
            System.out.println(entrada.getCantidadDeDatosAsociadosALaEntrada());
        }
    }

    public void mostrarDatosExclusivosEntradasFiltradas(String entradasFiltradas, String autor ){

        for(Entrada entrada : entradas){
            String textoAComparar = entrada.getClass().getSimpleName();
            String autorAComparar = autor.getClass().getSimpleName();

            if(entradasFiltradas == textoAComparar || autor == autorAComparar || entradasFiltradas == null){
                //Hacemos las comprobaciones necesarias para imprimir 
                if(entrada instanceof  EntradaTexto){
                ((EntradaTexto)entrada).mostrarDatosExclusivos();
                
               }
        }
        
        if(entradasFiltradas == textoAComparar || autor == autorAComparar || entradasFiltradas == null){
            
            if(entrada instanceof EntradaFoto){
                ((EntradaFoto)entrada).mostrarDatosExclusivos();
            }
        }

        if(entradasFiltradas == textoAComparar || autor == autorAComparar || entradasFiltradas == null){
            if(entrada instanceof EntradaUnionAGrupo){
                ((EntradaUnionAGrupo)entrada).mostrarDatosExclusivos();
            }
        }
    }
}
}

