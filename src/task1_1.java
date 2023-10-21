/*
* Реализуйте алгоритм сортировки пузырьком для сортировки массива
*/
public class task1_1 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int)(Math.random() * 10000);
        }
        bubbleSort(array);
        for (int element : array)
            System.out.println(element);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    int element = array[j];
                    array[j] = array[j+1];
                    array[j+1] = element;
                }
            }
        }
    }
}
