package oca8.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


class Padre{
    static String callStatic(){
        return "yo soy tu padre";
    }
    String callInstance(){
        return "yo soy tu padre";
    }
}
class Hijo extends Padre{
    static String callStatic(){
        return "noooo!";
    }
    String callInstance(){
        return "noooo!";
    }
}

public class PolimorfismoTest {


    @Test
    public void llamadoEstatico(){
        //Cuándo llamas un método estático, lo que importa es el tipo de la variable de referencia.
        Padre p1 = new Padre();
        Padre p2 = new Hijo();
        assertEquals(p1.callStatic(), "yo soy tu padre");
        assertEquals(p2.callStatic(), "yo soy tu padre");
    }

    @Test
    public void llamadoInstancia(){
        //Cuándo llamas un método de instancia, lo que importa es el tiṕo de la instancia asignada.
        Padre p1 = new Padre();
        Padre p2 = new Hijo();
        assertEquals(p1.callInstance(), "yo soy tu padre");
        assertEquals(p2.callInstance(), "noooo!");
    }

}
