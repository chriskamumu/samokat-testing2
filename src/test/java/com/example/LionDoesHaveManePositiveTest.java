package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManePositiveTest {
  private final String sex;
  private final boolean expected;

  private Feline feline;


    public LionDoesHaveManePositiveTest(String sex, boolean expected){
      this.sex = sex;
      this.expected = expected;
  }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        feline = Mockito.mock(Feline.class);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getDoesHaveManeData(){
        return Arrays.asList(new Object[][] {
                { "Самка", false },
                { "Самец", true }
        });
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }


}
