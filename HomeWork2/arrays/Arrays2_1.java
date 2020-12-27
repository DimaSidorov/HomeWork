package HomeWork2.arrays;

import java.util.Scanner;

public class Arrays2_1 {
    public static void main(String[] args) {
        int container[] = arrayFromConsole();
        printArrayToConsole(container);
        prinArrayToConsoleSecondElements(container);
        printExArrayToConsole(container);
    }
    public static int[] arrayFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int arraycount = scanner.nextInt();
        if (arraycount <1){
            return arrayFromConsole();
        }
        int[] container1 = new int[arraycount];
        for(int i = 0; i < arraycount; i++){
            System.out.println("Введите " + (i+1) + "-й элемент массива");
            container1[i] = scanner.nextInt();
        }
    return container1;
    }

    public static void printArrayToConsole(int[] container){
        int i1 = 1;
        if(container.length > 1) {
            System.out.print("Полученный массив [");
            do {
                System.out.print(container[i1 - 1] + ", ");
                i1++;
            } while (i1 < (container.length));
            System.out.println(container[i1 - 1] + " ]");
        } else{
            System.out.println("Полученный массив [" + container[0] + "]");
        }
    }

    public static void prinArrayToConsoleSecondElements(int[] container){
        if(container.length == 1){
            System.out.println("В данном массиве нету второго элемента");
        return;
        }
        System.out.print("Каждый второй элемент массива - [" );
        for (int i = 1; i < container.length; ){
            if (i+2 < container.length){
                System.out.print(container[i+1]+", ");
                i += 2;
            } else {
                System.out.println(container[i]+ "]");
                return;
            }
            }
        }

    public static void printExArrayToConsole(int[] container){
        int i = container.length;
        System.out.print("Элементы массива в обратном порядке - [");
        while (i > 1) {
                System.out.print(container[i-1] + ", ");
                i--;
            }
        System.out.println(container[0]+"]");
        }
    }

