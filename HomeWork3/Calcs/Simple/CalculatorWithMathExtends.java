package HomeWork3.Calcs.Simple;

import HomeWork3.Calcs.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /**
     *
     * @param a число
     * @return  модуль переданного числа
     */
    public double modul(double a){
        return Math.abs(a);
    }

    /**
     *
     * @param a число
     * @return  корень переданного числа
     */
    public  double sqrt(double a){
        return Math.sqrt(a);
    }

    /**
     *
     * @param a число возводимое в степень, положительное, дробное
     * @param c степень в которую возводится число, положительная
     * @return  число а возведенное в степень с
     */
    public double degree(double a, int c){
        if (a < 0 || c < 0){
            System.out.println( "число < 0 или степень < 0 ");
            return 0;
        } else if(c == 0){
            return 1;
        }
        double result = Math.pow(a, c);
        return result;

    }
}
