package de.mhaeusser.mockito;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class Calculator1Test {

    Calculator calc = null;

    CalculatorService service = Mockito.mock(CalculatorService.class);

    @Before
    public void setup() {
        calc = new Calculator(service);
    }

    @Test
    public void testAdd() {
        when(service.add(2, 3)).thenReturn(5);
        assertEquals(5, calc.add(2, 3));
        verify(service).add(2, 3);
    }
}
