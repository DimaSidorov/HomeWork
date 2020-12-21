package HomeWork2.loops;

public class Loops1_1 {
    public static void main(String[] args) {
        System.out.println(" = " + factorial("10"));
    }

    /**
     * @param number число до которого считается факториал
     * @return значение факториала
     */
    public static String factorial(String number) {
        long x = Long.parseLong(number);
        long result = 1;
        if(x<0){
            return "Вы ввели отрицательное число, вычеслить факториал отрицательного числа невозможно";
        }
        if (x == 0){
            return "Вы ввели 0, для вычесления факториала число должно быть больше 1";
        }
        for (int i = 1; i <= x; i++) {
            System.out.print(i);
            if (i < x) {
                System.out.print("*");
            }
            result = result * i;
        }
        return "" +result;
    }
}
