package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

public class LionAlexTest {

    private Feline feline;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        feline = Mockito.mock(Feline.class);
    }

    @Test
    public void testGetFriends() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = lionAlex.getFriends();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expected = "Зоопарк В Центральном парке, город Нью-Йорк";
        String actual = lionAlex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetKittensReturnZero() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        int expected = 0;
        int actual = lionAlex.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void testDoesHaveManeReturnTrue() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        boolean actual = lionAlex.doesHaveMane();
        assertTrue(actual);
    }
}