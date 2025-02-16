package calcs.simple;

import calcs.api.ICalculator;

//4
public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /**
     * степень
     *
     * @param pow1
     * @param pow2
     * @return
     */
    public double pow(double pow1, int pow2) {
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
        double module = Math.abs(module1);
        return module;
    }

}
