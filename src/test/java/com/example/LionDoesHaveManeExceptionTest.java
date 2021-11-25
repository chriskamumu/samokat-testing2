package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class LionDoesHaveManeExceptionTest {

    private Feline feline;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        feline = Mockito.mock(Feline.class);
    }

    @Test
    public void testDoesHaveManeInvalidSexReturnException() throws Exception {
        String sex = "Котик";
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        try {
            Lion lion = new Lion(sex, feline);
        } catch (Exception exception) {
            assertEquals(expected, exception.getMessage());
        }
    }
}
