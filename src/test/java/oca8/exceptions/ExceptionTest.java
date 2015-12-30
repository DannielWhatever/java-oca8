package oca8.exceptions;

import org.junit.Test;

class ClaseQlaQueProvocaUnStackOverflowError {
    ClaseQlaQueProvocaUnStackOverflowError(){
        ClaseQlaQueProvocaUnStackOverflowError x = new ClaseQlaQueProvocaUnStackOverflowError();
    }
}

public class ExceptionTest {


    @Test(expected = StackOverflowError.class)
    public void stackoverflow(){
        new ClaseQlaQueProvocaUnStackOverflowError(); //dont try this at home
    }

}


