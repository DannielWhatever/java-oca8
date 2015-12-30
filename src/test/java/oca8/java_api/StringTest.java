package oca8.java_api;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 24-09-15.
 */
public class StringTest {

    @Test
    public void stringConstantPool(){
        //Prueba de string constant pool
        String str1 = "hola";
        String str2 = "hola";
        String str3 = new String("hola");
        assertEquals(str1, str2);
        assertFalse(str1 == str3);
        assertTrue("chao"=="chao");

        //otra prueba, mas rebuscada
        str1 = "chao";
        str2 = "chao".trim();
        str3 = " chao".trim();
        assertTrue(str1 == str2);
        assertFalse(str1 == str3);
    }



}
