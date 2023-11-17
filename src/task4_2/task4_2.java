/*
* 4.2) Реализовать с использованием интерфейсов. Дополнительно: реализовать интерфейс Comparable.
*/

package task4_2;

public class task4_2 {
    public static void main(String[] args) {
        Box box = new Box(1500.0);

        System.out.println(box.add(new Ball(2.5)));
        System.out.println(box.add(new Ball(4)));
        System.out.println(box.add(new Pyramid(5,5)));
        System.out.println(box.add(new Cylinder(5, 7)));
        System.out.println(box.add(new Ball(2)));
        System.out.println(box.add(new Cylinder(2, 3)));

        for (Shape shape : box.shapes)
            System.out.println(shape.getClass().toString().substring(14) + " " + shape.getVolume());

        System.out.println("Current volume is " + box.getCurrentVolume());
    }
}
