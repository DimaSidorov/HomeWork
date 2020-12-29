package HomeWork2.loops;

public class Loops1_5 {
    public static void main(String[] args) {

        multiplicationTable(2, 6 );
        System.out.println();
        multiplicationTable(6, 10);
    }
     public static void multiplicationTable(int from, int to){
        for(int i = 1; i<10; i++) {
            System.out.println();
            for (int j = from; j < to; j++) {
                System.out.print(j + " x " + i + "= " + (j * i) + "\t");
            }
        }
    }
}
