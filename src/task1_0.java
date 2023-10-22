/*
 * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random(), который возвращает значение
 * в промежутке [0, 1].
 */

public class task1_0 {
    public static void main(String[] args) {
        double[] array = new double[100];
        for (int i = 0; i < 100; i++) {
            array[i] = Math.random();
        }
        double min = 1, max = 0, sum = 0;
        for (double element : array) {
            if (min > element)
                min = element;
            if (max < element)
                max = element;
            sum += element;
        }
        System.out.print("Min value: " + min + "\nMax value: " + max + "\nAvg value: " + sum/100);
    }
}
