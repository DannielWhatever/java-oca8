package oca8.java_api;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void declaracionDeArrays(){
        int arr [] = {1,2,3};
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = {1,2,3}; //La declaración de arr1 y arr2 hacen lo mismo.

        int[] arr3[] = {{1,2},{1,2},{1,2}};
        int arr4[] = new int[]{1,2};
        int arr5[] = new int[2];
        int arr6[][] = new int[3][];


        //Nunca es válido incluir el tamaño de un array en la declaración
        //int arr7[2] = {1,2}; //Not valid

        int[] intArr = new int[3];
        char[] charArr = new char[3];
        //intArr = charArr;
        //No es válido asignar array de distinto tipo, aunque los tipos en si sean casteables


        List[]  listArr = new List[3];
        ArrayList[] arrlArr = new ArrayList[3];
        //Pero esto si parece ser válido entre array de objetos
        listArr = arrlArr;
        List[]  listArr2 = new ArrayList[3];
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

    @Test
    public void valoresIniciales(){
        int[] arr1 = new int[3];
        assertEquals(0,arr1[2]);

        String[] arr2 = new String[3];
        assertNull(arr2[2]);
    }


    @Test
    public void declaracionDeArraysMultiplesRarita(){
        //two arrays
        int[] arr1, arr2;
        arr1 = new int[2];
        arr2 = new int[2];

        //one array and one primitive
        int arr3[], arr4;
        arr2 = new int[2];
        arr4 = 0;
    }

    @Test
    public void toStringTest(){
        assertTrue(new String[2].toString().startsWith("[Ljava.lang.String"));
        assertEquals("[null, null]",Arrays.toString(new String[2]));
    }

    @Test(expected = ArrayStoreException.class)
    public void arrayStoreEx(){
        Object[] arrObjects = new String[2];
        arrObjects[0] = new String("da");
        arrObjects[1] = new Double(2.1F); //throw ex
    }



    //sorting arrays

    //searching with binarySearch


}
