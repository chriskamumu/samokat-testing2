package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalGetFoodExceptionTest {

    @Test
    public void testGetFoodWithIncorrectArgumentReturnException() {
        Animal animal = new Animal();
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        try {
            animal.getFood("хищница");
        } catch (Exception e) {
            assertEquals(expected, e.getMessage());
        }
    }
}
