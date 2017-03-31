import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class EntradaTexto extends EntradaConComentarios
{
    private String mensaje; 

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        super(autor);
        mensaje = texto;

    }

    public void addComentario(String texto)
    {
        getComentarios().add(texto);        
    }

    public String getMensaje()
    {
        return mensaje;
    }

    @Override
    public String toString()
    {
        //llamamos al toString de la clase padre(EntradaConComentarios)
        String cadenaADevolver =  super.toString();

        cadenaADevolver = "<p class='note'>"+ cadenaADevolver+  "<br/>"+  mensaje + "\n <br/>";

        return cadenaADevolver;
    }

    public void mostrar()
    {
        System.out.println(this);
    }

    public int getCantidadDeDatosAsociadosALaEntrada (){

        return 5;
    }

    public void mostrarDatosExclusivos(){        
        String textoAMostrar =  mensaje + "\n";        

        System.out.println(textoAMostrar);
    }

    public void mostrarDatosExclusivosEntradasFiltradas(String entradasFiltradas, String autor ){
        String textoFiltrado = entradasFiltradas;
    }

}
