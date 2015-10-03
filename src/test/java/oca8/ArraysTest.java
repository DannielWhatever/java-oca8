package oca8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArraysTest {

    @Test
    public void declaracionDeArrays(){
        int arr [] = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3[] = {{1,2},{1,2},{1,2}};
        int arr4[] = new int[]{1,2};
        int arr5[] = new int[2];
        int arr6[][] = new int[3][];
        //int arr7[2] = {1,2}; //Not valid
        //Nunca es válido incluir el tamaño de un array en la declaración

        int[] intArr = new int[3];
        char[] charArr = new char[3];
        //intArr = charArr;
        //No es válido asignar array de distinto tipo, aunque los tipos en si sean casteables
        List[]  listArr = new List[3];
        ArrayList[] arrlArr = new ArrayList[3];
        listArr = arrlArr;
        //Pero esto si parece ser válido entre array de objetos
    }

    @Test
    public void arrayAnonimo(){
        StringBuilder output = new StringBuilder();
        for(String s : new String[]{"hola"," ","mundo"}){
            output.append(s);
        }
        assertEquals("hola mundo", output.toString());
    }

    @Test
    public void copyOfRangeArrays(){
        String[] arr1 = {"1","2","3"};
        String[] arr2 = Arrays.copyOfRange(arr1,1,arr1.length); //no incluye la última posición
        assertEquals("2", arr2[0]);
        assertTrue(arr2.length == 2);
    }


}
