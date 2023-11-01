/*
* Реализовать бинарное дерево поиска
*/

package task3_2;

public class task3_2 {
    public static void main(String[] args) {
        Binarytree tree = new Binarytree();
        tree.add(10);
        tree.add(7);
        tree.add(4);
        tree.add(15);
        tree.add(12);
        System.out.println(tree.check(3));
        System.out.println(tree.check(4));
        System.out.println(tree.check(5));
        System.out.println(tree.check(6));
        System.out.println(tree.check(7));
        System.out.println(tree.check(10));
    }
}
