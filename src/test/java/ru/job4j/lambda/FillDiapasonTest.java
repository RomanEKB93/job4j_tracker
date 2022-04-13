package ru.job4j.lambda;

import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import java.util.Arrays;
import java.util.List;

public class FillDiapasonTest {
    @Test
    public void whenLinearFunction() {
        List<Double> result = FillDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        List<Double> result = FillDiapason.diapason(0, 6, x -> x * x + x + 1);
        List<Double> expected = Arrays.asList(1D, 3D, 7D, 13D, 21D, 31D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunction() {
        List<Double> result = FillDiapason.diapason(3, 7, x -> Math.pow(4, x));
        List<Double> expected = Arrays.asList(64D, 256D, 1024D, 4096D);
        assertThat(result, is(expected));
    }
}