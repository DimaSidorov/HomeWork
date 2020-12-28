package HomeWork2.sorts.Methods;

public class SortsMethod {

    /**
     *
     * @param container массив чисел
     * @return  Возвращает отсортированный по возрастанию массив, методом пузырьковой сортировки
     */

    public static int[] bubbleSorts(int[] container){
        boolean isSorts = false;
        int tmp = 0;
        while (!isSorts){
            isSorts = true;
            for (int i = 0; i < container.length-1; i++) {
                if(container[i] > container[i+1]){
                    tmp = container[i+1];
                    container[i+1] = container[i];
                    container[i] = tmp;
                    isSorts = false;
                }
            }
        }
        return container;
    }

    /**
     *
     * @param cont массив чисел
     * @return  Возвращает отсортированный по возрастанию массив, методом шейкерной сортировки
     */
    public static int[] shakerSorts(int[] cont){
        int tmp = 0;
        int leftSide = 0;
        int rightSide = cont.length-1;
        do{
            for (int i = leftSide; i < rightSide; i++){
                if (cont[i] > cont[i+1]){
                    tmp = cont[i];
                    cont[i] = cont[i+1];
                    cont[i+1] = tmp;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--){
                if(cont[i] < cont[i-1] ){
                    tmp = cont[i-1];
                    cont[i-1] = cont[i];
                    cont[i] = tmp;
                }
            }
            leftSide++;
        }while (leftSide < rightSide);
        return cont;
    }
}

