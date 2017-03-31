

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class test2.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test2
{
    private EntradaFoto entradaF1;
    private EntradaTexto entradaT1;
    private EntradaUnionAGrupo entradaU1;
    private EntradaFoto entradaF2;
    private Muro muro1;

    /**
     * Default constructor for test class test2
     */
    public test2()
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
        entradaF1 = new EntradaFoto( "Valerie Santos", "https://s-media-cache-ak0.pinimg.com/originals/18/1b/90/181b90b27e4066088f4f085ef5d8a7f6.jpg", "Blue Parrot");
        entradaT1 = new EntradaTexto("Sergi", "Guauu");
        entradaU1 = new EntradaUnionAGrupo("Juan Perez", "Grupo tech SPain");
        entradaF2 = new EntradaFoto("Valerie Santos", "https://scontent.fmad3-2.fna.fbcdn.net/v/t1.0-9/15727184_10210093903616289_7503875300191108133_n.jpg?oh=4343d4b75a6daffe6c1e03aef11558ed&oe=59503C1A", "Saturday night");
        muro1 = new Muro();
        muro1.addEntradas(entradaF1);
        muro1.addEntradas(entradaT1);
        muro1.addEntradas(entradaU1);
        muro1.addEntradas(entradaF2);
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
