package HomeWork1;

public class DZ1_22 {
        static int a = 5;
        static int b = 2;
        static int c = 8;
        static boolean pravda = true;
        static boolean log = false;

        public static void main(String[] args) {
        double prim1 = a+((double)b/(double)c);
        double prim2 = (double) (a+b)/c;
        double prim3 = (double) (a+b++)/c;
        double prim4 = (a+b++)/--c;
        double prim5 = (double)(a*b>>b++)/--c;
        /*double prim6 = (a+7>20?68:22*b>>b++)/--c;
        double prim7 = (a+7>20?68>=68:22*b>>b++)/--c;
        boolean prim8 = 6-b>3&&12*12<=119;
        boolean prim9 =pravda&&log;*/
    }
}
