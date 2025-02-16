package runners;

import calcs.additional.CalculatorWithCounterAutoAgregation;
import calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import calcs.simple.CalculatorWithMathCopy;
import calcs.simple.CalculatorWithMathExtends;
import calcs.simple.CalculatorWithOperator;

//9
public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        double plus1 = 4.1;
        double multiplication1 = 15;
        double multiplication2 = 7;
        double division1 = 28;
        double division2 = 5;
        double result;

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calc1 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithOperator);

       result = calc1.sum(plus1, calc1.sum(calc1.multiplication(multiplication1, multiplication2), calc1.pow(calc1.division(division1, division2), 2)));
        System.out.println(result);
        System.out.println(calc1.getCountOperation());


        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calc2 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathCopy);

         result = calc2.sum(plus1, calc2.sum(calc2.multiplication(multiplication1, multiplication2), calc2.pow(calc2.division(division1, division2), 2)));
         System.out.println(result);
        System.out.println(calc2.getCountOperation());

            CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calc3 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathExtends);

        result = calc3.sum(plus1, calc3.sum(calc3.multiplication(multiplication1, multiplication2), calc3.pow(calc3.division(division1, division2), 2)));
        System.out.println(result);
        System.out.println(calc3.getCountOperation());
    }
 }


