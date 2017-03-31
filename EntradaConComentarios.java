import java.util.ArrayList;
/**
 * Write a description of class Comentarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaConComentarios extends Entrada
{
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class Comentarios
     */
    public EntradaConComentarios(String autor)

    {
        super(autor);
        comentarios = new ArrayList<>();
    }

    public void addComentario(String texto)
    {
        getComentarios().add(texto);        
    }

    public ArrayList<String> getComentarios(){

        return comentarios;
    }
    
    
    @Override
    public String toString(){
        //llamamos al toString de la clase padre con super(Entrada)
        String cadenaADevolver = super.toString();
        
         if (getComentarios().isEmpty()) {
            cadenaADevolver += "\n <br/>" + "La entrada no tiene comentarios.\n" ;
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
    
    
 
}
