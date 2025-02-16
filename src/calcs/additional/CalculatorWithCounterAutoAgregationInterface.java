package calcs.additional;

import calcs.api.ICalculator;
import calcs.simple.CalculatorWithMathCopy;

//11
public class CalculatorWithCounterAutoAgregationInterface {
    /**
     * кол-во операций
     */
    private long countOperation;

    /**
     * увеличивает кол-во операций
     */
    public void incrementCountOperation() {
        countOperation++;
    }

    /**
     * выводит кол-во операций
     *
     * @return
     */
    public long getCountOperation() {
        return countOperation;
    }
    private final ICalculator calc;
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc) {
        this.calc = calc;
    }
    /**
     * вычитание
     *
     * @param minus1
     * @param minus2
     * @return
     */
    public double subtraction(double minus1, double minus2) {
        incrementCountOperation();
        double result = minus1 - minus2;
        return result;
    }

    /**
     * сложение
     *
     * @param plus1
     * @param plus2
     * @return
     */
    public double sum(double plus1, double plus2) {
        incrementCountOperation();
        double plus = plus1 + plus2;
        return plus;
    }

    /**
     * деление
     *
     * @param division1
     * @param division2
     * @return
     */
    public double division(double division1, double division2) {
        incrementCountOperation();
        double result = 0;
        if (division2 != 0) {
            result = division1 / division2;
        }
        return result;
    }

    /**
     * умножение
     *
     * @param multiplication1
     * @param multiplication2
     * @return
     */
    public double multiplication(double multiplication1, double multiplication2) {
        incrementCountOperation();
        double result = multiplication1 * multiplication2;
        return result;
    }

    /**
     * степень
     *
     * @param pow1
     * @param pow2
     * @return
     */
    public double pow(double pow1, int pow2) {
        incrementCountOperation();
        double result = Math.pow(pow1, pow2);
        return result;
    }

    /**
     * корень
     *
     * @param sqrt1
     * @return
     */
    public double sqrt(double sqrt1) {
        incrementCountOperation();
        double result = 0;
        if (sqrt1 > 0) {
            result = Math.sqrt(sqrt1);
        }
        return result;
    }

    /**
     * модуль
     *
     * @param module1
     * @return
     */
    public double module(double module1) {
        incrementCountOperation();
        double module = Math.abs(module1);
        return module;
    }

}
