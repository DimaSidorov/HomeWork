package HomeWork1;

public class DZ4 {
    public static void main(String[] args) {
        Boolean whatIDo = sleepIn();
        if (whatIDo){
            System.out.println("Можем спать дальше");
        } else {
            System.out.println("Пора вставать на работу");
        }
    }
        public static Boolean sleepIn (){
            boolean weekDay = true;
            boolean vacation = true;
            if ((weekDay && vacation) || (!weekDay || vacation)) {
                return true;
            } else {
               return false;
            }
        }

}
