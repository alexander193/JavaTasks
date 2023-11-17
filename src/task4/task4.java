/*
* 4.0) Реализовать иерархию классов, описывающую трёхмерные фигуры
* 4.1) Сделать некоторые классы абстрактными.
* 4.2) Реализовать с использованием интерфейсов. Дополнительно: реализовать интерфейс Comparable.
* 4.3) Добавьте в иерархию классов фигуру вращения для произвольной функции.
*/

package task4;

public class task4 {
    public static void main(String[] args) {
        Box box = new Box(100.0);

        Ball ball = new Ball(2.0);
        System.out.println(ball.getVolume());

        System.out.println(box.add(ball));
        System.out.println(box.getCurrentVolume());
    }
}
