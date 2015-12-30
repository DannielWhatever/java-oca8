package oca8.packageTest.otropackage;

import oca8.packageTest.EjemploFueraPackage;
import org.junit.Test;

/**
 * @author daniel.gutierrez
 */
public class EnOtroPackage extends EjemploFueraPackage {

    @Test
    public void probarAccesoProtected(){
        metodoEj();
        new EnOtroPackage().metodoEj();
        //new EjemploFueraPackage().metodoEj(); //NO PERMITIDO, no puede acceder ya que esta en otro package... raro no ?

        new EjemploFueraPackage(){{metodoEj();}};
    }

}
