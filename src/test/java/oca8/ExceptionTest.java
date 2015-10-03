package oca8;

import org.junit.Test;

class Emp{
    Emp(){
        Emp x = new Emp();
    }
}

public class ExceptionTest {


    @Test(expected = StackOverflowError.class)
    public void stackoverflow(){
        new Emp(); //dont try this at home
    }

}


