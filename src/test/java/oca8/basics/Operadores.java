package oca8.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Operadores {

    @Test
    public void incrementarWeird(){
        int i = 0;
        int suma =  i++ + ++i + ++i; //para cuando se va a sumar el segundo valor el i++ ya actuo
        assertEquals(5, suma);
    }

    @Test
    public void asignacionesWeird(){
        int x = 12;
        int y = 1 + (x = 4);
        assertEquals(4, x);
        assertEquals(5, y);
    }

    @Test
    public void asignacionTricky(){
        for(int i=0;i<10;){
            i = i++;
            if(i==0)
                break; //i understand, this is an infinite loop, u win :/
        }
    }

    @Test
    public void xor(){
        assertFalse(true ^ true);
        assertFalse(false ^ false);
        assertTrue(true ^ false);
        assertTrue(false ^ true);
    }

}
