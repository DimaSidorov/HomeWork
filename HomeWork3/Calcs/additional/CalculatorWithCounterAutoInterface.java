package HomeWork3.Calcs.additional;

import HomeWork3.Calcs.ICalculator;

public class CalculatorWithCounterAutoInterface {

    private long count =0;

    private final ICalculator calc1;

    public CalculatorWithCounterAutoInterface(ICalculator calc){
        this.calc1 = calc;

    }

    public void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return  count;
    }

    public double summ (double a, double b){
        this.incrementCountOperation();
            return this.calc1.summ(a, b);
    }

    public double minus (double a, double b){
        this.incrementCountOperation();
            return this.calc1.minus(a, b);
    }

    public double multiplication (double a, double b){
        this.incrementCountOperation();
            return this.calc1.multiplication(a, b);
    }

    public double divide (double a, double b){
        this.incrementCountOperation();
            return this.calc1.divide(a, b);
    }

    public double modul(double a){
        this.incrementCountOperation();
            return this.calc1.modul(a);
    }

    public double sqrt(double a){
        this.incrementCountOperation();
            return this.calc1.sqrt(a);
    }

    public double degree (double a, int b){
        this.incrementCountOperation();
            return this.calc1.degree(a, b);
    }
}
