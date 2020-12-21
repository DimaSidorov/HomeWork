package HomeWork2.loops;

public class Loops4 {
    public static long num;
    public static void main(String[] args) {
        System.out.println("Первое число после переполнения = " +calculation(3));
        System.out.println("Первое число после переполнения = " +calculation(119));
        System.out.println("Первое число после переполнения = " +calculation(-19));
    }
        public static long calculation(long num){

        long result = 1;
        int i = 1;
        if (num > 0) {
            for (i = 1; i <= result; i++) {
                result *= num;
            }
            long[] container = new long[i];
            result = 1;
            for (i = 1; i <= result; i++) {
                result *= num;
                container[i - 1] = result;
            }
            System.out.println("Последнее число перед переполнением =" +container[i - 3]);
            return result;
        }
        if (num<0){
            int imax = 1;
            for (imax = 1; imax <= result; imax++) {
                result *= Math.abs(num);
            }
            long[] container = new long[imax];
            for (i = 1; i <= imax; i++) {
                result *= num;
                container[i-1] = result;
                }
            System.out.println("Последнее число перед переполнением =" +container[i-3]);
            return result;
            }
    return result;
    }

}
