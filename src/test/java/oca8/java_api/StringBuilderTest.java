package oca8.java_api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by Administrador on 06-10-2015.
 */
public class StringBuilderTest {



    @Test
    public void capacidadInicialStringBuilder(){
        StringBuilder sb = new StringBuilder();
        assertEquals(16,sb.capacity());
        assertEquals(0,sb.length()); //length is different to capacity, capacity initial is length + 16.

        sb = new StringBuilder("hola");
        assertEquals(20,sb.capacity());
        assertEquals(4,sb.length());
    }

    @Test
    public void equalityInStringBuilder(){
        StringBuilder sb1 = new StringBuilder("hola");
        StringBuilder sb2 = new StringBuilder("hola");
        assertFalse(sb1 == sb2); //this is obvious
        assertFalse(sb1.equals(sb2)); //this not. StringBuilder doesn't implement the "equals" method.
    }

}
