import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class EntradaFoto extends EntradaConComentarios
{

    private String urlImagen;
    private String titulo; 
    private int cantidadDatosFoto;
    private EntradaFoto entradasFiltradas;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;

    }
   
  
    public String getUrlImagen()
    {
        return urlImagen;
    }

    public String getTituloImagen()
    {
        return titulo;
    }    

    
    public String toString()
    {
        //llamamos al toString de la clase padre(EntradaConComentarios)
        String cadenaADevolver = super.toString();

        cadenaADevolver += titulo + "\n";
        cadenaADevolver += urlImagen + "\n";

        return cadenaADevolver;
    }

    public int getCantidadDeDatosAsociadosALaEntrada(){
   
        return 6;
    }
    
    public void mostrarDatosExclusivos(){
        String textoAMostrar = titulo + "\n" + urlImagen + "\n";
        
       System.out.println(textoAMostrar);
        

    }
}