package runners;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        double plus1 = 4.1;
        double multiplication1 = 15;
        double multiplication2 = 7;
        double division1 = 28;
        double division2 = 5;

        double result = calc3.sum(plus1, calc3.sum(calc3.multiplication(multiplication1, multiplication2), calc3.pow(calc3.division(division1, division2), 2)));
        System.out.println(result);
    }
}