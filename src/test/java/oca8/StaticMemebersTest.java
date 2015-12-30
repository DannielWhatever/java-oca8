package oca8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author daniel.gutierrez
 */
public class StaticMemebersTest {

    static final String HOLA = "hola";

    @Test
    public void llamandoUnMiembroEstatico(){

        assertEquals(HOLA, this.HOLA);
        assertEquals(HOLA, StaticMemebersTest.HOLA);

        StaticMemebersTest instance = new StaticMemebersTest();
        assertEquals(HOLA, instance.HOLA);

        StaticMemebersTest nullInstance = null;
        assertEquals("quirky but this actually works", HOLA, nullInstance.HOLA);



    }


}
