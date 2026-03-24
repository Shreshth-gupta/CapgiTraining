package com.cg;

public class CalculatorService {
    private ICalculate cal;

    public CalculatorService() {
    }

    public CalculatorService(ICalculate cal){
        this.cal=cal;
    }
    public int addService(int x,int y){
        return cal.calculate(x,y);
    }
}
