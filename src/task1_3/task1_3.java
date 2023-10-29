package task1_3;

import java.util.Arrays;

/*
 * Дан массив целых чисел и ещё одно целое число.
 * Удалите все вхождения этого числа из массива (пропусков быть не должно).
 */
public class task1_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 4, 5, 4, 4, 6};
        int[] newArray = removeElement(array, 4);
        for (int element : newArray) {
            System.out.println(element);
        }
    }
    public static int[] removeElement(int[] array, int element) {
        int offset = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                offset++;
            else
                array[i - offset] = array[i];
        }
        return Arrays.copyOf(array, array.length - offset);
    }
}
