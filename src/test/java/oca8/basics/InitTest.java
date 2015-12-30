package oca8.basics;

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

    public static class ClaseParaTestAsignacion{
        {
            //System.out.println(i); not valid
        }
        public ClaseParaTestAsignacion(){
            {
                { //wtf , this is valid !
                    System.out.println(i);
                    i = 3;
                }
            }
        }
        int i = 1;
        {
            i = 2;
        }
    }

    @Test
    public void ordenAsignacion(){
        ClaseParaTestAsignacion claseParaTestAsignacion = new ClaseParaTestAsignacion();
        System.out.println(claseParaTestAsignacion.i);
    }

}
