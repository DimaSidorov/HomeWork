package HomeWork1;

public class Dz1_1 {
    public static void main(String[] args) {

        byte a = 42;     // 00101010
        byte b = 15;     // 00001111
        byte c = -42;    // 11010110
        byte d = -15;    // 11110001

        int or1 = a|b;   /* 00101010
                           00001111
                           00101111 - соответствует числу 47*/
        int or2 = c|d;   /* 11010110
                           11110001
                           11110111 - соответствует числу -9 */
        int and1 =a&b;    /*00101010
                            00001111
                            00001010 -соответствует числу 10*/
        int and2 =c&d;     /*11010110
                             11110001
                             11010000 -соответствует числу -48*/

        int xor1 =a^b;    /*00101010
                            00001111
                            00100101 -соответствует числу 37*/
        int xor2 =c^d;     /*11010110
                             11110001
                             00100111 -соответствует числу 39*/

        int not1 =~a;       /*00101010
                              11010101 - соответствует числу -43*/
        int not2 =~b;       /*00001111
                              11110000 -соответствет числу -16*/
        int not3 =~c;       /*11010110
                              00101001 - соответствует числу 41*/
        int not4 =~d;       /*11110001
                              00001110 - соответствует числу 14*/

        byte sdvigLevo1 = (byte) (a<<4);      /*00101010
                             получаем           10100000 - соответствует числу -96*/
        byte sdvigLevo2 = (byte) (b<<7);      /*00001111
                            получаем            10000000 - соответствует числу -128*/
        byte sdvigLevo3 = (byte) (c<<10);     /*11010110
                            получаем            00000000 - соответствует числу 0*/
        Short sdvigLevo4 = (short) (d<<9);    /*11110001
                              получаем          1110001000000000 - соответствует числу -7680*/

        byte sdvigPravo1 = (byte) (a>>4);      /*00101010
                             получаем            00001010 - соответствует числу 2*/
        byte sdvigPravo2 = (byte) (b>>6);      /*00001111
                            получаем             00000000 - соответствует числу 0*/
        byte sdvigPravo3 = (byte) (c>>10);     /*11010110
                            получаем             11111111 - соответствует числу -1*/
        Short sdvigPravo4 = (short) (d>>9);    /*11110001
                              получаем           1111111111111111 - соответствует числу -1*/

        int sdvigNulPravo1 = a>>>4;      /*00101010
                       получаем            00001010 - соответствует числу 2*/
        int sdvigNulPravo2 =b>>>6;      /*00001111
                     получаем             00000000 - соответствует числу 0*/
        int sdvigNulPravo3 =c>>>31;     /*11010110
                     получаем             00000001 - соответствует числу 1*/
        int sdvigNulPravo4 =d>>>3;    /*11110001
                     получаем  00011....11111110 - соответствует числу 536870910*/

        /*double k= 42.5;
        double sdvigLevo= (double) (k<<6);  побитовые операции с числом 42.5 не выполняются, поскольку побитовые операции применимы к целочисленным типам*/

    }
}
