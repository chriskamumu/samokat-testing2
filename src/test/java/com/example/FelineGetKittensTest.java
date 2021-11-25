package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {
    private final int kittensCount;
    private final int expected;

    public FelineGetKittensTest(int kittensCount, int expected){
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getKittensData(){
        return Arrays.asList(new Object[][] {
                { 0, 0 },
                { -1, -1 },
                { 2, 2 }
        });
    }

    @Test
    public void testGetKittens(){
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }
}
