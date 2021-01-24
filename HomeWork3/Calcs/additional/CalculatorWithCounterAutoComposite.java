package HomeWork3.Calcs.additional;

import HomeWork3.Calcs.Simple.CalculatorWithMathCopy;
import HomeWork3.Calcs.Simple.CalculatorWithMathExtends;
import HomeWork3.Calcs.Simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private long count =0;

    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathExtends calc2;
    private final CalculatorWithMathCopy calc3;

    public CalculatorWithCounterAutoComposite (CalculatorWithOperator calc){
        this.calc1 = calc;
        this.calc2 = null;
        this.calc3 = null;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathExtends calc){
        this.calc1 = null;
        this.calc2 = calc;
        this.calc3 = null;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathCopy calc){
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = calc;
    }

    public void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return  count;
    }

    public double summ (double a, double b){
        this.incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.summ(a, b);
        } else if(this.calc2 != null){
            return this.calc2.summ(a, b);
        } else {
            return this.calc3.summ(a, b);
        }
    }

    public double minus (double a, double b){
        this.incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.minus(a, b);
        } else if(this.calc2 != null){
            return this.calc2.minus(a, b);
        } else {
            return this.calc3.minus(a, b);
        }
    }

    public double multiplication (double a, double b){
        this.incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.multiplication(a, b);
        } else if(this.calc2 != null){
            return this.calc2.multiplication(a, b);
        } else {
            return this.calc3.multiplication(a, b);
        }
    }

    public double divide (double a, double b){
        this.incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.divide(a, b);
        } else if(this.calc2 != null){
            return this.calc2.divide(a, b);
        } else {
            return this.calc3.divide(a, b);
        }
    }

    public double modul(double a){
        this.incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.modul(a);
        } else if(this.calc2 != null){
            return this.calc2.modul(a);
        } else {
            return this.calc3.modul(a);
        }
    }

    public double sqrt(double a){
        this.incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.sqrt(a);
        } else if(this.calc2 != null){
            return this.calc2.sqrt(a);
        } else {
            return this.calc3.sqrt(a);
        }
    }

    public double degree (double a, int b){
        this.incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.degree(a, b);
        } else if(this.calc2 != null){
            return this.calc2.degree(a, b);
        } else {
            return this.calc3.degree(a, b);
        }
    }
}
