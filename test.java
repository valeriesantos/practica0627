

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test
{
    private EntradaFoto entradaF1;
    private EntradaTexto entradaT1;
    private EntradaUnionAGrupo entradaU1;
    private Muro muro1;
    private EntradaFoto entradaF2;
    private EntradaFoto entradaF3;

    
    
    
    

    /**
     * Default constructor for test class test
     */
    public test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        entradaF1 = new EntradaFoto("Valerie", "https://scontent.fmad3-2.fna.fbcdn.net/v/t1.0-9/15727184_10210093903616289_7503875300191108133_n.jpg?oh=4343d4b75a6daffe6c1e03aef11558ed&oe=59503C1A", "Saturday");
        entradaT1 = new EntradaTexto("Sergi", "Geniaaal");
        entradaU1 = new EntradaUnionAGrupo("Valerie Santos", "Grupo techno Spain");
        muro1 = new Muro();
        muro1.mostrar();
        muro1.addEntradas(entradaF1);
        muro1.addEntradas(entradaT1);
        muro1.addEntradas(entradaU1);
        entradaF2 = new EntradaFoto("Juan Perez", "data:image/jpeg;base64,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", "Blue Parrot");
        muro1.addEntradas(entradaF2);
        muro1.mostrarMuroEnNavegador();
        entradaF3 = new EntradaFoto("Valerie Santos", "https://s-media-cache-ak0.pinimg.com/originals/18/1b/90/181b90b27e4066088f4f085ef5d8a7f6.jpg", "Blue Parrot");
        muro1.addEntradas(entradaF3);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}