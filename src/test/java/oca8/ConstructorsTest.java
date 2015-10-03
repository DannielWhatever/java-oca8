package oca8;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ConstructorsTest {

    @Test
    public void pruebaaConstructorConParametrosEnEspecializacion(){
        assertNotNull(new Especializacion("oca8"));
        //si no se especifica explicitamente, el constructor siempre llamara a super sin parámetros.
    }
}


class Doctor{
    Doctor(){System.out.println(1);}
    Doctor(String tipo){System.out.println(2);}
}

class Especializacion extends  Doctor{
    private String tipo;

    Especializacion(String tipo){
        this.tipo = tipo;
    }
}
