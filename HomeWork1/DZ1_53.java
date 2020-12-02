package HomeWork1;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class DZ1_53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите ваше имя: 1.Вася\n 2.Анастасия\n Другое имя");
        int name = in.nextInt();
        String privet =getName(name);
    }

    private static String getName(int name) {
        switch (name){
            case 1:
                    System.out.println("Привет!\n Я тебя так долго ждал");
                    break;
            case 2:
                    System.out.println("Я тебя так долго ждал");
                    break;
            case 3:
                    System.out.println("Добрый день, а вы кто?");
                    break;
        }
        return "Выберите предложенный вариант";
    }
}