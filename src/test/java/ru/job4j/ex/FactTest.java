package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenArgumentLessThenZero() {
        Fact calculator = new Fact();
        calculator.calc(-10);
    }

    @Test
    public void when7Then5040() {
        Fact calculator = new Fact();
        int in = 7;
        int expected = 5040;
        int out = calculator.calc(in);
        assertEquals(expected, out);
    }

}