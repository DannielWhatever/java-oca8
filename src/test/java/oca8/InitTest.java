package oca8;

import org.junit.Test;

class TheFather{

    TheFather(){
        System.out.println("the father");
    }
}
class MiClase extends TheFather{
    {
        System.out.println("init instance 1");
    }
    MiClase(){
        System.out.println("the class");
    }
    static{
        System.out.println("init static 1");
    }
    static{
        System.out.println("init static 2");
    }
    {
        System.out.println("init instance 2");
    }
}

public class InitTest {

    @Test
    public void ordenIniciacion(){
        new MiClase();
        new MiClase();
    }
}
