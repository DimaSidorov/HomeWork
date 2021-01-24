package HomeWork3;

import HomeWork3.Calcs.Simple.CalculatorWithMathCopy;
import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;
import HomeWork3.Calcs.Simple.CalculatorWithOperator;
import HomeWork3.Calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.Calcs.additional.CalculatorWithCounterAutoInterface;

public class CalculatorWithCounterAutoInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoInterface calc1 = new CalculatorWithCounterAutoInterface(new CalculatorWithOperator());
        double a = calc1.summ(4.1, calc1.summ(calc1.multiplication(15, 7), calc1.degree(calc1.divide(28.0, 5),2 ) ));
        System.out.println("4.1 + 15 * 7 + (28.0/5)^2 =" + a);
        System.out.println(calc1.getCountOperation());

        CalculatorWithCounterAutoInterface calc2 = new CalculatorWithCounterAutoInterface(new CalculatorWithMathCopy());
        double b = calc2.summ(4.1, calc2.summ(calc2.multiplication(15, 7), calc2.degree(calc2.divide(28.0, 5),2 ) ));
        System.out.println("4.1 + 15 * 7 + (28.0/5)^2 =" + b);
        System.out.println(calc2.getCountOperation());

        CalculatorWithCounterAutoInterface calc3 = new CalculatorWithCounterAutoInterface(new CalculatorWithMathExtends());
        double c = calc3.summ(4.1, calc3.summ(calc3.multiplication(15, 7), calc3.degree(calc3.divide(28.0, 5),2 ) ));
        System.out.println("4.1 + 15 * 7 + (28.0/5)^2 =" + c);
        System.out.println(calc3.getCountOperation());
    }
}
