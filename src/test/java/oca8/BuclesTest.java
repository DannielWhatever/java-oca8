package oca8;

import org.junit.Assert;
import org.junit.Test;

class Instancia{
    String name = "inicial";
}
public class BuclesTest {

    @Test
    public void asig(){
        Instancia[] instancias = {new Instancia(), new Instancia()};
        instancias[0].name = "modificado";
        for(Instancia i:instancias){
            i = new Instancia(); //cambia la referencia del objeto
        }
        Assert.assertEquals(instancias[0].name, "modificado");
        for(Instancia i :instancias){
            i.name = "oca8"; //es una copia de la referencia, por lo que se verá reflejado el cambio
        }
        Assert.assertEquals(instancias[0].name, "oca8");
    }

}
