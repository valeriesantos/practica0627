import java.util.ArrayList;
import java.lang.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.net. *;
import java.io.File;
import java.util.Scanner;

/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{

    private ArrayList<Entrada> entradas;
    private Muro[] objetos;
    private EntradaTexto entradaT1;
    private EntradaFoto entradaF1;
    private EntradaUnionAGrupo entradaU1;
    private Muro muro1;
    /**
     * Constructor for objects of class Muro
     */
    public Muro  ()
    {

        entradas = new ArrayList<>();
        objetos = new Muro[4];
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

    public void mostrarMuroEnNavegador(){
        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una
        try  
        {
            Path rutaArchivo = Paths.get("output.html");

            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);

            archivo.write("<html>");
            archivo.write("<head>");
            archivo.write("<title> Mi red social </title>");
            archivo.write("<link href='estilos.css' rel='stylesheet' type='text/css'>");
            archivo.write("</head>");
            archivo.write("<body>");
            archivo.write("<div id='header'>");
            archivo.write("<h1 align='left'> <a name='arriba' ud='arriba'> Faceval</a> </h1> ");
            archivo.write("</div>");

            archivo.write (" <p align='right'> Usuario: <input type='text' name='usuario' size='15'> <br/> <br/> Contrase&ntilde;a: <input type='password' name='contrase&ntilde;a' size='15'> <br/><br/> <input type='submit' style='background-color: #88EEED;' value='Registrarse'> </p>  ");
            archivo.write("<h2 align='center'>MI MURO ...</h2>");

            archivo.write(toString()); 
            archivo.write("<p align='right'> <span style='color:#88EEED'> <a href='#arriba'> VOLVER ARRIBA </span></a></p>");
            archivo.write("</body>");
            archivo.write("</html>");

            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }

        Runtime run = Runtime.getRuntime();
        try{
            run.exec("/usr/bin/firefox file:///home/valerie/Escritorio/DAM/Programacion/proyectos%20Miguel/red-social-hecho-en-clase/output.html");     

        }
        catch(IOException excepcion){
            System.out.println(excepcion.toString());
        }

    }

    public void mostrarMuroEnNavegador(String usuario){
        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una

        try{
            URL url = new URL("  https://script.google.com/macros/s/AKfycbzHc3p1twTfyF7o0_cxSwnxSsyOemuHnSu406ly9DZIf5Ck2BA/exec?user=" + usuario);
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNextLine()) {

                String string = sc.nextLine();
                String[] parts = string.split(";");
                String part1 = parts[0];//tipo entrada
                String part2 = parts[1];//autor
                String part3 = parts[2];
                String part4= parts[3];
                String part5 = parts[4];//titulo
                String part6 = parts[5];
                String part7 = parts[6];

                if (parts[0].equals("EntradaTexto")) {
                    entradaT1 = new EntradaTexto(parts[1],parts[4]);
                }

                if(parts[0].equals("EntradaFoto")){
                    entradaF1=new EntradaFoto(parts[1],parts[4],parts[5]);
                }

                if(parts[0].equals("EntradaUnionAGrupo")){
                    entradaU1=new EntradaUnionAGrupo(parts[1],parts[4]);
                }
                
                addEntradas(entradaF1);
                addEntradas(entradaT1);
                addEntradas(entradaU1);
                mostrarMuroEnNavegador();
            }
            sc.close();


        }       
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

