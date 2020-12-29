package HomeWork2.loops;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        double result = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое хотите возвести в степень");

        double number = in.nextDouble();

        System.out.println("Введите число, в какую степень будете возводить");

        int num2 = in.nextInt();

        if(num2 < 0){
            System.out.println("Введена отрицательная степень, степень не может быть отрицательной");
            return;
        }
        for(int i = 1; i < num2; i++){
            result *= number;
        }
        System.out.println(number + " ^ " + num2 +" = " + result);
    }
}
