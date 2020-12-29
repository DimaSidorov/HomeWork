package HomeWork1;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class DZ1_53 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("ВВедите ваше имя:");

        String name = in.next();
            switch (name) {
                case "Витя":
                    System.out.println("Привет!\n Я тебя так долго ждал");
                    break;

                case "Анастасия":
                    System.out.println("Я тебя так долго ждал");
                    break;

                default:
                    System.out.println("Добрый день, а вы кто?");
            }
    }
}