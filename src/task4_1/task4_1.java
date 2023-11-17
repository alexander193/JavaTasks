/*
* 4.1) Сделать некоторые классы абстрактными.
*/

package task4_1;

public class task4_1 {
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
