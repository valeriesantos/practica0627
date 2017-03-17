import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class EntradaFoto extends EntradaConComentarios
{

    private String urlImagen;
    private String titulo; 
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
        String cadenaADevolver = "";

        cadenaADevolver += "Usuario: " + getUsuario() + "\n";
        cadenaADevolver += titulo + "\n";
        cadenaADevolver += urlImagen + "\n";
        cadenaADevolver += getCantidadMeGusta() + " me gusta";

        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;

        cadenaADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";       

        if (getComentarios().isEmpty()) {
            cadenaADevolver += "La entrada no tiene comentarios.";
        }
        else {
            //Se recopilan los comentarios
            cadenaADevolver += "Comentarios:\n";
            for (String comentario : getComentarios()) {
                cadenaADevolver += comentario + "\n";
            }
        }   

        return cadenaADevolver;
    }


}