/**
 * @author daniel.gutierrez
 */
public class App2 {
    { //los de instancia no van, ya que no se ha creado ninguna instancia de la clase
        System.out.println("yo jamas :C");
    }
    public static void main(String... args){ //luego el main
        System.out.println("2- yo dp");
    }
    static{ //primero los inicializadores estaticos
        System.out.println("1- yo voy primero");
    }
}
