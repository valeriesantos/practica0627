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
    
    @Override
    public String toString()
    {
       //llamamos al toString de la clase padre(Entrada)
       //para que se invoque el metodo toString de dicha clase
        String cadenaADevolver = super.toString();

        cadenaADevolver = "<p class='note'> "+ cadenaADevolver+  "<br/> Se ha unido al grupo: " + grupo+ "\n";
       

        return cadenaADevolver;
    }
     
    public void mostrar()
    {
        System.out.println(this);
    }
    
    
    public int getCantidadDeDatosAsociadosALaEntrada (){
        return 4;
        
    }
    
    public void mostrarDatosExclusivos(){
        
        String textoAMostrar = "Se ha unido al grupo: " + grupo + "\n";
        System.out.println(textoAMostrar);
        

    }
}
