package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: " +
                "заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }
}