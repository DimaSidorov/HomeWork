package HomeWork3;

import HomeWork3.Calcs.Simple.CalculatorWithMathCopy;
import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;
import HomeWork3.Calcs.Simple.CalculatorWithOperator;
import HomeWork3.Calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic(new CalculatorWithMathExtends());
        double a = calc.summ(4.1, calc.summ(calc.multiplication(15, 7), calc.degree(calc.divide(28.0, 5),2 ) ));
        System.out.println("4.1 + 15 * 7 + (28.0/5)^2 =" + a);
        System.out.println(calc.getCountOperation());
    }
}
