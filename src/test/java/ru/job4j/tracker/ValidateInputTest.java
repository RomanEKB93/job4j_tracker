package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"5"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(5));
    }

    @Test
    public void whenMultipleValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        input.askInt("Enter menu:");
        input.askInt("Enter menu:");
        input.askInt("Enter menu:");
        int selected = input.askInt("Enter menu:");
        int expected = 3;
        assertEquals(expected, selected);
    }

    @Test
    public void whenNegativeNumberInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        int expected = -1;
        assertEquals(expected, selected);
    }
}