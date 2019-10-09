package de.mhaeusser.mockito;

public class Calculator {

    CalculatorService service;

    Calculator(CalculatorService service) {
        this.service = service;
    }


    public int add(int i, int j) {
        return service.add(i, j);
    }
}
