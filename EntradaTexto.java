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

    public String toString()
    {
        String cadenaADevolver = "";

        cadenaADevolver += "Usuario: " + getUsuario() ;
        cadenaADevolver += " " + mensaje ;
        cadenaADevolver += " " + getCantidadMeGusta() + " me gusta" + "\n";

        long segundosQueHanPasadoDesdeCreacion =getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;

        cadenaADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos " + "\n";
        }
        cadenaADevolver += segundosResiduales + " segundos." + "\n";       

        if (getComentarios().isEmpty()) {
            cadenaADevolver += "La entrada no tiene comentarios." + "\n";
        }
        else {
            //Se recopilan los comentarios
            cadenaADevolver += "Comentarios:\n";
            for (String comentario : getComentarios()) {
                cadenaADevolver += comentario ;
            }
        }   

        return cadenaADevolver;
    }
    
     public void mostrar()
    {
        System.out.println(this);
    }

}
