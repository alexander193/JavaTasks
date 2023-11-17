/*
* 4.0) Реализовать иерархию классов, описывающую трёхмерные фигуры
*
*
* 4.3) Добавьте в иерархию классов фигуру вращения для произвольной функции.
*/

package task4_0;

public class task4_0 {
    public static void main(String[] args) {
        Box box = new Box(200.0);

        System.out.println(box.add(new Ball(2.5)));
        System.out.println(box.getCurrentVolume());
        System.out.println(box.add(new Pyramid(5,5)));
        System.out.println(box.getCurrentVolume());
        Cylinder cylinder = new Cylinder(4, 5);
        System.out.println("cylinder.volume = " + cylinder.volume);
        System.out.println(box.add(cylinder));
        System.out.println(box.getCurrentVolume());
    }
}
