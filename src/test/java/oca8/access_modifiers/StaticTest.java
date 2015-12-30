package oca8.access_modifiers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author daniel.gutierrez
 */
public class StaticTest {

    static final String HOLA = "hola";

    @Test
    public void llamandoUnMiembroEstatico(){

        assertEquals(HOLA, this.HOLA);
        assertEquals(HOLA, StaticTest.HOLA);

        StaticTest instance = new StaticTest();
        assertEquals(HOLA, instance.HOLA);

        StaticTest nullInstance = null;
        assertEquals("quirky but this actually works", HOLA, nullInstance.HOLA);



    }


}
