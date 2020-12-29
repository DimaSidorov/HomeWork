package HomeWork2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов в массиве");
        int size = scanner.nextInt();

        System.out.println("Введите число от которого будут генерироваться числа");
        int min = scanner.nextInt();

        System.out.println("Введите число до которого будут генерироваться числа");
        int max = scanner.nextInt();

        int[] container = arrayRandom(size, min, max);

        System.out.println("Сгенерированный массив - [" + Arrays.toString(container));
        System.out.println("Сумма четных положительных элементов массива - "+ arraySumPositiveEvenElements(container));
        System.out.println("Максимальный элемент массива с четными индексами - "+ arrayMaxPositiveEvenElements(container));
        System.out.println("Элементы массива, которые меньше среднего арифметического - " + Arrays.toString(arrayLessThanAverage(container)));
        System.out.println("Два наименьших элемента массива - " + Arrays.toString(arrayTwoMinNumbers(container, max)));
        System.out.println("Элементы массива за исключение элементов, находящихся в диапазоне - " + Arrays.toString(arrayWithoutNumbersInRange(container)));
        System.out.println("Сумма всех цифр массива - " + (arraySumAllDigits(container)));

    }

    /**
     *
     * @param size количество элементов в массиве
     * @param min  число от которого генерируются числа
     * @param max число до которого генерировуются числа
     * @return  возвращает сгенерированный массив чисел
     */

    public static int[] arrayRandom(int size, int min, int max) {

        int[] container1 = new int[size];

        for(int i = 0; i < size; i++){
            container1[i] =(int) (Math.random()*(max-min)+min)+1;
        }
        return container1;
    }

    /**
     *
     * @param cont массив чисел
     * @return  сумма четных положительных чисел массива
     */

    public static int arraySumPositiveEvenElements(int[] cont) {

        int sum = 0;

        for (int i = 1; i < cont.length;) {
            if (cont[i] > 0){
                sum += cont[i];
                i +=2;
            }
            i += 2;
        }
        return sum;
    }

    /**
     *
     * @param cont массив чисел
     * @return  максимальное положительное число массива с четным индексом
     */

    public static int arrayMaxPositiveEvenElements(int[] cont) {

        int maxElement = 0;

        for (int i = 0; i < cont.length; i++) {
            if (cont[i] > maxElement && i % 2 == 0){
                maxElement = cont[i];
            }
        }
        return maxElement;
    }

    /**
     *
     * @param contaner1 массив чисел
     * @return  массив чисел, меньших чем среднее арифметическое переданного массива
     */

    public static int[] arrayLessThanAverage(int[] contaner1){

        int sum = 0;
        int average;

        for (int k:contaner1){
            sum += k;
        }
        average = sum/contaner1.length;

        int[] cont1 = new int[contaner1.length];
        int j = 0;

        for(int i =0; i < contaner1.length; i++){
            if(contaner1[i] < average){
                cont1[j] = contaner1[i];
                j++;
            }
        }

        int[] cont2 = Arrays.copyOf(cont1, j);

        return cont2;
    }

    /**
     *
     * @param contaner1 массив чисел
     * @return  возвращает два наименьших элемента массива
     */

    public static int[] arrayTwoMinNumbers(int[] contaner1, int max){

        int[] cont = new int[2];
        cont[0] =  cont[1] = max;

        for (int i = 0; i < contaner1.length; i++) {
            if (contaner1[i] < cont[0]) {
                cont[0] = contaner1[i];
            }
        }

        for (int i = 0; i < contaner1.length; i++) {
            if (contaner1[i] < cont[1] && contaner1[i] != cont[0]) {
                cont[1] = contaner1[i];
                }
            }
        return cont;
    }

    /**
     *
     * @param contaner1 массив чисел
     * @return массив чисел без элементов в введенном диапазоне
     */

    public static int[] arrayWithoutNumbersInRange(int[] contaner1){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите нижнюю границу диапазона, в котором будут удалятся элементы");
        int minRange = scanner.nextInt();

        System.out.println("Введите верхнюю границу диапазона, в котором будут удалятся элементы");
        int maxRange = scanner.nextInt();

        int[] cont = new int[contaner1.length];
        int j = 0;

        for (int i = 0; i < contaner1.length; i++){
            if(contaner1[i] < minRange || contaner1[i] > maxRange){
                cont[j] = contaner1[i];
                j++;
            }
        }

        int[] cont1 = Arrays.copyOf(cont, j);

        return cont1;
    }

    /**
     *
     * @param contaner1 массив чисел
     * @return сумму всех цифр массива
     */

    public static int arraySumAllDigits(int[] contaner1){

        int sum = 0;

        for(int i = 0; i < contaner1.length; i++) {
            int j = 1;
            int element = Math.abs(contaner1[i]);
            do {
                sum += element % 10 * j;
                element = element - element%10*j;
                j *= 10;
            } while(j/10 > contaner1[i]);
        }
    return sum;
    }

}
