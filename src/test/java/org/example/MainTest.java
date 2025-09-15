package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getValue_shouldThrowException_method1() {
        try  {
            Main.getValue();
            fail();
        }catch (InvalidIdException e){
            //success


        }
    }

    @Test
    void getValue_shouldThrowException_method2() {

    }
}