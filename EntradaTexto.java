import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;


public class EntradaTexto
{
    private String usuario;
    private String mensaje;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;


    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        usuario = autor;
        mensaje = texto;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }

    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);        
    }
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "Usuario: " + usuario + "\n";
        cadenaADevolver += mensaje + "\n";
        cadenaADevolver += cantidadMeGusta + " me gusta";
        
        long segundosQueHanPasadoDesdeCreacion = momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";       
        
        if (comentarios.isEmpty()) {
            cadenaADevolver += "La entrada no tiene comentarios.";
        }
        else {
            //Se recopilan los comentarios
            cadenaADevolver += "Comentarios:\n";
            for (String comentario : comentarios) {
                cadenaADevolver += comentario + "\n";
            }
        }   
        
        return cadenaADevolver;
    }
    
    

}


















