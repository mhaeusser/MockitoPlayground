package de.mhaeusser.mockito;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc = null;

    @Before
    public void setup() {
        calc = new Calculator(new CalculatorService() {
            @Override
            public int add(int i, int j) {
                return i+j;
            }
        });
    }

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }
}
