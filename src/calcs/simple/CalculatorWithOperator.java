package simple;

public class CalculatorWithOperator {
    /**
     * вычитание
     *
     * @param minus1
     * @param minus2
     * @return
     */
    public double  subtraction(double minus1, double minus2) {
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
    public double sum (double plus1, double plus2) {
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
        double result = pow1;
        if (pow1 >= 0 && pow2 != 0) {
            for (int i = 0; i < pow2 - 1; i++) {
                result = result * pow1;
            }
        } else if (pow2 == 0) {
            result = 1;
        } else System.out.println("Не верный ввод");
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
    public double module(int module1) {
        if (module1 < 0) {
            module1 = module1 * -1;
        }
        return module1;
    }
}
