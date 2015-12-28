package oca8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrador on 06-10-2015.
 */
public class StringBuilderTest {



    @Test
    public void baseTest(){
        StringBuilder sb = new StringBuilder();
        assertEquals(16,sb.capacity());
        assertEquals(0,sb.length());

        sb = new StringBuilder("hola");
        assertEquals(20,sb.capacity());
        assertEquals(4,sb.length());


    }

}
