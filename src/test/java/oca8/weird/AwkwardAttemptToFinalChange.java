package oca8.weird;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 *
 * THIS STILL NOT WORKING.
 *
 *
 *
 * @author daniel.gutierrez
 */
public class AwkwardAttemptToFinalChange {

    @Test
    public void mainTest() throws NoSuchFieldException, IllegalAccessException {
        LaClase laClase = new LaClase();
        Class clazz = laClase.getClass();
        Field fieldSeguro = clazz.getDeclaredField("CONSTANT");

        fieldSeguro.setAccessible(true);

        Class clazzField = fieldSeguro.getClass();
        Field fieldModifiers = clazzField.getDeclaredField("modifiers");

        fieldModifiers.setAccessible(true);

        System.out.println(fieldModifiers.getModifiers());
        fieldModifiers.setInt(fieldSeguro, fieldModifiers.getModifiers() & ~Modifier.FINAL);
        //fieldModifiers.setInt(fieldSeguro, 20);

        System.out.println(fieldModifiers.getModifiers());

        fieldSeguro.set(laClase, 4);

        System.out.println("Es el atributo final 2: "+ laClase.CONSTANT);

        System.out.println(clazz.getDeclaredField("CONSTANT").get(laClase));
    }

}

class LaClase {

    public static final String SEGURO = "si";
    public static final Integer CONSTANT = 2;

    public String getSEGURO() {
        return SEGURO;
    }

}