package oca8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Operadores {

    @Test
    public void incrementarWeird(){
        int i = 0;
        int suma =  i++ + ++i + ++i; //para cuando se va a sumar el segundo valor el i++ ya actuo
        assertEquals(suma, 5);
    }

}
