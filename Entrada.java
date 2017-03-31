import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.lang.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;

/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor)
    {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }

    public void meGusta()
    {
        cantidadMeGusta++;
    }

    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }

    public String toString()
    {
        super.toString(); 
        String cadenaADevolver = "";

        cadenaADevolver += "<b> Usuario: </b>" + getUsuario() +"\n"+  "<br/>" ;
        cadenaADevolver += getCantidadMeGusta() + " me gusta\n  <br/>"  ;

        long segundosQueHanPasadoDesdeCreacion =getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;

        cadenaADevolver += "\n"+ "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += "\n"+ minutosQueHanPasadoDesdeCreacion + " minutos " + "\n <br/>";
        }
        cadenaADevolver += "\n" + segundosResiduales + " segundos." + "\n";       


        return cadenaADevolver;   
    }

    public String getUsuario(){
        return usuario;

    }

    public int getCantidadMeGusta(){
        return cantidadMeGusta;

    }

    public void mostrar(){

    }
    
    
    public int getCantidadDeDatosAsociadosALaEntrada (){
      return 0; 
    }
    
    
     public void archivoHtml(){
           // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una
        try  
        {
            Path rutaArchivoHtml = Paths.get("plantilla.html");
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivoHtml);
            archivo.write(toString());
            
            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }
    }
    
        
    }

