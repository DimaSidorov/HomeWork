package HomeWork2.loops;

public class Loops2 {
    public static void main(String[] args) {
        System.out.println(" = " + factorial("1234.456"));
    }

    /**
     * @param number число цифры которого перемножаются
     * @return произведение цифр переданного числа
     */
    public static String factorial(String number) {
        try {
            double x = Double.parseDouble(number);

            if (x % 1 > 0) {
                return "Введено не целое число";
            } else if (x % 1 == 0) {
                long result = 1;
                long i = 1;
                int count = 0;
                while (x >= 1) {
                    count++;
                    x /= 10;
                }
                long y = Long.parseLong(number);
                int ten = 10;

                while (count > 0) {
                    i = y / ((int) (Math.pow(10, count - 1)));
                    y = y % ((int) (Math.pow(10, count - 1)));
                    count--;
                    System.out.print(i);
                    if (count > 0) {
                        System.out.print("*");
                    }
                    result = result * i;
                }
                return "" + result;

            }
        return "";
    }
       catch (NumberFormatException e){
            return "Введено не число";
        }

    }
}
