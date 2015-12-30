package oca8.access_modifiers.protected_test.otropackage;

import oca8.access_modifiers.protected_test.EjemploProtected;
import org.junit.Test;

/**
 * @author daniel.gutierrez
 */
public class ProtectedTest extends EjemploProtected {

    @Test
    public void probarAccesoProtected(){
        metodoEj();
        new ProtectedTest().metodoEj();
        //new EjemploProtected().metodoEj(); //NO PERMITIDO, no puede acceder ya que esta en otro package... raro igual..

        new EjemploProtected(){{metodoEj();}};
    }

}
