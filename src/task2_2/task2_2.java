/*
 * Реализовать связный список.
 * Реализовать только методы add(), delete() и get().
 */

package task2_2;

public class task2_2 {
    public static void main(String[] args) {
        CustomList list = new CustomList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        for (int i = 0; i < list.getLength(); i++)
            System.out.println(list.get(i));

        list.delete(3);
        list.delete(6);
        list.add(10);
        System.out.println();

        for (int i = 0; i < list.getLength(); i++)
            System.out.println(list.get(i));
    }
}
