package HomeWork2.sorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static HomeWork2.sorts.Methods.SortsMethod.bubbleSorts;
import static HomeWork2.sorts.Methods.SortsMethod.shakerSorts;

public class Sorts4_Data {
    public static void main(String[] args) {

        Random Random = new Random();
        Scanner scanner = new Scanner(System.in);

        byte arrayCreate = 0;
        byte arrayMethod = 0;
        int size =0;

        do {
            System.out.println("Выберите метод ввода данных:");
            System.out.println("1 - Предварительно созданные массивы");
            System.out.println("2 - Генерация случайного массива");
            System.out.println("3 - Создание массива через консоль");
            arrayCreate = scanner.nextByte();
        } while(arrayCreate < 1 || arrayCreate > 3);

        switch (arrayCreate) {
            case 1:
                do{
                    System.out.println("Выберите метод сортировки:");
                    System.out.println("1 - Пузырьковая сортировка:");
                    System.out.println("2 - Шейкерная сортировка:");
                    arrayMethod = scanner.nextByte();
                } while (arrayMethod < 1 || arrayMethod > 2);

                int[] con1 = {1, 2, 3, 4, 5, 6,};

                if (arrayMethod == 1) {
                    System.out.println(Arrays.toString(con1) + "-> " + Arrays.toString(bubbleSorts(con1)));
                }
                if(arrayMethod == 2){
                    System.out.println(Arrays.toString(con1) + "-> " + Arrays.toString(shakerSorts(con1)));
                }

                int[] con2 = {1,1,1,1};

                if (arrayMethod == 1) {
                    System.out.println(Arrays.toString(con2) + "-> " + Arrays.toString(bubbleSorts(con2)));
                 }
                if(arrayMethod == 2){
                    System.out.println(Arrays.toString(con2) + "-> " + Arrays.toString(shakerSorts(con2)));
                }

                int[] con3 = {9,1,5,99,9,9};

                if (arrayMethod == 1) {
                    System.out.println(Arrays.toString(con3) + "-> " + Arrays.toString(bubbleSorts(con3)));
                }
                if(arrayMethod == 2){
                    System.out.println(Arrays.toString(con3) + "-> " + Arrays.toString(shakerSorts(con3)));
                }

                int[] con4 = {};

                if (arrayMethod == 1) {
                    System.out.println(Arrays.toString(con4) + "-> " + Arrays.toString(bubbleSorts(con4)));
                }
                if(arrayMethod == 2){
                    System.out.println(Arrays.toString(con4) + "-> " + Arrays.toString(shakerSorts(con4)));
                }
                break;

            case 2:
                do{
                    System.out.println("Введите максимальное случайное число элементов в массиве");
                    size = scanner.nextInt();
                } while (size < 1);

                System.out.println("Введите нижнюю границу генерации чисел");
                int arrayMin = scanner.nextInt();

                System.out.println("Введите верхнюю границу генерации чисел");
                int arrayMax = scanner.nextInt();
                int arraySize = Random.nextInt(size)+1;
                int[] container1 = new int[arraySize];

                for (int i = 0; i < container1.length; i++){
                    container1[i] =(int) (Math.random()*(arrayMax-arrayMin)+arrayMin)+1;
                }
                do{
                    System.out.println("Выберите метод сортировки:");
                    System.out.println("1 - Пузырьковая сортировка:");
                    System.out.println("2 - Шейкерная сортировка:");
                    arrayMethod = scanner.nextByte();
                } while (arrayMethod < 1 || arrayMethod > 2);

                if (arrayMethod == 1) {
                    System.out.println(Arrays.toString(container1) + "-> " + Arrays.toString(bubbleSorts(container1)));
                }
                if(arrayMethod == 2){
                    System.out.println(Arrays.toString(container1) + "-> " + Arrays.toString(shakerSorts(container1)));
                }
                break;
            case 3:
                do {
                    System.out.println("Введите количество элементов в массиве");
                    size = scanner.nextInt();
                }while (size < 1);

                int[] container2 = new int[size];

                for (int i =0; i <container2.length; i++){
                    System.out.println("Введите " + (i+1) +"-й элемент массива");
                    container2[i] = scanner.nextInt();
                }

                do{
                    System.out.println("Выберите метод сортировки:");
                    System.out.println("1 - Пузырьковая сортировка:");
                    System.out.println("2 - Шейкерная сортировка:");
                    arrayMethod = scanner.nextByte();
                } while (arrayMethod < 1 || arrayMethod > 2);

                if (arrayMethod == 1) {
                    System.out.println(Arrays.toString(container2) + "-> " + Arrays.toString(bubbleSorts(container2)));
                }
                if(arrayMethod == 2){
                    System.out.println(Arrays.toString(container2) + "-> " + Arrays.toString(shakerSorts(container2)));
                }
                break;
        }
    }
}


