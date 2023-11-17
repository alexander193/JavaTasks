package task1_0;

/*
 * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random(), который возвращает значение
 * в промежутке [0, 1].
 */

public class task1_0 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i <= a.length; i++) {
            a[i] += (Math.random() * 90) ;
        }
        for (int elem : a)
            System.out.println(elem);
    }
}