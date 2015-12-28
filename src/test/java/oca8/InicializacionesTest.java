package oca8;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class InicializacionesTest {


    int num = 0;
    @Test
    public void testScope(){
        int num = 2; //valid -- shadowing
        //for(int num =1;num<2;++num){} Not valid
        assertEquals(num,2);
    }


    @Test
    public void variableLocalesSinInicializar(){
        String str;
        //System.out.println(str);
        //No compila.
    }

    String str;
    boolean bool;byte b;int i;long l;float f;double d;char c;
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

    @Test
    public void weirdIntegers(){
        int i, j = 2;
        //System.out.println(i);//doesnt compile : i dont have been initialized
        System.out.println(j);

        int i1 = 1_000_000;
        int i2 = 0xCAfe;
        int i3 = 0B10;
        long l1 = 1; //valid
        //long l2 = 3_000_000_000; //invalid (integer too larg)
        long l2 = 3_000_000_000L;
        assertEquals(1, l1);
        assertEquals(1000000,i1);
        assertEquals(100000___0,i1); //yeah, its equal :s
        assertEquals(2,i3);

        //Long ll1 = 1; //not valid
        Long ll1 = 1L; //autobox (?) from long
        Long ll2 = (long)1;
        assertTrue( l1 == ll1);
        assertTrue( ll1.equals(l1));

    }


    @Test
    public void prueba1(){
        String[][] miArray = new String[][]{{"hola"},{"hola","chao"}};
    }

    static Map<Integer,String> map = new HashMap<>();
    static{
        map.put(1,"hola");
        map.put(2,"chao");
    }

    static Map<Integer,String> map1 = new HashMap(){{
        put(1,"hola");
        put(2,"chao");
    }};

    static Map<Integer,String> map2 = new HashMap(){
        public void sayHello(){
            System.out.println("hola");
        }
    };



}
