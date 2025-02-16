package calcs.additional;

import calcs.simple.CalculatorWithMathExtends;

//6
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
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

    /**
     * сложение
     *
     * @param plus1
     * @param plus2
     * @return
     */
    public double sum(double plus1, double plus2) {
        incrementCountOperation();
        return super.sum(plus1, plus2);
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
        return super.subtraction(minus1, minus2);
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
        return super.division(division1, division2);
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
        return super.multiplication(multiplication1, multiplication2);
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
        return super.pow(pow1, pow2);
    }

    /**
     * модуль
     *
     * @param module1
     * @return
     */
    public double module(double module1) {
        incrementCountOperation();
        return super.module(module1);
    }

    /**
     * корень
     *
     * @param sqrt1
     * @return
     */
    public double sqrt(double sqrt1) {
        incrementCountOperation();
        return super.sqrt(sqrt1);
    }


}
