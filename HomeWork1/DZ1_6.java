package HomeWork1;

import java.util.Scanner;

public class DZ1_6 {
    static int[] phone = new int[10];
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите 10-ти значный номер телефона:");
            int number = in.nextInt();
            int j = 0;
            int x = 1000000000;
            for (j = 0; j < 9; j++ ){
                phone[j] = number/x;
                number = number%x;
                x /= 10;
            }
            String phoneNumber = createPhoneNumber();
        }

        public static String createPhoneNumber() {
            int i = 0;
            System.out.print("(");
            for (i = 0; i < 3; i++ ){
                System.out.print(phone[i]);
            }
            System.out.print(")");
            for (i = 3; i < 6; i++ ) {
                System.out.print(phone[i]);
            }
            System.out.print("-");
            for (i = 6; i < 9; i++ ) {
                System.out.print(phone[i]);
            }
        return null;
        }
}
