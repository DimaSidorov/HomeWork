package HomeWork2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays2_3 {
    public static void main(String[] args) {
        int size = 0;
        int maxValueExclusion = 0;

        Scanner scanner = new Scanner(System.in);

        while (size < 1) {
            System.out.println("Введите количество элементов в массиве");
            size = scanner.nextInt();
        }

        while (maxValueExclusion < 1) {
            System.out.println("Введите максимальное число, до которого будут генерироваться числа");
            maxValueExclusion = scanner.nextInt();
        }

        int [] container = arrayRandom(size, maxValueExclusion);

        System.out.println("Сгенерированный массив - [" + Arrays.toString(container) +"]");

    }

        public static int[] arrayRandom(int size, int maxValueExclusion){
            Random Random = new Random();

            int[] container1 = new int[size];

            for (int i = 0; i < size; i++) {
                container1[i] = Random.nextInt(maxValueExclusion);
            }
            return container1;
            }
        }

