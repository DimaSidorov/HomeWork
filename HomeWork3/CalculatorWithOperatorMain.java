package HomeWork3;

import HomeWork3.Calcs.Simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {

    public static void main(String[] args) {

        CalculatorWithOperator calc = new CalculatorWithOperator();
        double a = calc.summ(4.1, calc.summ(calc.multiplication(15, 7), calc.degree(calc.divide(28.0, 5),2 ) ));
        System.out.println("4.1 + 15 * 7 + (28.0/5)^2 =" + a);
    }
}
