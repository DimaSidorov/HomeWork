package HomeWork1;

import java.util.Scanner;

public class DZ1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя:");
        String name = in.next();
        boolean n1= name.equals("Вася");
        boolean n2= name.equals("Анастасия");
        if (n1) {
            System.out.println("Привет!\n Я тебя так долго ждал");
        }
        if (n2) {
            System.out.println("Я тебя так долго ждал");
        } if (!n1&&!n2){
            System.out.println("Добрый день, а вы кто?");
        }
    }
}