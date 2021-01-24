package HomeWork3.Calcs.additional;

import HomeWork3.Calcs.ICalculator;
import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends implements ICalculator {

    private long count = 0;

    private final CalculatorWithMathExtends calc;

    public CalculatorWithCounterClassic (CalculatorWithMathExtends calc){
        this.calc = calc;

    }

    public void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return  count;
    }

    public double summ (double a, double b){
        this.incrementCountOperation();
            return this.calc.summ(a, b);
        }


    public double minus (double a, double b){
        this.incrementCountOperation();
            return this.calc.minus(a, b);
        }


    public double multiplication (double a, double b){
        this.incrementCountOperation();
            return this.calc.multiplication(a, b);
        }


    public double divide (double a, double b){
        this.incrementCountOperation();
            return this.calc.divide(a, b);
        }


    public double modul(double a){
        this.incrementCountOperation();
            return this.calc.modul(a);
        }


    public double sqrt(double a){
        this.incrementCountOperation();
            return this.calc.sqrt(a);
        }


    public double degree (double a, int b){
        this.incrementCountOperation();
            return this.calc.degree(a, b);
        }
    }
