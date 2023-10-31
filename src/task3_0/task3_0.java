/*
* Напишите метод, который проверяет,
* входит ли в массив заданный элемент или нет.
* Используйте перебор и двоичный поиск для решения этой задачи.
* Сравните время выполнения обоих решений для больших массивов
* (например, 100000000 элементов).
*/

package task3_0;

import java.util.Arrays;

public class task3_0 {
    public static void main(String[] args) {
        int elementsAmount = 100000000;
        int[] array = new int[elementsAmount];
        for (int i = 0; i < elementsAmount; i++)
            array[i] = (int) (Math.random() * elementsAmount);

        int[] sortedArray = Arrays.copyOfRange(array, 0, array.length);

        long timeBoolSearchWithSort = System.currentTimeMillis();
        Arrays.sort(sortedArray);

        int searchingValue = 65834536;
        System.out.println("Ищем элемент: " + searchingValue + "\n");

        long timeBoolSearch = System.currentTimeMillis();
        System.out.println("Бинарный поиск: " + boolSearch(sortedArray, searchingValue)
                + "\nВремя: " + (System.currentTimeMillis() - timeBoolSearch) + "мс"
                + "\nВремя с учетом сортировки массива: " + (System.currentTimeMillis() - timeBoolSearchWithSort) + "мс");
        long timeSearch = System.currentTimeMillis();
        System.out.println("\nПеребор элементов: " + search(sortedArray, searchingValue) + "\nВремя: " + (System.currentTimeMillis() - timeSearch) + "мс");
    }

    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == value)
                return i;
        return -1;
    }

    public static int boolSearch(int[] sortedArray, int value) {
        int start = 0, end = sortedArray.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (sortedArray[middle] == value)
                return middle;
            else if (sortedArray[middle] > value)
                end = middle - 1;
            else if (sortedArray[middle] < value)
                start = middle + 1;
        }
        return -1;
    }
}
