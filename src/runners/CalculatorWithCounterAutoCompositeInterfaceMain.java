package runners;

import calcs.additional.CalculatorWithCounterAutoAgregation;
import calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import calcs.api.ICalculator;
import calcs.simple.CalculatorWithMathCopy;


public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        ICalculator calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calc= new CalculatorWithCounterAutoAgregationInterface(calculatorWithMathCopy);
        double plus1 = 4.1;
        double multiplication1 = 15;
        double multiplication2 = 7;
        double division1 = 28;
        double division2 = 5;

        double result = calc.sum(plus1, calc.sum(calc.multiplication(multiplication1, multiplication2), calc.pow(calc.division(division1, division2), 2)));
        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}

