package HomeWork3.Calcs.additional;

import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long count = 0;

    public void incrCountOperation(){
        count++;
    }


    public long getCountOperation(){
        return count;
    }


    public double summ(double a, double b){
        incrCountOperation();
        return super.summ(a, b);
    }


    public double minus(double a, double b){
        incrCountOperation();
        return super.minus(a, b);
    }


    public double multiplication(double a, double b){
        incrCountOperation();
        return super.multiplication(a, b);
    }


    public double divide(double a, double b){
        incrCountOperation();
        return super.divide(a, b);
    }


    public double modul(double a){
        incrCountOperation();
        return super.modul(a);
    }


    public double sqrt(double a){
        incrCountOperation();
        return super.sqrt(a);
    }

    public double degree(double a, int c){
        incrCountOperation();
        return super.degree(a, c);
    }
}
