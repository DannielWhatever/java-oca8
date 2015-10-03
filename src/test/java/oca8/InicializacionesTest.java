package oca8;


import org.junit.Test;

import static org.junit.Assert.*;

public class InicializacionesTest {



    int num = 0;
    @Test
    public void testScope(){
        int num = 2;
        //for(int num =1;num<2;++num){} Not valid
        assertEquals(num,2);
    }


    @Test
    public void variableLocalesSinInicializar(){
        String str;
        //System.out.println(name);
        //No compila.
    }

    String str;boolean bool;byte b;int i;long l;float f;double d;char c;
    @Test
    public void variablesInstanciaSinInicializar(){
        //Valores de variables de instancia sin inicializar
        assertNull(str);
        assertFalse(bool);
        assertEquals(b, 0);
        assertEquals(i, 0);
        assertEquals(l, 0);
        assertEquals(f, 0.0,0);
        assertEquals(d, 0.0,0);
        System.out.println(c);
    }

}
