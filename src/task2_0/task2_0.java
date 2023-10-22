/*
 * Создайте класс, который описывает вектор (в трёхмерном пространстве).
 */
package task2_0;
public class task2_0 {
    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].length());
        System.out.println(vectors[0].scalarProduct(vectors[1]));
        System.out.println(vectors[0].crossProduct(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].sum(vectors[1]));
        System.out.println(vectors[0].subtract(vectors[1]));
    }
}

