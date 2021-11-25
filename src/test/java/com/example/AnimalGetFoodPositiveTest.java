package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodPositiveTest {

    private final String animalKind;
    private final List<String> expected;

    public AnimalGetFoodPositiveTest(String animalKind, List<String> expected){
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][] {
                { "Травоядное", List.of("Трава", "Различные растения") },
                { "Хищник", List.of("Животные", "Птицы", "Рыба") },
        });
    }

    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        assertEquals(expected, actual);
    }
}
