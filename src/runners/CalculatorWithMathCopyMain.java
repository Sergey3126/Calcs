package runners;
import calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        double plus1 = 4.1;
        double multiplication1 = 15;
        double multiplication2 = 7;
        double division1 = 28;
        double division2 = 5;

        double result = calc2.sum(plus1, calc2.sum(calc2.multiplication(multiplication1, multiplication2), calc2.pow(calc2.division(division1, division2), 2)));
        System.out.println(result);
    }
}
