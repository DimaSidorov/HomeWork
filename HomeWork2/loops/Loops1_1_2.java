package HomeWork2.loops;

public class Loops1_1_2 {

    public static long result = 1;
    public static long i = 1;
    public static void main(String[] args) {
        System.out.println(" = " + factorial("0"));
    }

    /**
     * @param number число до которого считается факториал
     * @return значение факториала
     */
    public static String factorial(String number) {
        long x = Long.parseLong(number);

        if(x<0){
            return "Вы ввели отрицательное число, вычеслить факториал отрицательного числа невозможно";
        }
        if (x == 0){
            return "Вы ввели 0, для вычесления факториала число должно быть больше 1";
        }
        if(i <= x) {
            System.out.print(i);
            if (i < x) {
                System.out.print("*");
            }
            result = result * i;
            i++;
            return factorial(number);

        }
        return "" +result;
    }
}
