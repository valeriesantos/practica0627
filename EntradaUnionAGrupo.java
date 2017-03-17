import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Write a description of class EntradaUnionAGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    private String grupo;    
    /**
     * Constructor for objects of class EntradaUnionAGrupo
     */
    public EntradaUnionAGrupo(String autor,String grupo)
    {
        super(autor);  
        this.grupo = grupo;
        
    }
     public String toString()
    {
        String cadenaADevolver = "";

        cadenaADevolver += "Usuario: " + getUsuario()+"\n";
        cadenaADevolver += "Se ha unido a " + grupo+ "\n";
        cadenaADevolver += getCantidadMeGusta() + " me gusta";

        long segundosQueHanPasadoDesdeCreacion =getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;

        cadenaADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";       

       

        return cadenaADevolver;
    }
     
    public void mostrar()
    {
        System.out.println(this);
    }

    
}
